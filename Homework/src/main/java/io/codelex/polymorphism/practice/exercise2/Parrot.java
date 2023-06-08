package io.codelex.polymorphism.practice.exercise2;

public class Parrot implements Sound {

    private final String sound;

    public Parrot(String sound) {
        this.sound = sound;
    }

    @Override
    public void playSound() {
        System.out.println("Parrot: " + sound);
    }
}
