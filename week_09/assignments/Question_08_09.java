package week_09.assignments;

import java.util.Scanner;

public class Question_08_09 {
    public static void main(String[] args) {

        TicTacPlay();

    }

    public static void TicTacPlay(){
        String[][] board = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "},
        };

        TicTacBoardPrint(board);

        TicTacGame(board);
    }

    private static boolean TicTac(String[][] board, String key){
        // row check

        int count  = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j].equals(key)){
                    count++;
                } else break;
            }
            if (count == 3) return false;
            count = 0;
        }

        // column check
        count  = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i].equals(key)){
                    count++;
                } else break;
            }
            if (count == 3) return false;
            count = 0;
        }

        // Left diagonal check
        count  = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i].equals(key)){
                count++;
            } else break;
        }
        if (count == 3) return false;

        // Right diagonal check
        count = 0;
        int j = 2;
        for ( int i = 0; i < 3; i++) {
            if (board[i][j].equals(key)){
                count++;
            } else break;
            j--;
        }
        if (count == 3) return false;

        return true;
    }

    private  static void TicTacBoardPrint(String[][] board){
        String line = "-------------";

        System.out.println(line);
        for (String[] e : board) {
            System.out.print("| ");
            for (String r : e) {
                System.out.print(r + " | ");
            }
            System.out.println("\n" + line);
        }
    }

    private static void TicTacGame(String[][] board){
        Scanner input = new Scanner(System.in);

        boolean ticTacX = true;
        boolean ticTacO = true;
        int filledCells = 0;

        while (ticTacX && ticTacO && filledCells < 9){
            boolean playerXInput = true;
            while (playerXInput){
                System.out.print("Player X, enter a row (0, 1, 2) : ");
                int rowX = input.nextInt();

                System.out.print("Player X, enter a column (0, 1, 2) : ");
                int columnX = input.nextInt();

                if (board[rowX][columnX].equals(" ")){
                    board[rowX][columnX] = "X";
                    playerXInput = false;
                } else {
                    System.out.println("It was already taken, choose another cell!");
                }
            }

            TicTacBoardPrint(board);
            ticTacX = TicTac(board, "X");
            filledCells++;
            if (!ticTacX) {
                System.out.println("Player X won!");
                break;
            }

            if (filledCells == 9){
                System.out.println("It's draw!");
                System.out.println("Game started again!\n");
                TicTacPlay();
            }

            boolean playerOInput = true;
            while (playerOInput){
                System.out.print("Player O, enter a row (0, 1, 2) : ");
                int rowX = input.nextInt();

                System.out.print("Player O, enter a column (0, 1, 2) : ");
                int columnX = input.nextInt();

                if (board[rowX][columnX].equals(" ")){
                    board[rowX][columnX] = "O";
                    playerOInput = false;
                } else {
                    System.out.println("It was already taken, choose another cell!");
                    System.out.println();
                }
            }


            TicTacBoardPrint(board);
            ticTacO = TicTac(board, "O");
            filledCells++;
            if (!ticTacO) {
                System.out.println("Player O won!");
                break;
            }

        }
    }
}
