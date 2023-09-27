package week_06.assignments;

import java.util.Scanner;

public class Question_05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int vowels = 0;
        int consonants = 0;
        int upper = 0;

        for (int i = 0; i < str.length(); i++) {
            String str2 = str.toLowerCase();
            char c = str2.charAt(i);
            if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowels++;
            } else if (Character.isLetter(c)) {
                consonants++;
            }

            if (Character.isUpperCase(str.charAt(i))){
                upper++;
            }
        }

        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);
        System.out.println("The number of uppercase letters is " + upper);
    }
}
