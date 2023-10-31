package week_09.assignments;

public class Question_08_23 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,0,1,0,1,1},
                {1,1,1,1,0,0},
                {0,1,0,1,1,1},
                {1,1,1,1,1,1},
                {0,1,1,1,1,0},
                {1,1,0,0,0,1}
        };
        System.out.println("The flipped cell is at (" + checkEvenRow(matrix) + ", " + checkEvenCol(matrix) + ")");
    }



    private static int checkEvenRow(int[][] m){
        for (int i = 0; i < m.length; i++) {
            int sum = 0;
            for (int j = 0; j < m[0].length; j++) {
                sum += m[i][j];
            }
            if (!(sum % 2 == 0)) return i;
        }
        return -1;
    }

    private static int checkEvenCol(int[][] m){
        for (int i = 0; i < m.length; i++) {
            int sum = 0;
            for (int j = 0; j < m[0].length; j++) {
                sum += m[j][i];
            }
            if (!(sum % 2 == 0)) return i;
        }
        return -1;
    }
}
