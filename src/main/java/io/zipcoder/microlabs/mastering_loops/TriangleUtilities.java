package io.zipcoder.microlabs.mastering_loops;
import java.io.*;
import java.util.Scanner;



public class TriangleUtilities {

        public static String getTriangle(int numberOfRows) {
                String result = "";
                int n = numberOfRows;

                for (int i = 1; i <= n; i++) {
                    result += getRow(i) + "\n";
                }

                return result;
            }


            // Driver Function
//            public static void main(String args[])
//            {
//                int k = 5;
//                StarRightTriangle(k);
//            }

    public static String getSmallTriangle() {

        return getTriangle(4);
    }

    public static String getLargeTriangle() {

        return getTriangle(9);
    }

    public static String getRow(int n) {
        String xAxis = "";
        for (int i = 1; i <= n; i++) {
            xAxis += "*";
        }
        return xAxis;
    }
}