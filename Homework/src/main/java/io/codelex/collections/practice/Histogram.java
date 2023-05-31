package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        final Map<Integer, Integer> frequencyMap = generateHistogram(scores);
        printHistogram(frequencyMap);
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private static Map<Integer, Integer> generateHistogram(String scores) {
        Map<Integer, Integer> histogram = new HashMap<>();
        String[] scoreArray = scores.split(" ");
        for (String score : scoreArray) {
            int value = Integer.parseInt(score);
            int range = (value / 10) * 10;
            histogram.put(range, histogram.getOrDefault(range, 0) + 1);
        }
        return histogram;
    }

    private static void printHistogram(Map<Integer, Integer> frequencyMap) {
        for (int i = 0; i < 100; i += 10) {
            int end = i + 9;
            String range = String.format("%02d-%02d:", i, end);
            int frequency = frequencyMap.getOrDefault(i, 0);
            String stars = "*".repeat(frequency);
            System.out.println(range + " " + stars);
        }
        System.out.println("  100: " + "*".repeat(frequencyMap.getOrDefault(100, 0)));
    }
}



