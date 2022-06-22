package com.shammer;

import org.junit.jupiter.api.BeforeEach;

public class SelectionSorterTest extends SorterTest {
    @Override
    @BeforeEach
    public void initialize() {
        sorter = new SelectionSorter();
    }

}
