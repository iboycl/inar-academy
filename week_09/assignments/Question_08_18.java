package week_09.assignments;

import java.util.Arrays;

public class Question_08_18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(m);
    }

    public static void shuffle(int[][] m){
        for (int i = 0; i < m.length; i++) {
            int[] temp = m[i];
            int random = (int) (Math.random() * m.length);
            m[i] = m[random];
            m[random] = temp;
        }

        for (int[] row : m){
            for (int e : row)
                System.out.print(e + " ");
            System.out.println();
        }

    }
}
