package week_09.live_class;

public class Test {

    //anlat

//    0000
//    1111
//    0011
//    0001

    // en büyük satır 1
    // en büyük sütun 3

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        checkRow(matrix);
        checkColumn(matrix);
    }

    private static void checkColumn(int[][] matrix) {
        int maxColumn = 0;
        int maxColumnIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            if (sum > maxColumn){
                maxColumn = sum;
                maxColumnIndex = i;
            }
        }

        System.out.println("The largest row index: " + maxColumnIndex);
    }

    private static void checkRow(int[][] matrix) {
        int maxRow = 0;
        int maxRowIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
            }
            if (sum > maxRow){
                maxRow = sum;
                maxRowIndex = i;
            }
        }

        System.out.println("The largest row index: " + maxRowIndex);

    }
}
