package at.tim.algorithms;

public class Gui {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Sorter bubbleSort = new BubbleSort("bubble");
        Sorter insertionSort = new InsertionSort("insertion");
        Sorter selectionSort = new SelectionSort("selection");

        controller.addSorter(bubbleSort);
        controller.addSorter(insertionSort);
        controller.addSorter(selectionSort);

        controller.run();

    }

}