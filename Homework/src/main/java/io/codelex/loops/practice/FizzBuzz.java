package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the maximum value:");
        int input = scanner.nextInt();

        boolean taken;

        for (int i = 1; i <= input; i++) {
            taken = false;

            if (i % 3 == 0) {
                System.out.print("Fizz");
                taken = true;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                taken = true;
            }
            if (i % 20 == 0) {
                System.out.println();
            }

            if (!taken) {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}
