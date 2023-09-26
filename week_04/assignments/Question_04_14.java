import java.util.Locale;
import java.util.Scanner;

public class Question_04_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String grades = "FDCBA";

        System.out.println("Enter a letter grade:");

        String letter = input.next();

        if (!grades.contains(letter.toUpperCase())) {
            System.out.println(letter + " is not a grade!");
        } else if (letter.length() > 1) {
            System.out.println("Enter only one grade!");
        } else {
            System.out.println("The numeric value for grade " + letter + " is " + grades.indexOf(letter.toUpperCase()));
        }


    }
}
