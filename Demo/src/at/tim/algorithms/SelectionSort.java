package at.tim.algorithms;

public class SelectionSort implements Sorter {
    private String name;

    public SelectionSort(String name) {
        this.name = name;
    }

    @Override
    public int[] sort(int[] array) {
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
        return array;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
