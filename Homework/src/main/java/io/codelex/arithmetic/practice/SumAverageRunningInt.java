package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        long sum = 0L;
        double average;
        int lowerBound = 1;
        int upperBound = 100;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
        }
        average = (double) sum / upperBound;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
}
