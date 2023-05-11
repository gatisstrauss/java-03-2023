package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Min:");
        int min = scanner.nextInt();
        System.out.println("Max:");
        int max = scanner.nextInt();

        for (int i = min; i <= max; i++){
            for (int j = i; j <= max; j++){
                System.out.print(j);
            }
            for (int k = 0; k < i - min; k++){
                System.out.print(k + min);
            }
            System.out.println();
        }
    }
}
