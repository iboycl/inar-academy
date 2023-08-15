import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Enter amount of money :");

        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        int dollars = remainingAmount / 100;

        int quarters = (remainingAmount %= 100) / 25;

        int dimes = (remainingAmount %= 25) / 10;

        int nickels = (remainingAmount %= 10) / 5;

        int pennies = remainingAmount %= 5;

        System.out.println("Your amount " + amount + " consits of:");
        System.out.println(dollars + " dollars");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }
}
