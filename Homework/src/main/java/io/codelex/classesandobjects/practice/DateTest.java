package io.codelex.classesandobjects.practice;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(21, 01, 1997);
        date.displayDate();

        date.setDay(2);
        date.setYear(2001);
        date.setMonth(12);
        date.displayDate();
    }
}
