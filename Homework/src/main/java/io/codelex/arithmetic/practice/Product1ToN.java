package io.codelex.arithmetic.practice;

public class Product1ToN {
    public static void main(String[] args) {

        int number = 10;
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 10 is " + factorial);
    }
}
