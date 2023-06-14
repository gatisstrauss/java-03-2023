package io.codelex.javaadvancedtest.exercise5;

import java.util.List;

import static io.codelex.javaadvancedtest.exercise5.Filter.partOf;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("John", "Peter", "Angelina", "Bravo");
        double percent = partOf(names, name -> name.length() > 4);
        System.out.println(percent);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        double evenPercent = partOf(numbers, n -> n % 2 == 0);
        System.out.println(evenPercent);
    }
}
