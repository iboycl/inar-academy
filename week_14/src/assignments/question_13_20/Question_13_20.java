package assignments.question_13_20;

import assignments.question_13_17.Complex;

import java.util.Scanner;

public class Question_13_20 {
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
            System.out.print("The roots are ");
            Complex root1 = new Complex(-b / (2 * a), Math.sqrt(2 * a));
            Complex root2 = new Complex(-b / (2 * a), -Math.sqrt(2 * a));
            System.out.println(root1 + " and " + root2);
        }
    }
}
