package com.shammer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSorterTest {

    private Sorter sorter;

    @BeforeEach
    public void initialize() {
        sorter = new QuickSorter();
    }

    @Test
    public void shouldQuicklyReturnEmptyArray() {
        int[] expected = new int[0];

        int[] actual = sorter.sort(new int[0]);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldQuicklyReturnArrayOfOne() {
        int[] expected = new int[] {15};

        int[] actual = sorter.sort(new int[] {15});

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortOrderedArrayOfTwo() {
        int[] expected = new int[] {15, 30};

        int[] actual = sorter.sort(new int[] {15, 30});

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortUnorderedArrayOfTwo() {
        int[] expected = new int[] {15, 30};

        int[] actual = sorter.sort(new int[] {30, 15});

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortUnorderedArrayOfThree() {
        int[] expected = new int[] {15, 30, 45};

        int[] actual = sorter.sort(new int[] {45, 15, 30});

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortUnorderedArrayOfTen() {
        int[] expected = new int[] {9, 17, 18, 23, 32, 39, 46, 50, 61, 73};

        int[] actual = sorter.sort(new int[] {23, 50, 9, 18, 61, 32, 17, 73, 46, 39});

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortUnorderedArrayOfOneHundred() {
        int[] randomInputArray = IntStream.generate(() -> new Random().nextInt(1000))
                .limit(100).toArray();
        int[] expected = Arrays.stream(randomInputArray).sorted().toArray();

        int[] actual = sorter.sort(randomInputArray);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortUnorderedArrayOfOneThousand() {
        int[] randomInputArray = IntStream.generate(() -> new Random().nextInt(1000))
                .limit(1000).toArray();
        int[] expected = Arrays.stream(randomInputArray).sorted().toArray();

        int[] actual = sorter.sort(randomInputArray);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortUnorderedArrayOfOneHundredThousand() {
        int[] randomInputArray = IntStream.generate(() -> new Random().nextInt(1000))
                .limit(100000).toArray();
        int[] expected = Arrays.stream(randomInputArray).sorted().toArray();

        int[] actual = sorter.sort(randomInputArray);

        assertArrayEquals(expected, actual);
    }

}
