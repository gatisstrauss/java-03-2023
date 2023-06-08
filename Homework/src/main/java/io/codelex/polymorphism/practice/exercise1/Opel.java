package io.codelex.polymorphism.practice.exercise1;

public class Opel implements Car {

    Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 2;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 2;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Kle kle kle kle...");
    }

    @Override
    public void honk() {
        Car.super.honk();
    }

    @Override
    public void washWindows() {
        Car.super.washWindows();
    }
}
