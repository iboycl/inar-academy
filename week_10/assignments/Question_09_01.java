package week_10.assignments;

public class Question_09_01 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 =new Rectangle(3.5, 35.9);


        System.out.println("Rectangle 1: \n" +
                "Width = " + rectangle1.width + "\n" +
                "Height = " + rectangle1.height + "\n" +
                "Area = " + rectangle1.getArea() + "\n" +
                "Perimeter = " + rectangle1.getPerimeter() + "\n"
        );

        System.out.println("Rectangle 2: \n" +
                "Width = " + rectangle2.width + "\n" +
                "Height = " + rectangle2.height + "\n" +
                "Area = " + rectangle2.getArea() + "\n" +
                "Perimeter = " + rectangle2.getPerimeter() + "\n"
        );
    }
}
