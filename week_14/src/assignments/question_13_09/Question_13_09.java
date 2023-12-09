package assignments.question_13_09;

import live_class.Circle;
import live_class.GeometricObject;

public class Question_13_09 {
    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(5);
        GeometricObject circle2 = new Circle(6);
        GeometricObject circle3 = new Circle(5);

        System.out.println("Is circle1 equal to circle2 -> " + circle1.equals(circle2));
        System.out.println("Is circle1 equal to circle3 -> " + circle1.equals(circle3));
    }
}
