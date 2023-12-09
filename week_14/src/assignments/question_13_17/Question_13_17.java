package assignments.question_13_17;

import java.util.Scanner;

public class Question_13_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first complex number: ");
        Complex c1 = new Complex(input.nextDouble(), input.nextDouble());

        input.nextLine();
        System.out.print("Enter the second complex number: ");
        Complex c2 = new Complex(input.nextDouble(), input.nextDouble());
        input.nextLine();

        System.out.println(c1 + " + " + c2 + " = " + c1.add(c2));
        System.out.println(c1 + " - " + c2 + " = " + c1.subtract(c2));
        System.out.println(c1 + " * " + c2 + " = " + c1.multiply(c2));
        System.out.println(c1 + " / " + c2 + " = " + c1.divide(c2));
        System.out.println("|" + c1 + "| = " + c1.abs());
    }
}
