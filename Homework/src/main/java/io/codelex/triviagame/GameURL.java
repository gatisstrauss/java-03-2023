package io.codelex.triviagame;

public class GameURL {
    public static String getApiUrl(int number, String type) {
        return "http://numbersapi.com/" + number + "/" + type;
    }
}
