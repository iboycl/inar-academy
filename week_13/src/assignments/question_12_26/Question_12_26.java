package assignments.question_12_26;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Question_12_26 {
    public static void main(String[] args) throws FileNotFoundException {
        //File directory = new File("week_13/src/assignments/question_12_26/files");
        File directory = new File(args[0]);
        ArrayList<String> files = new ArrayList<>(List.of(Objects.requireNonNull(directory.list())));

        for (int i = 0; i < files.size(); i++) {
            StringBuilder str = new StringBuilder();
            File file = new File(args[0] + "/" + files.get(i));
            try (Scanner input = new Scanner(file)){
                while (input.hasNext()){
                    String line = input.nextLine();
                    for (int j = 0; j < line.length(); j++) {
                        if (
                                j < line.length() - 1 &&
                                Character.isDigit(line.charAt(j)) &&
                                line.charAt(j+1) == '_' &&
                                !Character.isDigit(line.charAt(j - 1))
                        ){
                            String before = line.substring(0, j);
                            before += "0" + line.substring(j);
                            line = before;
                            j++;
                        }

                        if (    j < line.length() - 2 &&
                                line.charAt(j) == '_' &&
                                Character.isDigit(line.charAt(j + 1)) &&
                                !Character.isDigit(line.charAt(j + 2))
                        ) {
                            String before = line.substring(0, j + 1);
                            before += "0" + line.substring(j + 1);
                            line = before;
                        }

                        else if (
                                j == line.length() - 2 &&
                                line.charAt(j) == '_' &&
                                Character.isDigit(line.charAt(j + 1))
                        ) {
                            String before = line.substring(0, j + 1);
                            before += "0" + line.substring(j + 1);
                            line = before;
                        }
                    }
                    str.append(line).append("\n");
                }


            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

            try (PrintWriter output = new PrintWriter(file)){
                output.println(str);
            }
        }

    }
}
