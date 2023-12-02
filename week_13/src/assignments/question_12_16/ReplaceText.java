package assignments.question_12_16;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) throws Exception {
        // Check command line parameter usage
        if (args.length != 3) {
            System.out.println("Usage: java ReplaceText sourceFile oldStr newStr");
            System.exit(1);
        }

        // Check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        StringBuilder str = new StringBuilder();

        try (
                // Create input file
                Scanner input = new Scanner(sourceFile);
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[1], args[2]);
                str.append(s2).append("\n");
            }
        }

        try (PrintWriter output = new PrintWriter(sourceFile)){
            output.println(str);
        }
    }
}
