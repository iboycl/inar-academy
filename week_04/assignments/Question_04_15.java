import java.util.Arrays;
import java.util.Scanner;

public class Question_04_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        System.out.println("Enter a letter:");

        String letter = input.next();

        char ch = letter.toLowerCase().charAt(0);

        if (!Character.isLetter(ch) ) {
            System.out.println(letter + " is not a letter!");
        } else if (letter.length() > 1) {
            System.out.println("Enter only one letter!");
        } else {

            for (int i = 0; i < 10; i++){
                if (letters[i].indexOf(ch) != -1){
                    System.out.println("The corresponding number is " + i );
                    break;
                }
            }

        }
    }
}
