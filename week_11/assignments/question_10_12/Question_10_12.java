package week_11.assignments.question_10_12;

import week_11.assignments.question_10_4.MyPoint;

public class Question_10_12 {
    public static void main(String[] args) {
        Triangle2D tr1 = new Triangle2D(new MyPoint(2,2), new MyPoint(6,2), new MyPoint(4,6));

        System.out.println(
                "Area of the triangle: " + tr1.getArea() + "\n" +
                "Area of the perimeter: " + tr1.getPerimeter() + "\n" +
                "Does t1 contain (3.3)? : " + tr1.contains(new MyPoint(3, 3)) + "\n" +
                "Does t1 contain (new Triangle2D (new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))) : " +
                        tr1.contains(new Triangle2D (new MyPoint(3.26, 3), new MyPoint(4.56, 3), new MyPoint(4, 4))) + "\n" +
                "Does t1 overlaps (new Triangle2D(new MyPoint(2, 5.5) , new MyPoint(4, -3), MyPoint(2, 6.5)))? : " +
                        tr1.overLaps(new Triangle2D(new MyPoint(8, 4) , new MyPoint(4, 4), new MyPoint(8, 8)))
        );
    }
}
