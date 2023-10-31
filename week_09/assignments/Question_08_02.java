package week_09.assignments;

public class Question_08_02 {
    public static void main(String[] args) {
        double[][] matrix = GetDoubleArray.getDoubleArray(4,4);
        System.out.println("Sum of the elements in the major diagonal is " + diagonalSum(matrix));

    }

    private static double diagonalSum(double[][] m) {
        double total = 0;

        for (int row = 0; row < m.length; row++) {
            total += m[row][row];
        }
        return total;
    }
}
