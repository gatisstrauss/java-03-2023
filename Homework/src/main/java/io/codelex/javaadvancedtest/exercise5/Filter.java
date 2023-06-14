package io.codelex.javaadvancedtest.exercise5;

import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public static <T> double partOf(List<T> list, Predicate<T> condition){
        long desiredCondition = list.stream().filter(condition).count();
        return (double) desiredCondition / list.size();
    }
}
