import java.util.Scanner;

public class Question_03_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c:");

        double a = input.nextDouble();

        double b = input.nextDouble();

        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;

        double r1 = (-b + Math.pow(discriminant, 0.5)) / 2;

        double r2 = (-b - Math.pow(discriminant, 0.5)) / 2;

        if(discriminant > 0){
            System.out.printf("The equation has two roots %.6f and %.5f", r1, r2);
        } else if (discriminant == 0) {
            System.out.printf("The equation has one root %.0f", r1);
        } else {
            System.out.println("The equation has no real root");
        }

    }
}
