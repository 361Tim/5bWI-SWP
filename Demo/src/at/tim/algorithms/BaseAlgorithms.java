package at.tim.algorithms;

public class BaseAlgorithms {

    public static int[] revert(int[] data) {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = data[data.length - 1 - i];
        }
        return result;
    }

    public static int max(int[] data) {
        if (data.length == 0) {
            throw new IllegalArgumentException("Array darf nicht leer sein");
        }

        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public static int min(int[] data) {
        if (data.length == 0) {
            throw new IllegalArgumentException("Array darf nicht leer sein");
        }

        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }
}