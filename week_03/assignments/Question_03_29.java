import java.util.Scanner;

public class Question_03_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter circle1's center x-, y-coordinates, and radius:");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double circle1Radius = input.nextDouble();

        System.out.println("Enter circle2's center x-, y-coordinates, and radius:");

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double circle2Radius = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (distance <= Math.abs(circle1Radius - circle2Radius)){
            System.out.println("circle2 is inside circle1");
        } else if (distance <= circle1Radius + circle2Radius) {
            System.out.println("circle2 is overlaps circle1");
        } else {
            System.out.println("circle2 does not overlap circle1");
        }
    }
}
