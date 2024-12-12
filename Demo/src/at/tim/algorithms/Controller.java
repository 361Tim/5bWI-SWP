package at.tim.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Controller {

    private List<Sorter> sorters = new ArrayList<>();
    private Sorter selectedSorter;
    private boolean running;

    public Controller() {
        running = true;
        selectedSorter = null;
    }

    public void addSorter(Sorter sorter) {
        sorters.add(sorter);
    }

    public void getAllSorters() {
        int index = 1;
        for (Sorter sorter : sorters) {
            System.out.println(index + ": " + sorter.getName());
            index += 1;
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (running) {

            System.out.println("1 Print all Sorters");
            System.out.println("2 Select a Sorter");
            System.out.println("3 Sort Numbers");
            System.out.println("4 Exit");

            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1:
                    getAllSorters();
                    System.out.println("-------------------");
                    break;
                case 2:
                    System.out.println("All Sorters:");
                    getAllSorters();
                    System.out.println("Select a Number:");
                    int scannerNumber = scanner.nextInt();
                    scanner.nextLine();
                    selectedSorter = sorters.get(scannerNumber - 1);
                    System.out.println("-------------------");
                    break;
                case 3:
                    if (selectedSorter == null) {
                        System.out.println("No Sorter Selected");
                        break;
                    }
                    System.out.println("Enter Numbers (separate with comma):");
                    String numbers = scanner.nextLine();
                    String[] numbersArrayString = numbers.split(",");
                    ArrayList<Integer> numbersArrayList = new ArrayList<>();

                    for (String number : numbersArrayString) {
                        int editedNumber = Integer.parseInt(number.trim());
                        numbersArrayList.add(editedNumber);
                    }

                    int[] numbersArrayInt = numbersArrayList.stream().mapToInt(i -> i).toArray();
                    System.out.println(Arrays.toString(selectedSorter.sort(numbersArrayInt)));

                    System.out.println("-------------------");
                    break;
                case 4:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }

        scanner.close();
    }

}