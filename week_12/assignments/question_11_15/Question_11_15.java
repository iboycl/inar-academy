package question_11_15;

import week_11.assignments.question_10_4.MyPoint;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_15 {
    public static void main(String[] args) {
        ArrayList<MyPoint> points = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int num = input.nextInt();

        System.out.print("Enter the coordinates of the points: ");
        for (int i = 0; i < num; i++) {
            points.add(new MyPoint(input.nextDouble(), input.nextDouble()));
        }
        double area = 0;
        double xySum = 0;
        double yxSum = 0;

        for (int i = 0; i < points.size(); i++) {
            int j = (i + 1) % points.size();

            MyPoint p1 = points.get(i);
            MyPoint p2 = points.get(j);
            xySum += (p1.getX() * p2.getY());
            yxSum += (p1.getY() * p2.getX());
        }

        area = Math.abs(xySum - yxSum) / 2;

        System.out.print("The total area is " + area);
    }
}
