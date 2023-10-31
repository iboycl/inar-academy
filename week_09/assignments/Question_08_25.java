package week_09.assignments;

public class Question_08_25 {
    public static void main(String[] args) {
        double[][] matrix = {
                {0.15, 0.875, 0.375},
                {0.55, 0.005, 0.225},
                {0.30, 0.12, 0.5}
        };

        System.out.println("It is " + (isMarkov(matrix) ? "" : "not ") + "a Markov matrix");
    }

    private static boolean isMarkov(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            double sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[j][i] < 0) return false;
                sum += matrix[j][i];
            }
            if (sum != 1) return false;

        }
        return true;
    }
}
