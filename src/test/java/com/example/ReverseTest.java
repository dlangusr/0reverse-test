package com.example;

import net.jqwik.api.*;
// import org.assertj.core.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest {

    @Example
    void reversesEvenLengthList() {
        List<Integer> list =
                new ArrayList<>(List.of(1, 2, 3, 4));

        Reverse.reverse(list);

        assertEquals(List.of(4, 3, 2, 1), list);
    }

    @Example
    void reversesOddLengthList() {
        List<Integer> list =
                new ArrayList<>(List.of(1, 2, 3, 4, 5));

        Reverse.reverse(list);

        assertEquals(List.of(5, 4, 3, 2, 1), list);
    }

    @Example
    void reversesStringList() {
        List<String> list =
                new ArrayList<>(List.of("A", "B", "C"));

        Reverse.reverse(list);

        assertEquals(List.of("C", "B", "A"), list);
    }

    @Example
    void emptyListRemainsEmpty() {
        List<Integer> list = new ArrayList<>();

        Reverse.reverse(list);

        assertEquals(List.of(), list);
    }

    @Example
    void singleElementListRemainsUnchanged() {
        List<Integer> list =
                new ArrayList<>(List.of(42));

        Reverse.reverse(list);

        assertEquals(List.of(42), list);
    }
}