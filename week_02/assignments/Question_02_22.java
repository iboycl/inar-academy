import java.util.Scanner;

public class Question_02_22 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount as an integer, for example 1156 for 11.56:");

        int value = input.nextInt();


        int dollars = value / 100;

        int quarters = (value %= 100) / 25;

        int dimes = (value %= 25) / 10;

        int nickels = (value %= 10) / 5;

        int pennies = value %= 5;

        System.out.println("Your amount " + value + " consits of:");
        System.out.println(dollars + " dollars");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");

    }

}
