package com.shammer.algorithms.sort;

public class InsertionSorter implements Sorter {
    @Override
    public int[] sort(int[] array) {
        if (array.length <= 1)
            return array;
        for (int startIndex = 1; startIndex < array.length; startIndex++) {
            int compareIndex = startIndex - 1;
            int currValue = array[startIndex];
            while (compareIndex >= 0 && array[compareIndex] > currValue) {
                shiftRight(array, compareIndex);
                compareIndex--;
            }
            array[compareIndex+1] = currValue;
        };
        return array;
    }

    private void shiftRight(int[] array, int index) {
        array[index+1] = array[index];
    }

}
