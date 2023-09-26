import java.util.Scanner;

public class Question_04_08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an ASCII code:");

        int number = input.nextInt();

        char letter = (char) number;

        System.out.println("The character for ASCII code " + number + " is " + letter);
    }
}
