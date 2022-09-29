package com.shammer.algorithms.sort;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSorterTest extends SorterTest {

    @Override
    @BeforeEach
    public void initialize() {
        sorter = new QuickSorter();
    }

}
