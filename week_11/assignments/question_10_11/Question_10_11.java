package week_11.assignments.question_10_11;

public class Question_10_11 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2,2,5.5);
        System.out.println(
                "Circle1 area: " + c1.getArea() + "\n" +
                "Circle1 perimeter: " + c1.getPerimeter() + "\n" +
                "Does circle1 contain the point (3, 3)? --> " + c1.contains(3,3) + "\n" +
                "Does circle1 contain the circle centered at (4, 5) and radius 10.5? --> " + c1.contains(new Circle2D(4,5,10.5)) + "\n" +
                "Does circle1 overlap the circle centered at (3, 5) and radius 2.3? --> " + c1.contains(new Circle2D(3,5,2.3)) + "\n"
        );
    }
}
