package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i;
        int n;
        int result = 1;

        Scanner in = new Scanner(System.in);
        System.out.print("Input number of terms : ");
        n = in.nextInt();


//        todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()
        for (i = 1; i <= n; i++) {
            result *= n;
            System.out.println(result);
        }

    }

}
