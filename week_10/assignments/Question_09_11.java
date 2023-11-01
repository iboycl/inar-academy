package week_10.assignments;

import java.util.Scanner;

public class Question_09_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        LinearEquation eq1 = new LinearEquation(input.nextDouble(), input.nextDouble(), input.nextDouble(),
                input.nextDouble(), input.nextDouble(), input.nextDouble());

        if (eq1.isSolvable()){
            System.out.println("x is " + eq1.getX() + " and y is " + eq1.getY());
        } else System.out.println("The equation has no solution");
    }
}
