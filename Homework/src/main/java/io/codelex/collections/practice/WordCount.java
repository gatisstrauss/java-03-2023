package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> lines = Files.readAllLines(path, charset);
        List<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\s+");

        for (String line : lines) {
            String[] wordArray = pattern.split(line);
            words.addAll(Arrays.asList(wordArray));
        }
        int lineCount = lines.size();
        int wordCount = words.size();
        int charCount = lines.stream().mapToInt(String::length).sum();

        System.out.println("Lines = " + lineCount);
        System.out.println("Words = " + wordCount);
        System.out.println("Chars = " + charCount);
    }
}
