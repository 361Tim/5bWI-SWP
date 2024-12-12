package at.tim.algorithms;

import java.util.Arrays;

public class SelectionSort implements Sorter {
    public String name;

    public SelectionSort(String name) {
        this.name = name;
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int[] numbers = { 64, 25, 12, 22, 11 };

        System.out.println("Before sorting: " + Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }

    @Override
    public int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }

    @Override
    public String getName() {
        return this.name;
    }
}