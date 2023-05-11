package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Desired sum:");
        int sum = scanner.nextInt();
        Random random = new Random();

        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int diceSum = dice1 + dice2;
        System.out.println(dice1 + " and " + dice2 + " = " + diceSum);

        while (diceSum != sum){
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            diceSum = dice1 + dice2;
            System.out.println(dice1 + " and " + dice2 + " = " + diceSum);
        }


    }
}
