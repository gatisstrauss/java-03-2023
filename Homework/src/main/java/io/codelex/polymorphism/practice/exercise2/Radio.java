package io.codelex.polymorphism.practice.exercise2;

public class Radio implements Sound {

    private final String sound;

    public Radio(String sound) {
        this.sound = sound;
    }

    @Override
    public void playSound() {
        System.out.println("Radio: " + sound);
    }
}
