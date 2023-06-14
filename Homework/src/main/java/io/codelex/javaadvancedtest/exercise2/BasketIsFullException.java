package io.codelex.javaadvancedtest.exercise2;

public class BasketIsFullException extends RuntimeException {
    public BasketIsFullException(String message){
        super(message);
    }
}
