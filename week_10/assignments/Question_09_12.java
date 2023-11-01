package week_10.assignments;

import java.util.Scanner;

public class Question_09_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");

        IntersectingPoint eq1 = new IntersectingPoint(input.nextDouble(), input.nextDouble(), input.nextDouble(),
                input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());

        eq1.getSolution();
    }
}
