package io.codelex.arrays.practice;

import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] words = {"football", "basketball", "hockey", "boxing", "volleyball", "swimming"};

        do {

        String oneOfTheWords = words[random.nextInt(words.length)];
        boolean[] guessedLetters = new boolean[oneOfTheWords.length()];
        int guesses = 5;

        while (guesses > 0 && !allLettersGuessed(guessedLetters)) {
            System.out.println("Guesses remaining: " + guesses);
            System.out.println("Word(type of sports): ");
            for (int i = 0; i < oneOfTheWords.length(); i++) {
                if (guessedLetters[i]) {
                    System.out.print(oneOfTheWords.charAt(i));
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            String input = scanner.nextLine();

            if (input.length() > 1) {
                System.out.println("Enter only one letter at a time!");
                continue;
            }
            char guess = input.charAt(0);

            boolean found = false;

            for (int i = 0; i < oneOfTheWords.length(); i++) {
                if (oneOfTheWords.charAt(i) == guess) {
                    guessedLetters[i] = true;
                    found = true;
                }
            }
            if (!found){
                System.out.println("Oops, this letter is not in the word");
                guesses--;
            }
        }
        if (guesses == 0){
            System.out.println("You lost\n The word was: " + oneOfTheWords);
        } else {
            System.out.println("YOU GOT IT!");
        }
        System.out.println("Play 'again' or 'quit'?");

        } while (scanner.nextLine().equalsIgnoreCase("again"));

    }

    public static boolean allLettersGuessed(boolean[] guessedLetters) {
        for (boolean guessed : guessedLetters) {
            if (!guessed) {
                return false;
            }
        }
        return true;
    }
}
