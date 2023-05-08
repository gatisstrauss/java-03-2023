package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("This number is 0");
        } else if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd number");
        }
        System.out.println("Bye!");
    }
}
