package io.codelex.polymorphism.practice.exercise2;

class Firework implements Sound {
    private final String sound;

    public Firework(String sound) {
        this.sound = sound;
    }

    public void playSound() {
        System.out.println("Firework: " + sound);
    }
}
