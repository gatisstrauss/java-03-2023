package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        int minutesInAYear = 60 * 24 * 365;
        int minutesInADay = 60 * 24;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        int input = scanner.nextInt();

        int years = input / minutesInAYear;
        int days = input / minutesInADay;

        System.out.println(input + " minutes is about " + years + " years and " + days + " days");


    }
}
