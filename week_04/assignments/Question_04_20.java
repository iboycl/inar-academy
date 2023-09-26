import java.util.Scanner;

public class Question_04_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");

        String expression = input.next();

        int length = expression.length();

        char first = expression.charAt(0);

        System.out.println("Length of your string " + length + " and the first letter is " + first);
    }
}
