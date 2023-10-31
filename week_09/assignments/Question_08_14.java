package week_09.assignments;

import java.util.Scanner;

public class Question_08_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }

        for (int[] r : matrix){
            for (int c : r){
                System.out.print(c);
            }
            System.out.println();
        }


        // check rows
        boolean noSame = true;
        for (int i = 0; i < size; i++) {
            int count = 0;

            for (int j = 1; j < size; j++) {
                if(matrix[i][0] == matrix[i][j]) count++;
            }
            if (count == size - 1){
                System.out.println("All " + matrix[i][0] + "s on row " + i);
                noSame = false;
            }
        }

        if (noSame) System.out.println("No same numbers on a row");

        // check columns
        noSame = true;
        for (int i = 0; i < size; i++) {
            int count = 0;

            for (int j = 1; j < size; j++) {
                if(matrix[i][0] == matrix[j][i]) count++;
            }
            if (count == size - 1){
                System.out.println("All " + matrix[i][0] + "s on column " + i);
                noSame = false;
            }
        }

        if (noSame) System.out.println("No same numbers on a columns");

        // left-major diagonal
        int count = 0;
        noSame = true;

        for (int i = 1; i < size; i++) {
            if(matrix[0][0] == matrix[i][i]) count++;
        }

        if (count == size - 1){
            System.out.println("Numbers on the left-major diagonal " + matrix[0][0]);
            noSame = false;
        }

        if (noSame) System.out.println("No same numbers on the left-major diagonal");

        // right-major diagonal
        count = 0;
        noSame = true;

        for (int i = 1; i < size - 1; i++) {
            for (int j = size - 1; j >= 0; j--) {
                if(matrix[0][size - 1] == matrix[i][j]) count++;
            }
        }

        if (count == size - 1){
            System.out.println("Numbers on the right-major diagonal " + matrix[0][0]);
            noSame = false;
        }

        if (noSame) System.out.println("No same numbers on the right-major diagonal");

    }
}
