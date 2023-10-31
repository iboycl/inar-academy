package week_09.assignments;

public class Question_08_27 {
    public static void main(String[] args) {
        double[][] matrix = {
                {0.15, 0.875, 0.375},
                {0.55, 0.005, 0.225},
                {0.30, 0.12, 0.5}
        };

        System.out.println("The column-sorted array is:");
        double[][] colSorted = sortCols(matrix);
        PrintMatrix.printMatrix(colSorted);
    }

    public static double[][] sortCols(double[][] m){
        double[][] sorted = m.clone();
        SelectionColSort.selectionColSort(sorted);

        return sorted;
    }
}
