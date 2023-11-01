package week_10.assignments;

import java.util.Scanner;

public class GetIntArray {
    public static int[][] getIntArray(int row, int col){
        Scanner input = new Scanner(System.in);

        int[][] array = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }
}
