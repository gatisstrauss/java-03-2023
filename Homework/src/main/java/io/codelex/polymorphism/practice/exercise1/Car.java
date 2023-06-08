package io.codelex.polymorphism.practice.exercise1;

public interface Car {
    void speedUp();

    void slowDown();

    String showCurrentSpeed();

    void startEngine();

    default void honk() {
        System.out.println("Beep!!!");
    }

    default void washWindows() {
        System.out.println("Windows cleaned!");
    }
}
