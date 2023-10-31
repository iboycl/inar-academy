package week_09.assignments;

import java.util.Arrays;

public class Question_08_10 {
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }

        int rowMax = 0;
        int rowMaxIndex = 0;
        int columnMax = 0;
        int columnMaxIndex = 0;

        for (int i = 0; i < 4; i++) {
            int rowSum = 0;
            for (int j = 0; j < 4; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum > rowMax){
                rowMax = rowSum;
                rowMaxIndex = i;
            }
        }

        for (int i = 0; i < 4; i++) {
            int columnSum = 0;
            for (int j = 0; j < 4; j++) {
                columnSum += matrix[j][i];
            }
            if (columnSum > columnMax){
                columnMax = columnSum;
                columnMaxIndex = i;
            }
        }

        System.out.println("The largest row index: " + rowMaxIndex);
        System.out.println("The largest column index: " + columnMaxIndex);
    }
}
