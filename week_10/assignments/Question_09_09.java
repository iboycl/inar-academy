package week_10.assignments;

public class Question_09_09 {
    public static void main(String[] args) {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(6,4);
        RegularPolygon poly3 = new RegularPolygon(10,4,5.6,7.8);

        System.out.println(
                "\nFirst RegularPolygon perimeter is  : " + poly1.getPerimeter() +
                        " area is : " + poly1.getArea() +
                "\nSecond RegularPolygon perimeter is : " + poly2.getPerimeter() +
                        " area is : " + poly2.getArea() +
                "\nThird RegularPolygon perimeter is  : " + poly3.getPerimeter() +
                        " area is : " + poly3.getArea()
        );
    }
}
