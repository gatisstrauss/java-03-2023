package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        List<Sound> soundList = new ArrayList<>();
        Parrot parrot1 = new Parrot("Where is my cracker!?");
        Parrot parrot2 = new Parrot("Praaaaap...");
        Radio radio1 = new Radio("This is European Hit Radio");
        Radio radio2 = new Radio("Baby don't hurt me.... no more");
        Firework firework1 = new Firework("swooooosh...bang");
        Firework firework2 = new Firework("BANG...BANG...BANG");

        soundList.add(parrot1);
        soundList.add(parrot2);
        soundList.add(radio1);
        soundList.add(radio2);
        soundList.add(firework1);
        soundList.add(firework2);

        for (Sound sound : soundList) {
            sound.playSound();
        }
    }
}
