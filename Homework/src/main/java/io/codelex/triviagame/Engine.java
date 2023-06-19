package io.codelex.triviagame;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class Engine {
    private static final int MAX_SCORE = 20;
    private final HashSet<Integer> usedNumbers;
    private int score;
    private int answeredQuestions;
    private final Random random;

    public Engine() {
        usedNumbers = new HashSet<>();
        score = 0;
        answeredQuestions = 0;
        random = new Random();
    }

    public void start() {
        System.out.println("Welcome to the Trivia game!\nLet's test your knowledge.");

        while (score < MAX_SCORE) {
            int number = generateRandomNumber();

            String triviaQuestion = getQuestion(number);

            String question = convertToQuestion(triviaQuestion);
            String correctAnswer = extractCorrectAnswer(triviaQuestion);
            List<String> answerChoices = generateAnswerChoices(correctAnswer);

            displayQuestionAndChoices(question, answerChoices);

            String userAnswer = getUserInput();

            try {
                validateAnswer(userAnswer, correctAnswer, triviaQuestion);
                System.out.println("Correct!");
                score++;
            } catch (IncorrectAnswerException e) {
                System.out.println("Incorrect!");
                System.out.println("The correct answer is: " + correctAnswer);
                System.out.println();
                break;
            } catch (InvalidChoiceException e) {
                System.out.println("Invalid choice! Please choose A, B, C, or D.");
                System.out.println();
            }

            answeredQuestions++;
        }

        if (score == MAX_SCORE) {
            System.out.println("\nCongratulations! You answered 20 questions correctly!");
        } else {
            System.out.println("\nGame Over! You answered " + score + " questions correctly.");
        }
    }

    private int generateRandomNumber() {
        return random.nextInt(100) + 1;
    }

    private String getQuestion(int number) {
        String apiUrl = GameURL.getApiUrl(number, "trivia");

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                Scanner scanner = new Scanner(connection.getInputStream());
                StringBuilder response = new StringBuilder();

                while (scanner.hasNextLine()) {
                    response.append(scanner.nextLine());
                }

                scanner.close();
                return response.toString();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    private String convertToQuestion(String triviaFact) {
        int firstSpaceIndex = triviaFact.indexOf(' ');
        if (firstSpaceIndex != -1) {
            int secondSpaceIndex = triviaFact.indexOf(' ', firstSpaceIndex + 1);
            if (secondSpaceIndex != -1) {
                String question = triviaFact.substring(secondSpaceIndex + 1).trim();
                if (question.endsWith(".")) {
                    question = question.substring(0, question.length() - 1);
                }
                return question;
            }
        }
        return triviaFact.trim();
    }

    private String extractCorrectAnswer(String triviaFact) {
        String[] words = triviaFact.split(" ");
        if (words.length > 0) {
            String answer = words[0].trim();
            if (answer.endsWith(".")) {
                answer = answer.substring(0, answer.length() - 1);
            }
            return answer;
        }
        return "";
    }

    private List<String> generateAnswerChoices(String correctAnswer) {
        List<String> answerChoices = new ArrayList<>();

        answerChoices.add(correctAnswer);

        for (int i = 0; i < 3; i++) {
            String incorrectAnswer = generateIncorrectAnswer();
            answerChoices.add(incorrectAnswer);
        }

        Collections.shuffle(answerChoices);
        return answerChoices;
    }

    private String generateIncorrectAnswer() {
        int randomNumber = random.nextInt(100) + 1;
        return String.valueOf(randomNumber);
    }

    private void displayQuestionAndChoices(String question, List<String> answerChoices) {
        System.out.println("\nQuestion " + (answeredQuestions + 1) + ": " + question);
        System.out.println("Choose the correct answer (A, B, C, or D):");
        System.out.println("A. " + answerChoices.get(0));
        System.out.println("B. " + answerChoices.get(1));
        System.out.println("C. " + answerChoices.get(2));
        System.out.println("D. " + answerChoices.get(3));
    }

    private String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim().toUpperCase();
    }

    private void validateAnswer(String userAnswer, String correctAnswerChoice, String triviaFact)
            throws IncorrectAnswerException, InvalidChoiceException {
        if (!userAnswer.equalsIgnoreCase("A") && !userAnswer.equalsIgnoreCase("B") &&
                !userAnswer.equalsIgnoreCase("C") && !userAnswer.equalsIgnoreCase("D")) {
            throw new InvalidChoiceException();
        }
        String correctAnswer = triviaFact.split(" ")[0];
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct!");
            score++;
        } else {
            throw new IncorrectAnswerException("");
        }
    }
}