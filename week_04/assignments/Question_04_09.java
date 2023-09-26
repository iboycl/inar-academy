import java.util.Scanner;

public class Question_04_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character:");

        String letter = input.next();

        int number = letter.charAt(0);

        System.out.println("The ASCII code for character " + letter + " is " + number);
    }
}
