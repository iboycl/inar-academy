package week_09.assignments;

public class Question_08_22 {
    public static void main(String[] args) {
        int[][] matrix = randomMatrix(6,6);
        /*int[][] matrix = {
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
        };*/
        printMatrix(matrix);
        System.out.println("Every row " + (checkEvenRow(matrix) ? "has" : "does not have") + " an even number of 1s");
        System.out.println("Every column " + (checkEvenCol(matrix) ? "has" : "does not have") + " an even number of 1s");


    }

    private static boolean checkEvenRow(int[][] m){
        for (int i = 0; i < m.length; i++) {
            int sum = 0;
            for (int j = 0; j < m[0].length; j++) {
                sum += m[i][j];
            }
            if (sum == 0 || !(sum % 2 == 0)) return false;
        }
        return true;
    }

    private static boolean checkEvenCol(int[][] m){
        for (int i = 0; i < m.length; i++) {
            int sum = 0;
            for (int j = 0; j < m[0].length; j++) {
                sum += m[j][i];
            }
            if (sum == 0 || !(sum % 2 == 0)) return false;
        }
        return true;
    }

    public static int[][] randomMatrix (int row, int col){
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }

        return matrix;
    }

    public static void printMatrix (int[][] m){
        for (int[] ints : m){
            for (int e : ints){
                System.out.print(e + " ");
            }
            System.out.println();
        }

    }
}
