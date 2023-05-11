package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word:");
        String firstWord = scanner.next();
        System.out.println("Enter the second word:");
        String secondWord = scanner.next();

        String result = firstWord + "" + secondWord;
        int lineLength = result.length();
        int dotCount = 0;

        if (lineLength <= 30) {
            dotCount = 30 - lineLength;

            String dots = "";

            for (int i = 1; i <= dotCount; i++) {
                dots += ".";

            }
            System.out.println(firstWord + dots + secondWord);
        }
    }
}
