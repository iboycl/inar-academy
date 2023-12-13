package assignments.question_15_03;

import java.util.Arrays;

public class Question_15_03 {
    public static void main(String[] args) {
        Point[] points = new Point[100];

        for (int i = 0; i < 100; i++) {
            points[i] = new Point(
                    (int)(Math.random() * 100) + (Math.random()),
                    (int)(Math.random() * 100) + (Math.random())
            );
        }

        for (int i = 1; i <= 100; i++) {
            System.out.print(points[i-1] + " | ");
            if (i % 10 == 0) System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Increasing order of their x-coordinates");
        Arrays.sort(points);
        for (int i = 1; i <= 100; i++) {
            System.out.print(points[i-1] + " | ");
            if (i % 10 == 0) System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Increasing order of their y-coordinates");
        Arrays.sort(points, new CompareY());
        for (int i = 1; i <= 100; i++) {
            System.out.print(points[i-1] + " | ");
            if (i % 10 == 0) System.out.println();
        }

        System.out.println();
    }
}
