package assignments.question_12_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_12_21 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("week_13/src/assignments/question_12_21/SortedStrings.txt");
        ArrayList<String> str = new ArrayList<>();
        try (Scanner input = new Scanner(file)){
            while (input.hasNext()){
                str.add(input.nextLine());
            }
        }

        ArrayList<String> strSorted = new ArrayList<>(str);
        Collections.sort(strSorted);
        System.out.println();

        ArrayList<Integer> first2Strings = new ArrayList<>();
        if (str.equals(strSorted)) {
            System.out.println("The strings are sorted.");
        } else {
            for (int i = 0; i < str.size(); i++) {
                if (!str.get(i).equals(strSorted.get(i))){
                    first2Strings.add(i);
                }
            }
            System.out.printf("The strings %d and %d are out of order.", first2Strings.get(0), first2Strings.get(1));

        }

    }
}
