package week_09.live_class;

public class ConsecutiveFour {
    public static void main(String[] args) {

        int[][] matrix = {
                {0, 1, 0, 5, 1, 6, 2},
                {0, 1, 5, 8, 4, 6, 0},
                {5, 5, 0, 0, 6, 2, 1},
                {0, 5, 6, 3, 1, 1, 1},
                {5, 5, 5, 1, 0, 0, 7},
                {1, 2, 3, 5, 4, 0, 0}
        };
        System.out.println("Matrix has" + ((isConsecutiveFour(matrix)) ? "" : " not") +
                " consecuutive four numbers");
    }

    public static boolean isConsecutiveFour(int[][] m) {
        return (isConsecutiveFourAtRows(m) || isConsecutiveFourAtColumns(m) ||
                isConsecutiveFourAtDiagonal(m));
    }

    public static boolean isConsecutiveFourAtRows(int[][] m) {
        int count;
        for (int i = 0; i < m.length; i++) {
            count = 1; //Each row Update the count
            for (int j = 0; j < m[i].length - 1; j++) {
                if (m[i][j] == m[i][j + 1]) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 1; // for each number Update
                }
            }
        }
        return false;
    }

    public static boolean isConsecutiveFourAtColumns(int[][] m) {
        int count;
        for (int j = 0; j < m[0].length; j++) {
            count = 1; //Each column Update for the count variable
            for (int i = 0; i < m.length - 1; i++) {
                if (m[i][j] == m[i + 1][j]) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 1; // For each number update
                }
            }
        }
        return false;
    }

    public static boolean isConsecutiveFourAtDiagonal(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (isLeftDiagonal(i, j, m) || isRightDiagonal(i, j, m)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isRightDiagonal(int row, int column, int[][] m) {
        if (row >= m.length - 3) {
            return false;
        }
        if (column >= m[0].length - 3) {
            return false;
        }
        int number = m[row][column];
        int count = 1;

        for (int i = 1; i < 4; i++) {
            if (number == m[row + i][column + i]) {
                count++;
            }
        }
        if (count == 4) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLeftDiagonal(int row, int column, int[][] m) {
        if (row >= m.length - 3) {
            return false;
        }
        if (column < 3) {
            return false;
        }
        int number = m[row][column];
        for (int i = 1; i < 4; i++) {
            if (number != m[row + i][column - i]) {
                return false;
            }
        }
        return true;
    }
}
