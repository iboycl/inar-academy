import java.util.Scanner;

public class Question_02_13 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the monthly saving amount:");

        int saving = input.nextInt();

        System.out.println("Enter how many months will you wait:");

        int month = input.nextInt();

        double interestRate = 0.00417;

        double total = 0;

        for (int i = 1; i <= month; i++){
            total = (total+ saving) * (1 + interestRate);
        }

        System.out.println("After the " + month + " the account value is $" + String.format("%.3f", total));
    }
}
