package assignments.question_12_30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class Question_12_30 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        String year = input.nextLine();

        System.out.print("Enter the gender: ");
        String gender = input.nextLine();

        System.out.print("Enter the name: ");
        String name = input.nextLine();

        File names = new File("week_13/src/assignments/question_12_30/babynames");

        ArrayList<String> years = new ArrayList<>(List.of(Objects.requireNonNull(names.list())));

        for (int i = 0; i < years.size(); i++) {
            if (years.get(i).contains(year)){
                File file = new File(String.valueOf(names.listFiles()[i]));

                try (Scanner line = new Scanner(file)){
                    String str = "";
                    while (line.hasNext()){
                        str = line.nextLine();
                        if (str.contains(name)){
                            System.out.println(name + " is ranked #" + str.substring(0, str.indexOf("\t")) + " in year " + year);
                            break;
                        }

                        if (!line.hasNext()) System.out.println("The name " + name + " is not ranked in year " + year);
                    }
                }
            }
        }
    }
}
