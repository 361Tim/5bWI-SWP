package at.tim.algorithms;

public class BubbleSort implements Sorter {
    private String name;

    public BubbleSort(String name) {
        this.name = name;
    }

    @Override
    public int[] sort(int[] array) {
        int n = array.length;
        boolean newRound = true;

        for (int i = n - 1; i > 0 && newRound; i--) {
            newRound = false;

            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    newRound = true;
                }
            }
        }

        return array;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
