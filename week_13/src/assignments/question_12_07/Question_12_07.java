package assignments.question_12_07;

import java.util.Scanner;

public class Question_12_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        try {
            String binary = input.nextLine();
            System.out.println("The decimal value for binary number " + binary + " is " + Integer.parseInt(binary,2));
        } catch (NumberFormatException ex){
            System.out.println("It's not a binary string.!");
        }
    }
}
