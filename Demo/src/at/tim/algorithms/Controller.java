package at.tim.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
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
            System.out.println("4 Random Numbers");
            System.out.println("5 Exit");

            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1:
                    getAllSorters();
                    break;
                case 2:
                    System.out.println("All Sorters:");
                    getAllSorters();
                    System.out.println("Select a Number:");
                    int scannerNumber = scanner.nextInt();
                    scanner.nextLine();
                    selectedSorter = sorters.get(scannerNumber);
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
                    System.out.println("Sorted numbers: " + Arrays.toString(selectedSorter.sort(numbersArrayInt)));
                    break;
                case 4:
                    System.out.println("Enter the range for random numbers (format: min,max):");
                    String rangeInput = scanner.nextLine();
                    String[] rangeParts = rangeInput.split(",");
                    if (rangeParts.length == 2) {
                        try {
                            int min = Integer.parseInt(rangeParts[0].trim());
                            int max = Integer.parseInt(rangeParts[1].trim());
                            if (min >= max) {
                                System.out.println("Invalid range: min should be less than max.");
                                break;
                            }

                            System.out.println("Enter the number of random numbers to generate:");
                            int length = scanner.nextInt();
                            scanner.nextLine();
                            if (length <= 0) {
                                System.out.println("Invalid length. Please enter a positive number.");
                                break;
                            }

                            Random rand = new Random();
                            int[] randomNumbers = new int[length];
                            for (int i = 0; i < length; i++) {
                                randomNumbers[i] = rand.nextInt(max - min + 1) + min;
                            }
                            System.out.println("Generated random numbers: " + Arrays.toString(randomNumbers));
                            if (selectedSorter != null) {
                                int[] sortedNumbers = selectedSorter.sort(randomNumbers);
                                System.out.println("Sorted random numbers: " + Arrays.toString(sortedNumbers));
                            } else {
                                System.out.println("No Sorter selected. Numbers were not sorted.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid range input. Please enter two integer values.");
                        }
                    } else {
                        System.out.println("Invalid input format. Please enter the range as 'min,max'.");
                    }
                    break;
                case 5:
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
