package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        Subaru subaru = new Subaru();
        Opel opel = new Opel();
        Lexus lexus = new Lexus();
        Tesla tesla = new Tesla();
        Audi audi = new Audi();
        Bmw bmw = new Bmw();

        List<Car> carList = new ArrayList<>();
        carList.add(subaru);
        carList.add(opel);
        carList.add(lexus);
        carList.add(tesla);
        carList.add(audi);
        carList.add(bmw);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Count: " + i);
            for (Car car : carList) {
                car.startEngine();
                car.speedUp();
                car.honk();
                car.washWindows();
                System.out.println("Current speed is " + car.showCurrentSpeed());

                if (i == 3 && car instanceof Boost boost) {
                    boost.useNitrousOxideEngine();
                }
            }
            System.out.println();
        }
        Car fastestCar = null;
        int highestSpeed = 0;

        for (Car car : carList){
            int speed = Integer.parseInt(car.showCurrentSpeed());
            if (speed > highestSpeed){
                highestSpeed = speed;
                fastestCar = car;
            }
        }

        assert fastestCar != null;
        System.out.println("Fastest car is " + fastestCar.getClass().getSimpleName());
        System.out.println("Highest speed is " + fastestCar.showCurrentSpeed());
    }
}
