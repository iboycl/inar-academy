package week_11.assignments.question_10_5;

import java.util.Scanner;

public class Question_10_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");

        int number = input.nextInt();

        StackOfIntegers factor = new StackOfIntegers();

        for (int i = 2; number / i != 0; i++) {
            if (number % i == 0) {
                factor.push(i);
                number /= i;
                i--;
            }
        }

        System.out.print("Decreasing order: ");

        for (int i = factor.getSize() - 1; i >= 0; i--) {
            System.out.print(factor.getElements()[i] + " ");
        }

        System.out.print("\nWe used pop() method: ");

        for (int i = 0; i < factor.getSize(); i++) {
            System.out.print(factor.getElements()[i] + " ");
        }

    }

}
