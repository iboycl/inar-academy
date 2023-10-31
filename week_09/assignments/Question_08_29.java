package week_09.assignments;

import java.util.Arrays;

public class Question_08_29 {
    public static void main(String[] args) {
        System.out.print("Enter list1: ");
        int[][] list1 = GetIntArray.getIntArray(3,3);

        System.out.print("Enter list2: ");
        int[][] list2 = GetIntArray.getIntArray(3,3);


        /*int[][] list1 ={
                {51, 5, 22},
                {6, 1, 4},
                {24, 54, 6}
        };
        int[][] list2 ={
                {51, 22, 25},
                {6, 1, 4},
                {24, 54, 6}
        };*/

        System.out.println(Arrays.deepToString(list1));

        System.out.println();

        System.out.println(Arrays.deepToString(list2));

        System.out.println("The two arrays are "+ (equals(list1, list2) ? "" : "not ") + "identical");

        System.out.println(Arrays.deepToString(list1));

        System.out.println();

        System.out.println(Arrays.deepToString(list2));
    }

    public static boolean equals(int[][] m1, int[][] m2){
        if (m1.length != m2.length) return false;
        for (int i = 0; i < m1.length; i++) {
            SelectionSort.selectionSort(m1[i]);
            SelectionSort.selectionSort(m2[i]);
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i].length != m2[i].length) return false;
                if (m1[i][j] != m2[i][j]) return false;
            }
        }
        return true;
    }
}
