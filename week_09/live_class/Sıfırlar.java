package week_09.live_class;

public class Sıfırlar {
    public static void main(String[] args) {
        int[][] array = {
                {0, 1, 0},
                {1, 0, 1},
                {0, 1, 0}
        };

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) count++;
            }
        }

        System.out.println("Count of zeros = " + count);
    }
}
