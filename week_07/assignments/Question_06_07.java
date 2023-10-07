import java.util.Scanner;

public class Question_06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        int investmentAmount = input.nextInt();

        System.out.print("Enter the annual percentage yield: ");
        double yearlyInterestRate = input.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        System.out.println("Years Future Value");

        double saving = investmentAmount;
        for (int i = 1; i <= years; i++) {
            saving = futureInvestmentValue(saving, yearlyInterestRate, years);
            System.out.printf("%-5d %.2f\n", i , saving);
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double yearlyInterestRate, int years){
        double saving = investmentAmount;
        for (int i = 0; i < 12; i++) {
            saving *= (1 + yearlyInterestRate / 1200);
        }
        return saving;
    }
}
