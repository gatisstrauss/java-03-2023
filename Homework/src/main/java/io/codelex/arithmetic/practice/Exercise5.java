package io.codelex.arithmetic.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        int answer;
        int guess;
        int maxValue = 100;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        answer = random.nextInt(maxValue) + 1;
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        guess = scanner.nextInt();

        if (guess > answer) {
            System.out.println("Sorry, you are too high.  I was thinking of " + answer);
        } else if (guess < answer) {
            System.out.println("Sorry, you are too low.  I was thinking of " + answer);
        } else {
            System.out.println("You guessed it!  What are the odds?!?");

        }
    }
}
