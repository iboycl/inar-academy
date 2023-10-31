package week_09.assignments;

public class Question_08_06 {
    public static void main(String[] args) {
        double [][] matrix1 = GetDoubleArray.getDoubleArray(3, 3);
        double [][] matrix2 = GetDoubleArray.getDoubleArray(3, 3);

        double[][] matrixSum =  multiplyMatrix(matrix1, matrix2);

        for (int i = 0; i < matrixSum.length; i++) {
            for (double e : matrixSum[i]) System.out.printf("%.1f ", e);
            System.out.println();
        }
    }


    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        double[][] sum = new double[a.length][b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a.length; k++) {
                    sum[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return sum;
    }
}
