package at.tim.algorithms;

public class InsertionSort implements Sorter {
    private String name;

    public InsertionSort(String name) {
        this.name = name;
    }

    @Override
    public int[] sort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int j = i;
            int aktuellesElement = array[j];

            while (j > 0 && array[j - 1] > aktuellesElement) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = aktuellesElement;
        }

        return array;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
