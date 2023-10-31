package week_09.assignments;

import java.util.Scanner;

public class GetDoubleArray {
    public static double[][] getDoubleArray(int rows, int columns) {
        Scanner input = new Scanner(System.in);
        double[][] m = new double[rows][columns];
        System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++) m[i][j] = input.nextDouble();
        return m;
    }
}
