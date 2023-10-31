package week_09.assignments;

import java.util.Arrays;

public class Question_08_34 {
    public static void main(String[] args) {
        double[][] points = {
                {1.5,2.5},
                {-3,4.5},
                {5.6,-7},
                {6.5,-7},
                {8,1},
                {10,2.5},
                {10,-10}
        };
        System.out.printf("The rightmost lowest point is (%.1f, %.1f)",getRightmostLowestPoint(points)[0], getRightmostLowestPoint(points)[1]);
    }

    public static double[] getRightmostLowestPoint(double[][] points){

        double min = points[0][1];
        String minYIndexes = "";
        for (int i = 1; i < points.length; i++) {
            if (min > points[i][1]){
                min = points[i][1];
            }
        }
        for (int i = 0; i < points.length; i++) {
            if (points[i][1] == min) minYIndexes += i;
        }
        int maxIndex = Integer.parseInt(minYIndexes.charAt(0) + "");
        for (int i = 0; i < minYIndexes.length(); i++) {
            double max = points[Integer.parseInt(minYIndexes.charAt(0) + "")][0];
            int index = Integer.parseInt(minYIndexes.charAt(i) + "");
            if (max < points[index][0]){
                max = points[index][0];
                maxIndex = index;
            }
        }

        return points[maxIndex];
    }
}
