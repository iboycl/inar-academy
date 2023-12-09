package assignments.question_13_01;

import live_class.GeometricObject;

import java.util.Scanner;

public class Question_13_01 {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter three side of the triangle: ");
        GeometricObject triangle = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
        input.nextLine();

        System.out.print("Enter the color of the triangle: ");
        triangle.setColor(input.nextLine());

        System.out.print("Enter: isFilled? true or false: ");
        triangle.setFilled(input.nextLine().contains("true"));


        System.out.println(triangle);
    }
}
