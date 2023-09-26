import java.util.Scanner;

public class Question_04_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the bounding circle: ");

        double radius = input.nextDouble();

        System.out.println("The coordinates of five points on the pentagon are");

        for (int i = 0; i < 5; i++) {

            double x = radius * Math.sin(2.0 * Math.PI / 5.0 * i);
            double y = radius * Math.cos(2.0 * Math.PI / 5.0 * i);
            System.out.println("(" + x + " " + y +   ")");
        }

    }
}
