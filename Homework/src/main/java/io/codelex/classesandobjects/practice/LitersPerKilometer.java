package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double startKilometers1, endKilometers1, liters1;
        double startKilometers2, endKilometers2, liters2;

        System.out.print("Enter first reading: ");
        startKilometers1 = scan.nextDouble();

        System.out.print("Enter second reading: ");
        endKilometers1 = scan.nextDouble();

        System.out.println("Enter litres consumed: ");
        liters1 = scan.nextDouble();

        Car car1 = new Car(startKilometers1);
        car1.fillUp((int) endKilometers1, liters1);

        System.out.println("Kilometers per liter are " + car1.calculateConsumption());
        if (car1.gasHog()) {
            System.out.println("This car is a gas hog");
        }

        if (car1.economyCar()) {
            System.out.println("This car is economical");
        }


        System.out.print("Enter first reading: ");
        startKilometers2 = scan.nextDouble();

        System.out.print("Enter second reading: ");
        endKilometers2 = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters2 = scan.nextDouble();

        Car car2 = new Car(startKilometers2);
        car2.fillUp((int) endKilometers2, liters2);

        System.out.println("Kilometers per liter are " + car2.calculateConsumption());

        if (car2.gasHog()) {
            System.out.println("This car is a gas hog");
        }

        if (car2.economyCar()) {
            System.out.println("This car is economical");
        }
    }
}
