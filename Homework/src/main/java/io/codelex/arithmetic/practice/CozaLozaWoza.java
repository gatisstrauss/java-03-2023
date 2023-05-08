package io.codelex.arithmetic.practice;

public class CozaLozaWoza {
    public static void main(String[] args) {

        boolean taken;
        for (int i = 1; i <= 110; i++) {
            taken = false;

            if (i % 3 == 0) {
                System.out.print("Coza");
                taken = true;
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
                taken = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                taken = true;
            }
            if (!taken) {
                System.out.print(i);
            }
            System.out.print(" ");

            if (i % 11 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}

