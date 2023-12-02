package assignments.question_12_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_20 {
    public static void main(String[] args) throws FileNotFoundException {
        for (int i = 1; i <= 5; i++) {
            String path = "C:/Users/Lenovo/workspace/Test.Test/src/week_13/srcRootDirectory/chapter" + i + "/test" + i + ".java";
            File file = new File(path);
            StringBuilder str = new StringBuilder();
            int line = 0;
            try (Scanner input = new Scanner(file)){
                while (input.hasNext()){
                    String lines = input.nextLine();
                    if (line != 0 && line != 1){
                        str.append(lines).append("\n");
                    }
                    line++;
                }
            }

            try (PrintWriter output = new PrintWriter(file)){
                output.println(str);
            }

        }
    }
}
