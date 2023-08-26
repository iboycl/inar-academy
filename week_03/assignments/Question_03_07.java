import java.util.Scanner;

public class Question_03_07 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount (e.g. 11.56):");


        int value = (int) (input.nextDouble() * 100);

        System.out.println(value);
        System.out.println("Your amount " + value / 100.00 + " consists of:");

        int dollars = value / 100;

        int quarters = (value %= 100) / 25;

        int dimes = (value %= 25) / 10;

        int nickels = (value %= 10) / 5;

        int pennies = value %= 5;

        System.out.println(dollars > 1 ? dollars + " dollars" : dollars + " dollar");
        System.out.println(quarters > 1 ? quarters + " quarters" : quarters + " quarter");
        System.out.println(dimes > 1 ? dimes + " dimes" : dimes + " dime");
        System.out.println(nickels > 1 ? nickels + " nickels" : nickels + " nickel");
        System.out.println(pennies > 1 ? pennies + " pennies" : pennies + " penny");

    }
}
