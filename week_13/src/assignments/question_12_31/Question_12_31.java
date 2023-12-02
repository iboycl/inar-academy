package assignments.question_12_31;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Question_12_31 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿");
        System.out.println("Year  Rank 1       Rank 2       Rank 3       Rank 4       Rank 5       Rank 1       Rank 2       Rank 3       Rank 4       Rank 5       ");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾ ");


        File names = new File("week_13/src/assignments/question_12_30/babynames");

        ArrayList<String> years = new ArrayList<>(List.of(Objects.requireNonNull(names.list())));

        for (int i = 9; i >= 0; i--) {

            File file = new File(String.valueOf(names.listFiles()[i]));
            ArrayList<String> boys = new ArrayList<>();
            ArrayList<String> girls = new ArrayList<>();

            try (Scanner line = new Scanner(file)){
                String str = "";
                for (int j = 0; j < 5; j++) {
                    str = line.nextLine();
                    boys.add(str.split("\t")[1]);
                    girls.add(str.split("\t")[2]);
                }
            }
            System.out.print((2001 + i) + "  ");
            for (int j = 0; j < 5; j++) {
                System.out.printf("%-12s ", girls.get(j));
            }
            for (int j = 0; j < 5; j++) {
                System.out.printf("%-12s ", boys.get(j));
            }
            System.out.println();
        }
    }
}
