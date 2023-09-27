package week_06.assignments;

import java.util.Scanner;

public class Question_05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        int amount = input.nextInt();

        System.out.print("Enter the annual percentage yield: ");
        double interest = input.nextDouble();

        System.out.print("Enter the number of months: ");
        int months = input.nextInt();

        double saving = amount;

        System.out.println("Month CD Value");
        for (int i = 0; i < months; i++) {
            System.out.printf("%-6d", i + 1);
            saving *= (1 + interest / 1200);
            System.out.printf("%.2f\n", saving);
        }


    }
}
