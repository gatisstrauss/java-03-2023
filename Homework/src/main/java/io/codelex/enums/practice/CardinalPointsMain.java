package io.codelex.enums.practice;

public class CardinalPointsMain {
    public static void main(String[] args) {

        for (CardinalPoints direction : CardinalPoints.values()) {
            System.out.println(direction + ": " + direction.getText() + ": " + direction.ordinal());
        }
    }
}
