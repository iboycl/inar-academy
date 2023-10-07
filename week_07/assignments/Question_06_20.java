import java.util.Scanner;

public class Question_06_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String s = input.nextLine();
        System.out.println("The number of the letters in the string \"" + s + "\" : " + countLetters(s));
    }

    public static int countLetters(String s){
        int letters = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) letters++;
        }
        return letters;
    }
}
