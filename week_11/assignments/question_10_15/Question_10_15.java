package week_11.assignments.question_10_15;

import java.util.Scanner;

public class Question_10_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];

        System.out.print("Enter five points: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        double top = points[0][1];
        double bottom = points[0][1];
        double left = points[0][0];
        double right = points[0][0];

        for (int i = 1; i < 5; i++) {
            if (points[i][0] < left) left = points[i][0];
            if (points[i][0] > right) right = points[i][0];
            if (points[i][1] < bottom) bottom = points[i][1];
            if (points[i][1] > top) top = points[i][1];
        }

        double width = Math.abs(right - left);
        double height = Math.abs(top - bottom);
        double cenX = (right - left)/2 + left;
        double cenY = (top - bottom)/2 + bottom;

        System.out.printf("The bounding rectangle's center (%.2f, %.2f), width %.2f, height %.2f", cenX, cenY, width, height);

    }
}
