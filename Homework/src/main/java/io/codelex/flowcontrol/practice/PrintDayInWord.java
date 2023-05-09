package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to represent the day of the week:");

        if (scanner.hasNextInt()) {
            int dayNumber = scanner.nextInt();

            switch (dayNumber) {
                case 0 -> System.out.println("Monday");
                case 1 -> System.out.println("Tuesday");
                case 2 -> System.out.println("Wednesday");
                case 3 -> System.out.println("Thursday");
                case 4 -> System.out.println("Friday");
                case 5 -> System.out.println("Saturday");
                case 6 -> System.out.println("Sunday");

                default -> System.out.println("Not a valid day");

//            if (dayNumber == 0) {
//                System.out.println("Monday");
//            } else if (dayNumber == 1) {
//                System.out.println("Tuesday");
//            } else if (dayNumber == 2) {
//                System.out.println("Wednesday");
//            } else if (dayNumber == 3) {
//                System.out.println("Thursday");
//            } else if (dayNumber == 4) {
//                System.out.println("Friday");
//            } else if (dayNumber == 5) {
//                System.out.println("Saturday");
//            } else if (dayNumber == 6) {
//                System.out.println("Sunday");
//            } else {
//                System.out.println("Not a valid day");
//            }
            }
        }
    }
}
