import java.util.Scanner;

public class Question_02_23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the driving distance:");

        double miles = input.nextDouble();

        System.out.println("Enter miles per gallon:");

        double gallon = input.nextDouble();

        System.out.println("Enter price per gallon:");

        double price = input.nextDouble();

        double cost = miles / gallon * price;

        System.out.println("The cost of driving is $" + String.format("%.2f", cost));


    }
}
