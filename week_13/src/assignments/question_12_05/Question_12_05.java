package assignments.question_12_05;

import java.util.Scanner;

public class Question_12_05 {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides of a triangle: ");
        try {
            Triangle triangle = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
            System.out.println(triangle);
        } catch (IllegalTriangleException ex){
            System.out.println(ex.getMessage());
        }

    }
}
