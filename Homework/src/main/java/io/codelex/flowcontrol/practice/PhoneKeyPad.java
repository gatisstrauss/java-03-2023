package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String character;
        System.out.println("Enter a series of characters:");
        character = scanner.next().toLowerCase();

        int digit = 0;
        for (int i = 0; i < character.length(); i++) {
//            if (character.charAt(i) == 'a' || character.charAt(i) == 'b' || character.charAt(i) == 'c') {
//                System.out.print(digit = 2);
//            } else if (character.charAt(i) == 'd' || character.charAt(i) == 'e' || character.charAt(i) == 'f') {
//                System.out.print(digit = 3);
//            } else if (character.charAt(i) == 'g' || character.charAt(i) == 'h' || character.charAt(i) == 'i') {
//                System.out.print(digit = 4);
//            } else if (character.charAt(i) == 'j' || character.charAt(i) == 'k' || character.charAt(i) == 'l') {
//                System.out.print(digit = 5);
//            } else if (character.charAt(i) == 'm' || character.charAt(i) == 'n' || character.charAt(i) == 'o') {
//                System.out.print(digit = 6);
//            } else if (character.charAt(i) == 'p' || character.charAt(i) == 'q' || character.charAt(i) == 'r' || character.charAt(i) == 's') {
//                System.out.print(digit = 7);
//            } else if (character.charAt(i) == 't' || character.charAt(i) == 'u' || character.charAt(i) == 'v') {
//                System.out.print(digit = 8);
//            } else if (character.charAt(i) == 'w' || character.charAt(i) == 'x' || character.charAt(i) == 'y' || character.charAt(i) == 'z') {
//                System.out.print(digit = 9);
//            } else {
//                System.out.println("Invalid input");
//            }
//        }
            switch (character.charAt(i)) {
                case 'a', 'b', 'c' -> digit = 2;
                case 'd', 'e', 'f' -> digit = 3;
                case 'g', 'h', 'i' -> digit = 4;
                case 'j', 'k', 'l' -> digit = 5;
                case 'm', 'n', 'o' -> digit = 6;
                case 'p', 'q', 'r', 's' -> digit = 7;
                case 't', 'u', 'v' -> digit = 8;
                case 'w', 'x', 'y', 'z' -> digit = 9;

                default -> System.out.print("Invalid input");

//               Šo pierakstu likās vieglāk rakstīt :)
            }
            System.out.print(digit);
        }
    }
}
