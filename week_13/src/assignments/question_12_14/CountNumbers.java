package assignments.question_12_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        //File file = new File("week_13/src/assignments/question_12_13/Text.txt");
        File file = new File(args[0]);
        Scanner input = new Scanner(file);

        double sum = 0;
        int count = 0;

        while (input.hasNext()){
            sum += input.nextDouble();
            count++;
        }

        System.out.println(
                "Sum of the numbers in the file: " + sum + "\n" +
                "Number of the integers: " + count + "\n" +
                "Average: " + sum / count
        );
    }
}
