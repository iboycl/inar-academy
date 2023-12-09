package assignments.question_13_12;

import live_class.Circle;
import live_class.GeometricObject;
import live_class.Rectangle;

public class Question_13_12 {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[4];
        objects[0] = new Circle(3);
        objects[1] = new Circle(5);
        objects[2] = new Rectangle(4,8);
        objects[3] = new Rectangle(5,7);

        for (int i = 0; i < objects.length; i++) {
            System.out.println("Object " + (i + 1) + " area: " + objects[i].getArea());
        }

        System.out.println();
        System.out.println("Total area of Geometric objects: " + sumArea(objects));
    }

    public static double sumArea(GeometricObject[] a){
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].getArea();
        }
        return sum;
    }
}
