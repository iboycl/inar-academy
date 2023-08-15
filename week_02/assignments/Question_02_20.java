import java.util.Scanner;

public class Question_02_20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");

        int balance = input.nextInt();

        double annualInterest = input.nextDouble();

        double interest = balance * (annualInterest / 1200);

        System.out.println("The interest is: " + interest);


    }
}
