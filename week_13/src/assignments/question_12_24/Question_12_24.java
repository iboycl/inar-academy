package assignments.question_12_24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_12_24 {
    public static void main(String[] args) {
        File file = new File("week_13/src/assignments/question_12_23/Salary.txt");

        double assistant = 0;
        int assistantNum = 0;

        double associate = 0;
        int associateNum = 0;

        double full = 0;
        int fullNum = 0;


        try (Scanner input = new Scanner(file)){
            while (input.hasNext()){
                String str = input.next();
                if (str.contains("assistant")){
                    assistantNum++;
                    assistant += input.nextDouble();
                } else if (str.contains("associate")){
                    associateNum++;
                    associate += input.nextDouble();
                } else if (str.contains("full")){
                    fullNum++;
                    full += input.nextDouble();
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(
                "Total salary for assistant professors  : " + String.format("%.2f",assistant ) + "\n" +
                "Total salary for associate professors  : " + String.format("%.2f",associate) + "\n" +
                "Total salary for full professors       : " + String.format("%.2f",full) + "\n" +
                "Total salary for all faculty           : " + String.format("%.2f",(associate + assistant + full)) + "\n" +
                "----------------------------------------------------------------" + "\n" +
                "Average salary for assistant professors: " + String.format("%.2f",assistant / assistantNum) + "\n" +
                "Average salary for associate professors: " + String.format("%.2f",associate / associateNum) + "\n" +
                "Average salary for full professors     : " + String.format("%.2f",full / fullNum) + "\n" +
                "Average salary for all faculty         : " + String.format("%.2f",(associate + assistant + full) / 1000)
        );
    }
}
