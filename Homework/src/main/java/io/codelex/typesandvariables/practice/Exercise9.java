package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double timeSeconds;
        double metersPerSecond;
        double milesPerHour;
        double kilometersPerHour;

        System.out.println("Test Data");
        System.out.println("Input distance in meters");
        double distance = scanner.nextDouble();
        System.out.println("Input hours");
        double hours = scanner.nextDouble();
        System.out.println("Input minutes");
        double minutes = scanner.nextDouble();
        System.out.println("Input seconds");
        double seconds = scanner.nextDouble();

        timeSeconds = (hours * 3600) + (minutes * 60) + seconds;
        metersPerSecond = distance / timeSeconds;
        kilometersPerHour = (distance / 1000.0) / (timeSeconds / 3600);
        milesPerHour = kilometersPerHour / 1.609;

        System.out.println("Your speed in meters/second is " + metersPerSecond);
        System.out.println("Your speed in km/h is " + kilometersPerHour);
        System.out.println("Your speed in miles/h is " + milesPerHour);
    }
}
