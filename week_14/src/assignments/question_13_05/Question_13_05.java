package assignments.question_13_05;

import live_class.Circle;
import live_class.GeometricObject;
import live_class.Rectangle;

public class Question_13_05 {
    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(5, "green", false);
        GeometricObject circle2 = new Circle(3, "purple", true);

        System.out.println("The larger of the two circles is: ");

        GeometricObject.max(circle1, circle2);

        System.out.println("-----------------------------------------------");
        GeometricObject rectangle1 = new Rectangle(6,5, "yellow", true);
        GeometricObject rectangle2 = new Rectangle(2,3, "pink", false);

        System.out.println("The larger of the two rectangles is: ");

        GeometricObject.max(rectangle2, rectangle1);

    }
}
