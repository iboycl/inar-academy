import java.util.Locale;
import java.util.Scanner;

public class Question_04_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String vowels = "AEIOU";

        System.out.println("Enter a letter:");

        String letter = input.next();

        if (letter.charAt(0) < 65 || letter.charAt(0) > 122) {
            System.out.println(letter + " is not a letter!");
        } else if (letter.length() > 1) {
            System.out.println("Enter only one letter!");
        } else if (vowels.indexOf(letter.toUpperCase().charAt(0)) != -1){

            System.out.println(letter + " is a vowel.");

        } else {
            System.out.println(letter + " is a consonant.");
        }
    }
}

