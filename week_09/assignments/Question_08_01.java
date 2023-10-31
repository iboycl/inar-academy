package week_09.assignments;

import week_09.live_class.PassTwoDimensionalArray;

import java.util.Scanner;

public class Question_08_01 {
    public static void main(String[] args) {
        double[][] matrix = GetDoubleArray.getDoubleArray(3, 4);
        sumColumn(matrix);

    }



    public static void sumColumn(double[][] m) {
        double total = 0;
        for (int column = 0; column < m[0].length; column++) {
            for (int row = 0; row < m.length; row++) {
                total += m[row][column];
            }
            System.out.println("Sum of the elements at column " + column + " is " + total);
            total = 0;
        }
    }
}
