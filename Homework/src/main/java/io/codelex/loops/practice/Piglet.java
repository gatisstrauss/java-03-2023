package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to Piglet!");


        int dice;
        int playerScore = 0;
        char input;

        do {
            dice = random.nextInt(6) + 1;
            System.out.println("You rolled " + dice);

            if (dice == 1) {
                System.out.println("You got 0 points");

            } else {
                playerScore += dice;
                System.out.println("Roll again? ");
                input = scanner.next().charAt(0);
                if (input == 'n') {
                    System.out.println("You got " + playerScore + " points");
                    break;
                }

            }
        } while (dice != 1);


    }


}

