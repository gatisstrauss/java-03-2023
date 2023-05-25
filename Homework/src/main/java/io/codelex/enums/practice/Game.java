package io.codelex.enums.practice;

import java.util.Random;
import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int totalGames = 0;
    int playerWins = 0;
    int computerWins = 0;

    public void playGame() {

        System.out.println("Let us begin...");
        System.out.println("Rock-Paper-Scissors");

        while (true) {
            System.out.println("Your turn (Enter s for scissors, p for paper, r for rock, q to quit): ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("q")) {
                break;
            }
            if (!input.matches("[rps]")) {
                System.out.println("Invalid input, try again... ");
                continue;
            }
            Options playerMove = switch (input) {
                case "r" -> Options.ROCK;
                case "p" -> Options.PAPER;
                default -> Options.SCISSORS;
            };
            Options computerMove = getRandomMove(random);
            System.out.println("My turn: " + computerMove);
            System.out.println(playRound(playerMove, computerMove));

            totalGames++;
            if (playRound(playerMove, computerMove).equals("You won!")) {
                playerWins++;
            } else if (playRound(playerMove, computerMove).equals("I won!")) {
                computerWins++;
            }
        }

        System.out.println("\nNumber of trials: " + totalGames);
        System.out.printf("I won %d (%.2f%%). You won %d (%.2f%%).\n",
                computerWins, (double) computerWins / totalGames * 100,
                playerWins, (double) playerWins / totalGames * 100);
        System.out.println("Bye!");
    }

    private static Options getRandomMove(Random random) {
        int index = random.nextInt(3);
        return Options.values()[index];
    }

    private static String playRound(Options playerMove, Options computerMove) {
        if (playerMove == computerMove) {
            return "Tie!";
        }
        if ((playerMove == Options.SCISSORS && computerMove == Options.PAPER) ||
                (playerMove == Options.PAPER && computerMove == Options.ROCK) ||
                (playerMove == Options.ROCK && computerMove == Options.SCISSORS)) {
            return "You won!";
        }
        return "I won!";
    }
}
