package io.codelex.exceptions.practice;

public class Exercise2 {
    public void methodA() throws ArithmeticException {
//        int result = 10/0;
        try {
            methodB();
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            throw e;
        }
    }

    public void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            throw e;
        }
    }

    public void methodC() throws ArithmeticException {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            throw e;
        }

    }

    public static void main(String[] args) {
        Exercise2 exercise = new Exercise2();

        try {
            exercise.methodA();
        } catch (ArithmeticException e) {
            e.printStackTrace();

        }

    }
}
