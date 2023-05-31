package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyOrNot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        boolean isHappyNumber = isHappy(number);

        if (isHappyNumber) {
            System.out.println("Happy number");
        } else {
            System.out.println("Sad number");
        }

    }

    private static boolean isHappy(int number) {
        Set<Integer> iteratingNumbers = new HashSet<>();

        while (number != 1 && !iteratingNumbers.contains(number)) {
            iteratingNumbers.add(number);
            number = sumOfSquares(number);
        }
        return number == 1;
    }

    private static int sumOfSquares(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }
}
