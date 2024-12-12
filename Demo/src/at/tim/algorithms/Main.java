package at.tim.algorithms;

public class Main {
    public static void main(String[] args) {
        System.out.println("Initial array");
        int[] data = DataGenerator.generateDataArray(10, 0, 100);
        DataGenerator.printArray(data);
        System.out.println("Bubblesort array");

    }
}
