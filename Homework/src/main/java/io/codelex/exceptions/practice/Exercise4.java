package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            double d = getInput(input);
            double root = Math.sqrt(d);
            System.out.println("The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number as first parameter.");
        }
//        todo -
        catch (NonPositiveNumberException e) {
            System.out.println("Result will be imaginary number.");
        }

    }

    static double getInput(String s) throws NonPositiveNumberException {
        double d = Double.parseDouble(s);
        // Throw an NonPositiveNumberException if d is less than 0
        if (d < 0) {
            throw new NonPositiveNumberException("Result will be imaginary number.");
        }
        return d;
    }
}
