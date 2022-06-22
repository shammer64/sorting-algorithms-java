package com.shammer;

public class InsertionSorter implements Sorter {
    @Override
    public int[] sort(int[] array) {
        if (array.length <= 1)
            return array;
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int value = array[i];
            while (j >= 0 && array[j] > value) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = value;
        };
        return array;
    }

    private void shiftElementsOneRight(int[] array, int currIndex, int newIndex) {
        for (int k = currIndex; k > newIndex; k--) {
            array[k] = array[k-1];
        }
    }
}
