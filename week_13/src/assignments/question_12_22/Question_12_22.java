package assignments.question_12_22;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Question_12_22 {
    public static void main(String[] args) throws Exception {
        // Check command line parameter usage
        if (args.length != 3) {
            System.out.println("Usage: java ReplaceText sourceFile oldStr newStr");
            System.exit(1);
        }

        // Check if source file exists
        File sourceDirectory = new File(args[0]);
        if (!sourceDirectory.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        ArrayList<File> sourceFile = new ArrayList<>(List.of(Objects.requireNonNull(sourceDirectory.listFiles())));

        for (int i = 0; i < sourceFile.size(); i++) {

            StringBuilder str = new StringBuilder();

            try (
                    // Create input file
                    Scanner input = new Scanner(sourceFile.get(i));
            ) {
                while (input.hasNext()) {
                    String s1 = input.nextLine();
                    String s2 = s1.replaceAll(args[1], args[2]);
                    str.append(s2).append("\n");
                }
            }

            try (PrintWriter output = new PrintWriter(sourceFile.get(i))){
                output.println(str);
            }
        }


    }
}
