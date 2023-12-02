package assignments.question_12_19;


import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Question_12_19 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://en.wikipedia.org/wiki/The_Cranberries");
        Scanner input = new Scanner(url.openStream());
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
                url + " has" + "\n" +
                        chars + " characters" + "\n" +
                        words + " words" + "\n" +
                        lines + " lines"
        );
    }
}
