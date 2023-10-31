package week_09.assignments;

public class Question_08_05 {
    public static void main(String[] args) {
        double [][] matrix1 = GetDoubleArray.getDoubleArray(3, 3);
        double [][] matrix2 = GetDoubleArray.getDoubleArray(3, 3);

        double[][] matrixSum =  addMatrix(matrix1, matrix2);

        for (int i = 0; i < matrixSum.length; i++) {
            for (double e : matrixSum[i]) System.out.print(e + " ");
            System.out.println();
        }
    }


    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] sum = new double[a.length][b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

}
