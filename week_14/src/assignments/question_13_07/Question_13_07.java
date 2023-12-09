package assignments.question_13_07;

import live_class.Circle;
import live_class.GeometricObject;
import live_class.Rectangle;

public class Question_13_07 {
    public static void main(String[] args) {
        GeometricObject[] objs = new GeometricObject[5];
        objs[0] = new Circle(6);
        objs[1] = new Rectangle(3, 6);
        objs[2] = new Circle(12);
        objs[3] = new Square(4.0);
        objs[4] = new Square(7.0);

        for (int i = 0; i < objs.length; i++) {
            System.out.println("Area of Geometric Object in the index " + i + " is : " + objs[i].getArea());
            if (objs[i] instanceof Colorable) ((Colorable) objs[i]).howToColor();
            System.out.println("------------------------------------------------------");
        }
    }
}
