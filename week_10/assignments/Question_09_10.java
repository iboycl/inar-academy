package week_10.assignments;

import java.util.Scanner;

public class Question_09_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");

        QuadraticEquation eq1 = new QuadraticEquation(input.nextInt(), input.nextInt(), input.nextInt());

        if (eq1.getRoot1() != 0 && eq1.getRoot2() != 0){
            System.out.println("The equation has two roots " + eq1.getRoot1() + " and " + eq1.getRoot2() );
        } else if (eq1.getRoot1() == eq1.getRoot2() && eq1.getRoot2() != 0) {
            System.out.println("The equation has one root " + eq1.getRoot1());
        } else System.out.println("The equation has no real roots");

    }
}
