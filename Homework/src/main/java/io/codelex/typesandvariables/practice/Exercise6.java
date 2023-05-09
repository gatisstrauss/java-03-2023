package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a series of single digits:");
        int input = scanner.nextInt();
        int digits;
        int total = 0;
        while (input > 0) {
            digits = input % 10;
            total = total + digits;
            input = input / 10;
        }
        System.out.println("The sum of the entered numbers is " + total);

    }
}
