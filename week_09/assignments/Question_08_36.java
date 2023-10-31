package week_09.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number n: ");
        int num = input.nextInt();
        char[][] matrix = new char[num][num];
        boolean stop = false;

        do {
            stop = false;
            System.out.println("Enter " + num + " rows of letters separated by spaces: ");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = input.next().charAt(0);
                    if (matrix[i][j] > 'A' + num - 1){
                        System.out.println("Wrong input: the letters must be from " + 'A' + " to " + (char) ('A' + (num -1)));
                        stop = true;
                    }
                }
            }
        } while (stop);

        System.out.println("The input array is "+ (isLatinSquare(matrix) ? "" : "not ") + "a Latin square");

    }

    private static boolean isLatinSquare(char[][] m){
        return checkRow(m) && checkColumn(m);
    }

    private static boolean checkColumn(char[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                // check for each item in the row.
                for (int k = 0; k < m.length; k++) {
                    if (j == k) continue;
                    if (m[j][i] == m[k][i]) return false;
                }
            }
        }
        return true;
    }

    private static boolean checkRow(char[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                // check for each item in the row.
                for (int k = 0; k < m.length; k++) {
                    if (j == k) continue;
                    if (m[i][j] == m[i][k]) return false;
                }
            }
        }
        return true;
    }
}
