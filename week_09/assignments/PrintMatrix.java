package week_09.assignments;

public class PrintMatrix {
    public static void printMatrix (int[][] m){
        for (int[] ints : m){
            for (int e : ints){
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
    public static void printMatrix (double[][] m){
        for (double[] ints : m){
            for (double e : ints){
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
