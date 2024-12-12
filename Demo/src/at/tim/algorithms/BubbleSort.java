package at.tim.algorithms;

public class BubbleSort implements Sorter {
    private String name;

    public BubbleSort(String name) {
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
