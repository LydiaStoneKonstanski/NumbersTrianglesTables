package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String result = "";
        int n = 5;

        for (int i = 1; i <= n; i++) {
            result += lineOfNumbers(i, n) + "\n";
        }

        return result;
    }


    public static String getLargeMultiplicationTable() {
        String result = "";
        int n = 10;

        for (int i = 1; i <= n; i++) {
            result += lineOfNumbers(i, n) + "\n";
        }

        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        int n = 20;

        for (int i = 1; i <= n; i++) {
            result += lineOfNumbers(i, n) + "\n";
        }

        return result;
    }
    public static String lineOfNumbers(int n, int columns) {
        String xAxis = "";
        String pipe = " |";
        for (int i = 1; i <= columns; i++) {
            xAxis += String.format("%3d", n * i ) + pipe;
        }
        return xAxis;
    }

    public static String kindaStarLike() {
        String result = "";
        int n = 5;

        for (int i = 1; i <= n; i++) {
            result += kindaStarRowLike(i) + "\n";
        }

        return result;
    }
    public static String kindaStarRowLike(int n) {
        String xAxis = "";
        String pipe = " |";
        for (int i = 1; i <= n; i++) {
            xAxis += String.format("%3d", n * i ) + pipe;
        }
        return xAxis;
    }
}
