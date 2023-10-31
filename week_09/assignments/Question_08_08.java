package week_09.assignments;

import week_09.live_class.FindNearestPoints;

import java.util.Scanner;

public class Question_08_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();
        double[][] points = new double[numberOfPoints][2];
        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        int p1 = 0, p2 = 1; // Initial two points
        double shortestDistance = FindNearestPoints.distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]); // Initialize shortestDistance

        // Compute distance for every two points
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = FindNearestPoints.distance(points[i][0], points[i][1], points[j][0], points[j][1]); // Find distance

                if (shortestDistance > distance) {
                    p1 = i; // Update p1
                    p2 = j; // Update p2
                    shortestDistance = distance; // Update shortestDistance
                }
            }
        }

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = FindNearestPoints.distance(points[i][0], points[i][1], points[j][0], points[j][1]); // Find distance

                if (shortestDistance == distance) {
                    System.out.println("The closest two points are " +
                            "(" + points[i][0] + ", " + points[i][1] + ") and (" +
                            points[j][0] + ", " + points[j][1] + ")");
                }
            }
        }

        System.out.println("Their distance is " + shortestDistance);
    }
}
