package week_09.assignments;

public class Question_08_26 {
    public static void main(String[] args) {
        double[][] matrix = {
                {0.15, 0.875, 0.375},
                {0.55, 0.005, 0.225},
                {0.30, 0.12, 0.5}
        };

        System.out.println("The row-sorted array is:");
        double[][] rowSorted = sortRows(matrix);
        PrintMatrix.printMatrix(rowSorted);
    }

    public static double[][] sortRows(double[][] m){
        double[][] sorted = m.clone();
        for (double[] doubles : sorted) {
            SelectionSort.selectionSort(doubles);
        }

        return sorted;
    }
}
