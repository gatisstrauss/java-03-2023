package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> lines = Files.readAllLines(path, charset);
        Map<String, List<String>> flightMap = processFlights(lines);
        displayOptions(flightMap);
    }

    private static Map<String, List<String>> processFlights(List<String> lines) {
        Map<String, List<String>> flightMap = new HashMap<>();
        for (String line : lines) {
            line = line.trim();
            if (!line.isEmpty()) {
                String[] cities = line.split("->");
                String origin = cities[0].trim();
                String destination = cities[1].trim();
                flightMap.computeIfAbsent(origin, k -> new ArrayList<>()).add(destination);
            }
        }
        return flightMap;
    }

    private static void displayOptions(Map<String, List<String>> flightMap) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to do?");
        System.out.println("To display the list of cities, press 1");
        System.out.println("To exit the program, press #");

        String userInput = scanner.nextLine().trim();
        if (userInput.equals("1")) {
            System.out.println("Available cities:");
            for (String city : flightMap.keySet()) {
                System.out.println(city);
            }
            System.out.println("To select a city from which you would like to start, press 1");

            userInput = scanner.nextLine().trim();
            if (userInput.equals("1")) {
                System.out.print("Enter the starting city: ");
                String startCity = scanner.nextLine().trim();

                List<String> route = new ArrayList<>();
                route.add(startCity);
                String currentCity = startCity;

                while (true) {
                    List<String> destinations = flightMap.get(currentCity);
                    if (destinations != null && !destinations.isEmpty()) {
                        System.out.println("Destinations from " + currentCity + ":");
                        for (String destination : destinations) {
                            System.out.println(destination);
                        }
                        System.out.print("Select the next city or press # to finish the route: ");
                        userInput = scanner.nextLine().trim();
                        if (userInput.equals("#")) {
                            break;
                        } else {
                            if (destinations.contains(userInput)) {
                                route.add(userInput);
                                currentCity = userInput;
                            } else {
                                System.out.println("Invalid city selection. Please try again.");
                            }
                        }
                    } else {
                        System.out.println("No destinations available from " + currentCity);
                        break;
                    }
                }

                if (route.size() > 1 && route.get(0).equals(route.get(route.size() - 1))) {
                    System.out.println("Round-trip route selected:");
                    for (String city : route) {
                        System.out.println(city);
                    }
                } else {
                    System.out.println("No valid round-trip route selected.");
                }
            } else {
                System.out.println("Invalid option. Program exiting.");
            }
        } else if (userInput.equals("#")) {
            System.out.println("Program exiting.");
        } else {
            System.out.println("Invalid option. Program exiting.");
        }
    }
}