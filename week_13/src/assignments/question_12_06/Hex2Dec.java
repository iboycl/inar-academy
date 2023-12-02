package assignments.question_12_06;

import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        try {

            String hex = input.nextLine();
            System.out.println("The decimal value for hex number " + hex + " is " + Integer.parseInt(hex.toUpperCase(),16));
        } catch (NumberFormatException ex){
            System.out.println("It's not a hex string.!");
        }
    }
}
