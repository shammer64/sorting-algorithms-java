package com.shammer;

import org.junit.jupiter.api.BeforeEach;

public class InsertionSorterTest extends SorterTest {

    @Override
    @BeforeEach
    public void initialize() {
        sorter = new InsertionSorter();
    }
}
