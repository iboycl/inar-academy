import java.util.Scanner;

public class Question_03_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates:");

        double x = input.nextDouble();
        double y = input.nextDouble();

        double circleCenterX = 0;
        double circleCenterY = 0;
        double radius = 10;


        String distance = Math.sqrt(Math.pow(x - circleCenterX, 2) + Math.pow(y - circleCenterY, 2)) <= radius ? "" : "not ";

        System.out.printf("Point (%.1f, %.1f) is %sin the circle.",x, y, distance);
    }
}
