import java.util.Scanner;

public class Question_05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the loan amount: ");
        int loan = input.nextInt();

        System.out.print("Enter the number of years: ");
        int year = input.nextInt();

        System.out.print("Enter the annual interest: ");
        double interest = input.nextDouble();

        double month = loan * (interest/1200) / (1 - 1 / Math.pow(1 + (interest/1200), year * 12));
        double total = month * 12 * year;

        System.out.printf("\nMonthly Payment: %.2f\n", month);
        System.out.printf("Total Payment: %.2f\n", total);

        System.out.println("\nPayment# Interest Principal Balance");
        double balance = loan;

        for (int i = 1; i <= year*12; i++) {

            double moInterest = (interest / 1200) * balance;
            double principle = month - moInterest;
            balance -= principle;
            System.out.printf("%-8d %-8.2f %-9.2f %.2f\n", i, moInterest, principle, balance);
        }
    }
}
