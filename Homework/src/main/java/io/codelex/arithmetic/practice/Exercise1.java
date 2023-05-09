package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();
        System.out.println("The result is: " + calculate(number1, number2));
    }

    private static boolean calculate(int number1, int number2) {
        return (number1 == 15 || number2 == 15 || (number1 + number2) == 15 || (number1 - number2) == 15);

    }
}
