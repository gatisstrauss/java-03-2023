package io.codelex.javaadvancedtest.exercise4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReversedFile {
    private static final String PATH_TO_FILE = "/Users/gatisstrauss/Desktop/Appearance.txt";

    public static void main(String[] args) {
        try {
            File file = new File(PATH_TO_FILE);
            StringBuilder stringBuilder = new StringBuilder();
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH_TO_FILE))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    stringBuilder.append(line).append(System.lineSeparator());
                }
            }
            stringBuilder.reverse();
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
