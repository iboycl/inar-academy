package week_09.assignments;

import java.util.Scanner;

public class Question_08_20 {
    public static void main(String[] args) {

        diskGame();
    }

    public static void diskGame(){

        int[][] board = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };

        int filledCells = 0;
        boolean stop = true;

        while (!isConsecutiveFour(board) && stop){
            printBoard(board);


            dropDisk(board,1);
            printBoard(board);
            filledCells++;
            if (isConsecutiveFour(board)) {
                System.out.println("The red player won!");
                break;
            }


            dropDisk(board,2);
            printBoard(board);
            filledCells++;
            if (isConsecutiveFour(board)) System.out.println("The yellow player won!");
            stop = checkFilledCells(filledCells);
        }
    }

    private static void dropDisk(int[][] board, int color){
        Scanner input = new Scanner(System.in);
        System.out.print("Drop a "+(color == 1 ? "red" : "yellow") +" disk at column (0-6): ");
        int col = input.nextInt();
        int columnCheck = 0;
        do {
            for (int[] row : board) if (row[col] != 0) columnCheck++;
            if (columnCheck == 6) {
                System.out.print("That column is full choose another one: ");
                col = input.nextInt();
                columnCheck = 0;
            }

        } while (columnCheck == 6);

        for (int i = board.length - 1; i >= 0; i--) {
            if (board[i][col] == 0){
                board[i][col] = color;
                break;
            }
        }
    }

    private static void printBoard(int[][] board){
        for (int i = 0; i < 6; i++) {
            System.out.print("|");
            for (int j = 0; j < 7; j++) {
                switch (board[i][j]){
                    case 0 -> System.out.print(" |");
                    case 1 -> System.out.print("R|"); // Red
                    case 2 -> System.out.print("Y|"); // Yellow
                }
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static boolean isConsecutiveFour(int[][] m) {
        return (isConsecutiveFourAtRows(m) || isConsecutiveFourAtColumns(m) ||
                isConsecutiveFourAtDiagonal(m));
    }

    public static boolean isConsecutiveFourAtRows(int[][] m) {
        int count;
        for (int i = 0; i < m.length; i++) {
            count = 1; //Each row Update the count
            for (int j = 0; j < m[i].length - 1; j++) {
                if (m[i][j] == 0) continue;
                if (m[i][j] == m[i][j + 1]) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 1; // for each number Update
                }
            }
        }
        return false;
    }

    public static boolean isConsecutiveFourAtColumns(int[][] m) {
        int count;
        for (int j = 0; j < m[0].length; j++) {
            count = 1; //Each column Update for the count variable
            for (int i = 0; i < m.length - 1; i++) {
                if (m[i][j] == 0) continue;
                if (m[i][j] == m[i + 1][j]) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 1; // For each number update
                }
            }
        }
        return false;
    }

    public static boolean isConsecutiveFourAtDiagonal(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 0) continue;
                if (isLeftDiagonal(i, j, m) || isRightDiagonal(i, j, m)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isRightDiagonal(int row, int column, int[][] m) {
        if (row >= m.length - 3) {
            return false;
        }
        if (column >= m[0].length - 3) {
            return false;
        }
        int number = m[row][column];
        int count = 1;

        for (int i = 1; i < 4; i++) {
            if (number == m[row + i][column + i]) {
                count++;
            }
        }
        if (count == 4) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLeftDiagonal(int row, int column, int[][] m) {
        if (row >= m.length - 3) {
            return false;
        }
        if (column < 3) {
            return false;
        }
        int number = m[row][column];
        for (int i = 1; i < 4; i++) {
            if (number != m[row + i][column - i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkFilledCells(int filledCells){
        Scanner input = new Scanner(System.in);
        if (filledCells == 42) {
            System.out.print("It's a draw! Do you want to play again? y or n: ");
            if (input.next().equals("y")){
                diskGame();
            } else {
                System.out.println("See you next game.");
                return false;
            }
        }
        return true;
    }

}
