package at.tim.algorithms.test;

import org.junit.jupiter.api.Test;
import at.tim.algorithms.BubbleSort;
import at.tim.algorithms.Sorter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {

    private final Sorter sorter = new BubbleSort("BubbleSorter");

    @Test
    void testSelectionSortWithPositiveNumbers() {
        int[] input = { 64, 25, 12, 22, 11 };
        int[] expected = { 11, 12, 22, 25, 64 };

        sorter.sort(input);
        assertArrayEquals(expected, input, "Das Array wurde nicht korrekt sortiert.");
    }

    @Test
    void testSelectionSortWithNegativeNumbers() {
        int[] input = { -5, -10, -3, -1, -7 };
        int[] expected = { -10, -7, -5, -3, -1 };

        sorter.sort(input);
        assertArrayEquals(expected, input, "Negative Zahlen wurden nicht korrekt sortiert.");
    }

    @Test
    void testSelectionSortWithMixedNumbers() {
        int[] input = { 3, -2, 5, 0, -1 };
        int[] expected = { -2, -1, 0, 3, 5 };

        sorter.sort(input);
        assertArrayEquals(expected, input, "Gemischte Zahlen wurden nicht korrekt sortiert.");
    }

    @Test
    void testSelectionSortWithEmptyArray() {
        int[] input = {};
        int[] expected = {};

        sorter.sort(input);
        assertArrayEquals(expected, input, "Ein leeres Array sollte unverändert bleiben.");
    }

    @Test
    void testSelectionSortWithAlreadySortedArray() {
        int[] input = { 1, 2, 3, 4, 5 };
        int[] expected = { 1, 2, 3, 4, 5 };

        sorter.sort(input);
        assertArrayEquals(expected, input, "Ein bereits sortiertes Array wurde verändert.");
    }

    @Test
    void testSelectionSortWithDuplicates() {
        int[] input = { 5, 3, 3, 2, 2 };
        int[] expected = { 2, 2, 3, 3, 5 };

        sorter.sort(input);
        assertArrayEquals(expected, input, "Duplikate wurden nicht korrekt sortiert.");
    }
}
