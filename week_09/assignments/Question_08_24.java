package week_09.assignments;

public class Question_08_24 {
    public static void main(String[] args) {
        int[][] sudoku = {
                {6,3,1,7,4,3,5,8,4},
                {1,7,8,3,2,5,6,4,9},
                {2,5,4,6,8,9,7,3,1},
                {8,2,1,4,3,7,5,9,6},
                {4,9,6,8,5,2,3,1,7},
                {7,3,5,9,6,1,8,2,4},
                {5,8,9,7,1,3,4,6,2},
                {3,1,7,2,4,6,9,8,5},
                {6,4,2,5,9,8,1,7,3}
        };


        checkSudoku(sudoku);
    }

    private static void checkSudoku(int[][] sudoku) {
        System.out.println(((checkRow(sudoku) && checkCol(sudoku) && checkBox(sudoku)) ? "Valid " : "Invalid ") + "solution");
    }

    private static boolean checkBox(int[][] sudoku) {
        // go box by box
        for (int k = 0; k < 9; k+=3) {
            for (int l = 0; l < 9; l+=3) {

                // go inside each box and check

                int[] count = new int[9];
                for (int i = k; i < k + 3; i++) {
                    for (int j = l; j < l + 3; j++) {
                        count[sudoku[i][j] - 1]++;
                    }
                }
                for (int i = 0; i < 9; i++) {
                    if(count[i] == 2) return false;
                }

            }
        }

        return true;
    }

    private static boolean checkRow(int[][] sudoku){
        int[] count = new int[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                count[sudoku[i][j] - 1]++;
            }
        }
        for (int i = 0; i < 9; i++) {
            if(count[i] == 2) return false;
        }
        return true;
    }

    private static boolean checkCol(int[][] sudoku){
        int[] count = new int[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                count[sudoku[j][i] - 1]++;
            }
        }
        for (int i = 0; i < 9; i++) {
            if(count[i] == 2) return false;
        }
        return true;
    }

}
