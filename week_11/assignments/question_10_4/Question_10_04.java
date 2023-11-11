package week_11.assignments.question_10_4;

import java.util.Arrays;

public class Question_10_04 {
    public static void main(String[] args) {
        MyPoint pnt1 = new MyPoint(0,0);
        MyPoint pnt2 = new MyPoint(10,30.5);

        System.out.printf("The distance between (%.1f, %.1f) and (%.1f, %.1f) is: %.4f",
                pnt1.getX(), pnt1.getY(), pnt2.getX(), pnt2.getY(), pnt1.distance(pnt2));

    }
}
