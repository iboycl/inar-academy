package assignments.question_12_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
//C:\Users\Lenovo\workspace\Test.Test\src\week_13\src\assignments\question_12_17\hangman.txt Test.Test/src/week_13/src/assignments/question_12_17
public class Question_12_17 {
    public static void main(String[] args) throws FileNotFoundException {
        hangMan();
    }
    public static void hangMan() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        File file = new File("week_13/src/assignments/question_12_17/hangman.txt");

        ArrayList<String> words = new ArrayList<>();

        try (Scanner input2 = new Scanner(file)){
            while (input2.hasNext()){
                words.add(input2.next());
            }
        }

        String pick = words.get((int) (Math.random() * 6));

        char[] asterisks = new char[pick.length()];
        Arrays.fill(asterisks, '*');

        int miss = 0;

        boolean compare = true;

        while (compare){
            System.out.print("(Guess) Enter a letter in word ");
            for (char e : asterisks) System.out.print(e);
            System.out.print(" > ");
            String chr = input.next();
            if (chr.length() > 1) {
                System.out.println("Enter only one letter!");
                continue;
            }

            char c = chr.charAt(0);

            if (Arrays.toString(asterisks).indexOf(c) != -1) {
                System.out.println(c + " is already in the word");
                continue;
            }

            if (pick.indexOf(c) == -1){
                System.out.println(c + " is not in the word");
                miss++;
                continue;
            }

            if (pick.contains(chr)){
                for (int i = 0; i < pick.length(); i++) {
                    if (pick.charAt(i) == c){
                        asterisks[i] = c;
                    }
                }
            }

            for (int i = 0; i < pick.length(); i++) {
                compare = false;
                if (pick.charAt(i) != asterisks[i]) {
                    compare = true;
                    break;
                }

            }
        }

        System.out.println("The word is \"" + pick + "\". You missed " + miss + ((miss > 1) ? " times." : " time."));

        System.out.println("Do you want to guess another word? Enter y or n >");
        if (Objects.equals(input.next(), "y")){
            hangMan();
        } else System.out.println("See you next time!");
    }
}
