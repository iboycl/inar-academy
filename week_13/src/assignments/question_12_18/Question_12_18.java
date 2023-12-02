package assignments.question_12_18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
// C:\Users\Lenovo\workspace\Test.Test\src\week_13\srcRootDirectory\chapter1\test1.java
public class Question_12_18 {
    public static void main(String[] args) throws FileNotFoundException {
        for (int i = 1; i <= 5; i++) {
            String path = "C:/Users/Lenovo/workspace/Test.Test/src/week_13/srcRootDirectory/chapter" + i + "/test" + i + ".java";
            File file = new File(path);
            StringBuilder str = new StringBuilder();
            String pack = "package chapter" + i +";";
            str.append(pack).append("\n").append("\n");
            try (Scanner input = new Scanner(file)){
                while (input.hasNext()){
                    str.append(input.nextLine()).append("\n");
                }
            }

            try (PrintWriter output = new PrintWriter(file)){
                output.println(str);
            }

        }
    }
}
