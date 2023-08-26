import java.util.Scanner;

public class Question_03_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three-digit number:");

        int number = input.nextInt();

        if (number == ((number % 10) * 100) + ((number / 10) % 10) * 10 + ((number / 100) % 10)){
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
