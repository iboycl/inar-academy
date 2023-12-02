package assignments.question_12_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReformatJavaSource {
    public static void main(String[] args) throws FileNotFoundException {
        //File file = new File("week_13/src/assignments/question_12_12/Test.java");
        File file = new File(args[0]);
        Scanner input = new Scanner(file);
        StringBuilder content = new StringBuilder();
        String str = "";

        while (input.hasNext()){

            str = str + input.nextLine() + "\n";

            /*content.append(str).append("\n");
            int index = content.indexOf("\n\\s{");
            if (index != -1){
                content.replace(index,index + 2, " {\n");
            }*/
        }

        //System.out.println(str);

        str = str.replaceAll("\\n\\s*\\{", " {");
        //System.out.println(str);
        try (PrintWriter output = new PrintWriter(file)){
            output.println(str);
        }
    }
}
