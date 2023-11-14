package question_11_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int size = input.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }

        System.out.println("The random matrix is:");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        int rowMax = 0;
        ArrayList<Integer> rowMaxIndex = new ArrayList<>();
        int columnMax = 0;
        ArrayList<Integer> columnMaxIndex = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            int rowSum = 0;
            for (int j = 0; j < 4; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum > rowMax){
                rowMax = rowSum;
                rowMaxIndex.clear();
                rowMaxIndex.add(0,i);
            } else if (rowSum == rowMax) {
                rowMaxIndex.add(i);
            }
        }

        for (int i = 0; i < 4; i++) {
            int columnSum = 0;
            for (int j = 0; j < 4; j++) {
                columnSum += matrix[j][i];
            }
            if (columnSum > columnMax){
                columnMax = columnSum;
                columnMaxIndex.clear();
                columnMaxIndex.add(0,i);
            } else if (columnSum == columnMax) {
                columnMaxIndex.add(i);
            }
        }

        System.out.print("The largest row index: ");
        for (int i : rowMaxIndex) System.out.print(rowMaxIndex.size() > 1 ?  i + ", " : i);
        System.out.println();

        System.out.print("The largest column index: ");
        for (int i : columnMaxIndex) System.out.print(columnMaxIndex.size() > 1 ?  i + ", " : i);
    }
}
