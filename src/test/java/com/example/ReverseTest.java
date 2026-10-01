package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseTest {

    @Test
    public void reversesEvenLengthList() {
        List<Integer> list =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        Reverse.reverse(list);

        assertEquals(Arrays.asList(4, 3, 2, 1), list);
    }

    @Test
    public void reversesOddLengthList() {
        List<Integer> list =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Reverse.reverse(list);

        assertEquals(Arrays.asList(5, 4, 3, 2, 1), list);
    }

    @Test
    public void reversesStringList() {
        List<String> list =
                new ArrayList<>(Arrays.asList("A", "B", "C"));

        Reverse.reverse(list);

        assertEquals(Arrays.asList("C", "B", "A"), list);
    }

    @Test
    public void emptyListRemainsEmpty() {
        List<Integer> list = new ArrayList<>();

        Reverse.reverse(list);

        assertEquals(Collections.emptyList(), list);
    }

    @Test
    public void singleElementListRemainsUnchanged() {
        List<Integer> list =
                new ArrayList<>(Arrays.asList(42));

        Reverse.reverse(list);

        assertEquals(Arrays.asList(42), list);
    }
}