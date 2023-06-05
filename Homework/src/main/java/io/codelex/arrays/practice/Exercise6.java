package io.codelex.arrays.practice;

import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {

        int[] myArray = new int[10];
        int[] myOtherArray = new int[myArray.length];
        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
        }
        for (int i = 0; i < myOtherArray.length; i++) {
            myOtherArray[i] = myArray[i];
        }

        myArray[9] = -7;
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myOtherArray[i] + " ");
        }


    }
}
