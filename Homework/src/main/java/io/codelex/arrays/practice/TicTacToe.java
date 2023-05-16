package io.codelex.arrays.practice;

import java.awt.*;
import java.util.Scanner;

public class TicTacToe {

    // Šādu programmu pats vēl neesmu spējīgs izdomāt, zināju loģiku,
    // bet uzrakstīt pats bez palīdzības nespēju :(

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        initBoard();
        displayBoard();
        int player = 1;

        while (!gameOver()){
            int move = getPlayerMove(player, keyboard);
            player = (player == 1) ? 2 : 1;
            displayBoard();
        }


    }


    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static int getPlayerMove(int player, Scanner keyboard) {

        int row;
        int column;
        char symbol;
        if (player == 1) {
            symbol = 'X';
            System.out.println("'X', choose your location (row, column): ");
        } else {
            symbol = 'O';
            System.out.println("'O', choose your location (row, column): ");
        }
        row = keyboard.nextInt() - 1;
        column = keyboard.nextInt() - 1;

        while (board[row][column] != ' ') {
            System.out.println("This position is taken, try again...");
            row = keyboard.nextInt() - 1;
            column = keyboard.nextInt() - 1;
        }
        board[row][column] = symbol;
        return player;
    }

    public static boolean win() {
        for (int r = 0; r < 3; r++) {
            if (board[r][0] == board[r][1] && board[r][1] == board[r][2] && board[r][0] != ' ') {
                return true;
            }
        }
        for (int c = 0; c < 3; c++) {
            if (board[0][c] == board[1][c] && board[1][c] == board[2][c] && board[0][c] != ' ') {
                return true;
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            return true;
        }
        return false;
    }

    public static boolean gameOver() {
        if (win()) {
            System.out.println("Game over");
            return true;
        }
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == ' ') {
                    return false;
                }
            }
        }
        System.out.println("The game is a tie.");
        return true;
    }
}