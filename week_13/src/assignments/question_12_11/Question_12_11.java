package assignments.question_12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Question_12_11 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("week_13/src/assignments/question_12_11/test.txt");
        try {
            try (PrintWriter output = new PrintWriter(file)) {
                output.println("John went to school. John likes dancing.");
                output.println("John lives in US.");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
