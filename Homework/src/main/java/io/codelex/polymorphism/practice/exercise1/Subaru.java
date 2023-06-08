package io.codelex.polymorphism.practice.exercise1;

public class Subaru implements Car {

    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 11;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 11;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Ra ta ta ta ta...");
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
