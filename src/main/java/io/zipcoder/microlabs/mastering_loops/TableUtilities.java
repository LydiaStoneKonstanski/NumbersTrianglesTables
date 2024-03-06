package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable(same number as int n below) {
        String result;
        "\n"

        return result;
    }
    //for (int i = 1; i <= 6; i++) {
    //}

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
    public static String lineOfNumbers(int n) {
        String xAxis = "";
        String pipe = "|";
        for (int i = 1; i <= n; i++) {
            xAxis = String.format("%4d", n * i ) + pipe;
        }
        return xAxis;
    }
}
