package week_06.assignments;

import java.util.Scanner;

public class Question_05_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount(e.g., 100): ");
        int amount = input.nextInt();

        System.out.print("Enter the annual interest rate: ");
        double interest = input.nextDouble();

        System.out.print("Enter the number of months: ");
        int months = input.nextInt();

        double saving = 0;

        for (int i = 0; i < months; i++) {
            saving = (amount + saving) * (1 + interest / 1200);
        }
        System.out.printf("Amount in saving account after %d months %.2f", months, saving);

    }
}
