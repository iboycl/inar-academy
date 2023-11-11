package week_11.assignments.question_10_13;

public class Question_10_13 {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(-5, -6, 6, 4);
        MyRectangle2D r2 = new MyRectangle2D(-6, -6, 2, 2);
        MyRectangle2D r3 = new MyRectangle2D(-2.5, -8, 3, 2);
        MyRectangle2D r4 = new MyRectangle2D(-2, -4, 1, 1);
        MyRectangle2D r5 = new MyRectangle2D(-7.5, -4.5, 3, 2);
        MyRectangle2D r6 = new MyRectangle2D(-8, -8, 3, 2);


        System.out.println(
                "Rectangle 1 (5, 10, 6, 4):" + "\n" +
                        "Area: " + r1.getArea() + "\n" +
                        "Perimeter: " + r1.getPerimeter() + "\n" +
                        "Is point(4, 11) in the r1? : " + r1.contains(-5, -5) + "\n" +
                        "Is rectangle (4, 10, 2, ,2) in the r1? : " + r1.contains(r2) + "\n" +
                        "Does rectangle (8, 10, 2, 2) overlap with r1? : " + r1.overlaps(r3) + "\n" +
                        r1.overlaps(r4) + "\n" +
                        r1.overlaps(r5) + "\n" +
                        r1.overlaps(r6) + "\n"
        );
    }
}
