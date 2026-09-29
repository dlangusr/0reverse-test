package com.example;

import net.jqwik.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class ReverseTest {

    @Example
    void reversesEvenLengthList() {
        List<Integer> list =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        Reverse.reverse(list);

        assertEquals(Arrays.asList(4, 3, 2, 1), list);
    }

    @Example
    void reversesOddLengthList() {
        List<Integer> list =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Reverse.reverse(list);

        assertEquals(Arrays.asList(5, 4, 3, 2, 1), list);
    }

    @Example
    void reversesStringList() {
        List<String> list =
                new ArrayList<>(Arrays.asList("A", "B", "C"));

        Reverse.reverse(list);

        assertEquals(Arrays.asList("C", "B", "A"), list);
    }

    @Example
    void emptyListRemainsEmpty() {
        List<Integer> list = new ArrayList<>();

        Reverse.reverse(list);

        assertEquals(Collections.emptyList(), list);
    }

    @Example
    void singleElementListRemainsUnchanged() {
        List<Integer> list =
                new ArrayList<>(Arrays.asList(42));

        Reverse.reverse(list);

        assertEquals(Arrays.asList(42), list);
    }
}
