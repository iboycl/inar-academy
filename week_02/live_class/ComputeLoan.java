import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // annualInterestRate
        System.out.println("Enter annual interest rate: ");

        double annualInterestRate = input.nextDouble();

        // numberOfYears
        System.out.println("Enter year number: ");

        int numberOfYears = input.nextInt();
        // loanAmount
        System.out.println("Enter loan amount: ");

        double loanAmount = input.nextDouble();
        // monthlyInterestRate -- annualInterestRate / 1200

        double monthlyInterestRate = annualInterestRate / 1200;

        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)) );

        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("Monthly payment is " + (int) (monthlyPayment * 100) / 100.0);
        System.out.println("Total payment is " + (int) (totalPayment * 100) / 100.0);
    }
}
