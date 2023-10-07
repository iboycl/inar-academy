package week_09.live_class;

public class BenzerleriBul {
    public static void main(String[] args) {
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] array2 = {
                {3, 7, 8},
                {6, 2, 4}
        };

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                for (int k = 0; k < array2.length; k++) {
                    for (int l = 0; l < array2[k].length; l++) {
                        if (array1[i][j] == array2[k][l]) System.out.println("Common element found: " + array1[i][j]);
                    }
                }
            }
        }
    }
}
