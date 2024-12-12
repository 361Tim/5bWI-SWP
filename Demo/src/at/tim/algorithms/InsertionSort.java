package at.tim.algorithms;

public class InsertionSort implements Sorter {
    private String name;

    public InsertionSort(String name) {
        this.name = name;
    }

    @Override
    public int[] sort(int[] array) {
        return new int[] { 3, 2, 1 };
    }

    @Override
    public String getName() {
        return this.name;
    }
}
