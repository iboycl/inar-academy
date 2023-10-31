package week_09.assignments;

import java.util.Scanner;

public class Question_08_19 {
    public static void main(String[] args) {
        //int[][] matrix = giveUsAMatrix();

        int[][] matrix = {{0, 1, 0, 5, 1, 6, 2},
                          {0, 1, 5, 8, 4, 6, 0},
                          {3, 5, 0, 0, 6, 2, 1},
                          {0, 5, 6, 3, 0, 1, 1},
                          {5, 5, 6, 1, 0, 0, 7},
                          {1, 2, 3, 5, 4, 0, 0}};

        System.out.println("Matrix has " + (checkConsecutiveFour(matrix) ? "" : "not ") +"consecutive four numbers.");
    }

    private static int[][] giveUsAMatrix(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter row number: ");
        int row = input.nextInt();

        System.out.print("Enter column number: ");
        int column = input.nextInt();

        int[][] matrix = new int[row][column];

        System.out.println("Fill the matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println();

        for (int[] r : matrix){
            for (int c : r)
                System.out.print(c + " ");
            System.out.println();
        }

        return matrix;
    }

    private static boolean checkConsecutiveFour (int[][] matrix){
        return (checkRow(matrix) || checkColumn(matrix) || checkRightDiagonal(matrix) || checkLeftDiagonal(matrix));
    }

    private static boolean checkLeftDiagonal(int[][] matrix) {
        boolean check = false;

        for (int i = 3; i >= 0; i--) {
            if (matrix.length == 4 && i != 0) continue; // if length is 4 it should jump to [0][0]

            int col = 0;
            int count = 0;
            for (int j = i; j < matrix.length; j++) {
                if(j > 3 && count == 0) break;
                if (matrix[j][col] == matrix[j+1][col+1]){
                    count++;
                } else count = 0;

                if (count == 3) {
                    check = true;
                    break;
                }
                col++;
            }
            if (check)break;
        }

        for (int i = 1; i < matrix[0].length - 3; i++) {
            int col = 0;
            int count = 0;
            for (int j = i; j < matrix[0].length; j++) {
                if(j > matrix[0].length - 3 && count == 0) break;
                if (matrix[col][j] == matrix[col+1][j+1]){
                    count++;
                } else count = 0;

                if (count == 3) {
                    check = true;
                    break;
                }
                col++;
            }
            if (check)break;
        }

        return check;
    }

    private static boolean checkRightDiagonal(int[][] matrix) {
        boolean check = false;

        for (int i = 3; i < matrix.length; i++) {
            int col = 0;
            int count = 0;
            for (int j = i; j > 0; j--) {
                if(j < 3 && count == 0) break;
                if (matrix[j][col] == matrix[j-1][col+1]){
                    count++;
                } else count = 0;

                if (count == 3) {
                    check = true;
                    break;
                }
                col++;
            }
            if (check)break;
        }

        for (int i = 1; i < matrix[0].length - 3; i++) {
            int col = 5;
            int count = 0;
            for (int j = i; j < matrix[0].length; j++) {
                if(j > matrix.length - 3 && count == 0) break;
                if (matrix[col][j] == matrix[col-1][j+1]){
                    count++;
                } else count = 0;

                if (count == 3) {
                    check = true;
                    break;
                }
                col--;
            }
            if (check)break;
        }
        
        return check;
    }

    private static boolean checkRow(int[][] matrix) {
        boolean check = false;
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (count == 0 && j == matrix[i].length - 3) break;
                if (matrix[i][j] == matrix[i][j + 1]) {
                    count++;
                } else count = 0;

                if (count == 3) {
                    check = true;
                    break;
                }
            }
        }
        return check;
    }

    private static boolean checkColumn(int[][] matrix) {
        boolean check = false;
        for (int i = 0; i < matrix[0].length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length - 1; j++) {
                if (count == 0 && j == matrix.length - 3) break;
                if (matrix[j][i] == matrix[j + 1][i]) {
                    count++;
                } else count = 0;

                if (count == 3) {
                    check = true;
                    break;
                }
            }
        }
        return check;
    }


}
