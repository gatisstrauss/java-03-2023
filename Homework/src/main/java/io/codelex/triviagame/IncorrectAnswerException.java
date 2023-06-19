package io.codelex.triviagame;

public class IncorrectAnswerException extends Exception {
    private final String correctAnswer;

    public IncorrectAnswerException(String correctAnswer) {
        super("Incorrect answer");
        this.correctAnswer = correctAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
