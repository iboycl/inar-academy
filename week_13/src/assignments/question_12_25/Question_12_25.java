package assignments.question_12_25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_12_25 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter directory name: ");

        String name = input.nextLine();

        String directory = "week_13/src/assignments/question_12_25/";
        File file = new File(directory + name);

        if (file.mkdir()){
            System.out.println("Directory was created successfully");
        } else System.out.println("Directory already exists");
    }
}
