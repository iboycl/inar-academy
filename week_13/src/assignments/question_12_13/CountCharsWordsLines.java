package assignments.question_12_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountCharsWordsLines {
    public static void main(String[] args) throws FileNotFoundException {
        //File file = new File("week_13/src/assignments/question_12_13/Text.txt");
        File file = new File(args[0]);
        Scanner input = new Scanner(file);
        String str = "";

        while (input.hasNext()){
            str = str + input.nextLine() + "\n";
        }

        int chars = str.length()-1;

        int lines = 0;
        int index = 0;

        while (index != str.length() - 1){
            index = str.indexOf("\n", index + 1);
            lines++;
        }

        int words = lines;
        index = 0;
        while (index != - 1){
            index = str.indexOf("\s", index + 1);
            if (index != -1) words++;
        }

        System.out.println(
                "File " + file.getName() + " has" + "\n" +
                chars + " characters" + "\n" +
                words + " words" + "\n" +
                lines + " lines"
                );
    }
}
