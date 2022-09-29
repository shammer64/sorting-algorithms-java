package com.shammer.algorithms.sort;

public class SelectionSorter implements Sorter {
    @Override
    public int[] sort(int[] array) {
        if (array.length <= 1)
            return array;

        for (var startIndex = 0; startIndex < array.length - 1; startIndex++) {
            var currMin = array[startIndex];
            var currMinIndex = startIndex;
            var compareIndex = startIndex + 1;
            while (compareIndex < array.length) {
                if (array[compareIndex] < currMin) {
                    currMin = array[compareIndex];
                    currMinIndex = compareIndex;
                }
                compareIndex++;
            }

            swapElements(array, startIndex, currMinIndex);
        }

        return array;
    }

    private void swapElements(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
