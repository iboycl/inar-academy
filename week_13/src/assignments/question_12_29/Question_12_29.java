package assignments.question_12_29;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_12_29 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String name = input.nextLine();

        File file = new File(name);
        StringBuilder str = new StringBuilder();
        try (Scanner text = new Scanner(file)){
            while (text.hasNext()){
                str.append(text.nextLine().toUpperCase() + "\n");
            }
        }

        for (int i = 'A'; i <= 'Z' ; i++) {
            int num = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == i) num++;
            }
            System.out.println("Number of " + (char)i + "'s: " + num);
        }

    }
}
