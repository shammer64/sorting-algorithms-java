package com.shammer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSorterTest extends SorterTest {

    @Override
    @BeforeEach
    public void initialize() {
        sorter = new QuickSorter();
    }

}
