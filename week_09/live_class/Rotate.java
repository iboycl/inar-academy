package week_09.live_class;

public class Rotate {
    public static void main(String[] args) {
        int[][] m = {{5,1,9,11}, {2,4,8,10}, {13,3,6,7}, {15,14,12,16}};

        for (int[] row : m) {
            for (int e : row) System.out.print(e + " ");
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < m.length; i++) {
            for (int j = i + 1; j < m.length; j++) {

                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }

        for (int[] row : m) {
            for (int e : row) System.out.print(e + " ");
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length / 2; j++) {
                int temp = m[i][j];
                m[i][j] = m[i][m.length - j - 1];
                m[i][m.length - j - 1] = temp;
            }
        }

        for (int[] row : m) {
            for (int e : row) System.out.print(e + " ");
            System.out.println();
        }

    }
}
