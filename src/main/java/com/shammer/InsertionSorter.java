package com.shammer;

public class InsertionSorter implements Sorter {
    @Override
    public int[] sort(int[] array) {
        if (array.length <= 1)
            return array;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j])
                    insertElementAt(array, i, j);
            }
        };
        return array;
    }

    private void insertElementAt(int[] array, int currIndex, int newIndex) {
        int tempValue = array[currIndex];
        shiftElementsOneRight(array, currIndex, newIndex);
        array[newIndex] = tempValue;
    }

    private void shiftElementsOneRight(int[] array, int currIndex, int newIndex) {
        for (int k = currIndex; k > newIndex; k--) {
            array[k] = array[k-1];
        }
    }
}
