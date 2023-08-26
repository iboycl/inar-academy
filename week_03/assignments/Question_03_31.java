import java.util.Scanner;

public class Question_03_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa:");

        byte direction = input.nextByte();

        while (direction != 0 && direction != 1) {
                System.out.println("Incorrect input. Enter 1 or 0:");
                direction = input.nextByte();
        }

        System.out.println("Enter the exchange rate from USD to RMB:");

        double rate = input.nextDouble();

        System.out.println("Enter the " + (direction == 0 ? "USD" : "RMB") + " amount:");

        double amount = input.nextDouble();

        System.out.println(amount + (
                direction == 0 ?
                " USD is " + String.format("%.2f", amount * rate) + " RMB" :
                " RMB is " + String.format("%.2f", amount / rate) + " USD"
                )

        );


    }
}
