package assignments.question_12_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_12_15 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Text.txt");
        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            numbers.append((int) (Math.random() * 100)).append(" ");
        }

        try (PrintWriter output = new PrintWriter(file)) {
            output.println(numbers);
        }

        ArrayList<Integer> nums = new ArrayList<>();
        try (Scanner input = new Scanner(file)){
            while (input.hasNext()){
                nums.add(input.nextInt());
            }
        }
        Collections.sort(nums);

        for (int i = 0; i < nums.size(); i++) {
            System.out.printf("%2d ", nums.get(i));
            if (i != 0 && (i + 1) % 10 == 0)System.out.println();
        }

    }
}
