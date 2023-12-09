package assignments.question_13_06;

import live_class.Circle;
import live_class.GeometricObject;

public class Question_13_06 {
    public static void main(String[] args) {
        System.out.println("Circle1:");
        GeometricObject circle1 = new Circle(16.5, "blue", true);
        System.out.println(circle1);

        System.out.println();

        System.out.println("Circle2:");
        GeometricObject circle2 = new Circle(20.3, "purple", true);
        System.out.println(circle2);

        System.out.println();

        switch (circle1.compareTo(circle2)){
            case 1 -> System.out.println("Circle1 is the larger of the two Circles");
            case -1 -> System.out.println("Circle2 is the larger of the two Circles");
            case 0 -> System.out.println("They are equal");
        }
    }
}
