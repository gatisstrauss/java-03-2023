package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter the numerator: ");
                String numeratorInput = scanner.nextLine();

                if (numeratorInput.equalsIgnoreCase("quit")) {
                    break;
                }
                int numerator = Integer.parseInt(numeratorInput);

                System.out.print("Enter the divisor: ");
                int divisor = Integer.parseInt(scanner.nextLine());

                int quotient = numerator / divisor;
                System.out.println(numerator + " / " + divisor + " is " + quotient);
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data. Please try again.");
            } catch (ArithmeticException e) {
                System.out.println("You can't divide by zero.");
            }
        }
    }
}
