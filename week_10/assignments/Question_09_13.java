package week_10.assignments;

import java.util.Scanner;

public class Question_09_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int col = input.nextInt();

        double[][] a = GetDoubleArray.getDoubleArray(row,col);
        Location loc = new Location(a);
        System.out.printf("The location of the largest element is %.0f at (%d, %d)", loc.maxValue, loc.row, loc.col);
    }
}
