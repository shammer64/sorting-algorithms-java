package com.shammer;

public class QuickSorter {
    public int[] sort(int[] array) {
        if (array.length < 2) return array;
        quicksort(array, 0, array.length - 1);
        return array;
    }

    private void quicksort(int[] array, int loIndex, int hiIndex) {
        if (loIndex < hiIndex) {
            int p = partition(array, loIndex, hiIndex);
            quicksort(array, loIndex, p - 1);
            quicksort(array, p + 1, hiIndex);
        }
    }

    private int partition(int[] array, int loIndex, int hiIndex) {
        int pivot = array[hiIndex];
        int i = loIndex - 1;

        for(int j = loIndex; j < hiIndex; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, hiIndex);
        return i+1;
    }

    private void swap(int[] array, int i, int j) {
        if (i == j) return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
