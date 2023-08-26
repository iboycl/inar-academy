import java.util.Scanner;

public class Question_03_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates:");

        double x = input.nextDouble();
        double y = input.nextDouble();

        double rectangleCenterX = 0;
        double rectangleCenterY = 0;
        double rectangleWidth = 10;
        double rectangleHeight = 5;


        String distance =  x <= rectangleCenterX + rectangleWidth / 2 && y <= rectangleCenterY + rectangleHeight / 2 ? "" : "not ";

        System.out.printf("Point (%.1f, %.1f) is %sin the rectangle.",x, y, distance);
    }
}
