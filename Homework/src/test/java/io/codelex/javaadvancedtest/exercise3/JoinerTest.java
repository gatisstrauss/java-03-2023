package io.codelex.javaadvancedtest.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JoinerTest {

    @Test
    void testJoin() {
        Joiner<Integer> joiner = new Joiner<>("-");
        String result = joiner.join(1, 2, 3, 4, 5);

        assertEquals("1-2-3-4-5", result);
    }
}