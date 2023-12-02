package assignments.question_12_11;

import java.io.*;
import java.util.Scanner;

public class RemoveText {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[1]);
        Scanner input = new Scanner(file);
        StringBuilder content = new StringBuilder();

        while (input.hasNext()){
            String str = input.nextLine();
            System.out.println(str);
            content.append(str.replace(args[0],"")).append("\n");
            System.out.println(content);
        }

        try (PrintWriter output = new PrintWriter(file)){
            output.println(content);
        }


        /*File file = new File(args[1]);
        Scanner input = new Scanner(file);


        while (input.hasNext()){
            String str = input.next().replace(args[0],"");
            try (PrintWriter output = new PrintWriter(file)){
                output.print(str);
            }
        }*/
    }
}
