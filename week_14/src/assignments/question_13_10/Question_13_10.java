package assignments.question_13_10;

import live_class.Rectangle;

public class Question_13_10 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(3, 5);
        Rectangle rec2 = new Rectangle(3, 5);
        Rectangle rec3 = new Rectangle(4, 6);


        System.out.println("Rectangle1 Area: " + rec1.getArea());
        System.out.println("Rectangle2 Area: " + rec2.getArea());
        System.out.println("Rectangle3 Area: " + rec3.getArea());
        System.out.println("Is rectangle1 equal to rectangle2 -> " + rec1.equals(rec2));
        System.out.println("Is rectangle1 equal to rectangle3 -> " + rec1.equals(rec3));
    }
}
