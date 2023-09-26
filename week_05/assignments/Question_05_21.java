import java.util.Scanner;

public class Question_05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the loan amount: ");
        int loan = input.nextInt();

        System.out.print("Enter the number of years: ");
        int year = input.nextInt();

        System.out.println("Interest Rate  Monthly Payment  Total Payment");

        for (double i = 5; i <= 8; i+= 0.125) {
            double month = loan * (i/1200) / (1 - 1 / Math.pow(1 + (i/1200), year * 12));
            double total = month * 12 * year;
            System.out.printf("%.3f%% %14.2f %18.2f\n", i, month, total);
        }
    }
}
