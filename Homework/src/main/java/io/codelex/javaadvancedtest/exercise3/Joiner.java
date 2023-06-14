package io.codelex.javaadvancedtest.exercise3;

import java.util.Arrays;

public class Joiner<T> {
    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    @SafeVarargs
    public final String join(T... elements) {
        return String.join(separator, Arrays.stream(elements)
                .map(Object::toString)
                .toArray(String[]::new));
    }

    public String getSeparator() {
        return separator;
    }
}
