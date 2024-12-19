package at.tim.algorithms;

public class Gui {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Sorter selectionSort = new SelectionSort("selection");
        Sorter bubbleSort = new BubbleSort("bubble");
        Sorter insertionSort = new InsertionSort("insertion");

        controller.addSorter(selectionSort);
        controller.addSorter(bubbleSort);
        controller.addSorter(insertionSort);

        controller.run();

    }

}