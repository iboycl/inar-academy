import java.util.Scanner;

public class Question_07_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b and c: ");
        double[] numbers = new double[3];

        for (int i = 0; i < 3; i++) {
            numbers[i] = input.nextDouble();
        }

        solveQuadratic(numbers);

    }

    public static void solveQuadratic(double[] numbers){
        double discriminant = numbers[1] * numbers[1] - 4 * numbers[0] * numbers[2];

        double r1 = (-numbers[1] + Math.pow(discriminant, 0.5)) / 2;

        double r2 = (-numbers[1] - Math.pow(discriminant, 0.5)) / 2;

        if(discriminant > 0){
            System.out.printf("The equation has two roots %.1f and %.1f", r1, r2);
        } else if (discriminant == 0) {
            System.out.printf("The equation has one root %.1f", r1);
        } else {
            System.out.println("The equation has no real root");
        }
    }
}
