package week_09.assignments;

import java.util.Scanner;

public class Question_08_15 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        System.out.print("Enter five points:");

        double[][] points = new double[5][2];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = input.nextDouble();
            }
        }


        System.out.println("The five points are " + (sameLine(points) ? "" : "not ") + "on the same line");
     }

    public static boolean sameLine(double[][] points){
        boolean sameLine = true;
        for (int i = 0; i < points.length - 1; i++) {
            sameLine = ((points[points.length - 1][0] - points[0][0]) * (points[i][1] - points[0][1]) -
                    (points[i][0] - points[0][0]) * (points[points.length - 1][1] - points[0][1])) == 0;
        }

        return sameLine;
    }
}
