package assignments.question_12_23;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Question_12_23 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("week_13/src/assignments/question_12_23/Salary.txt");
        String[] rank = {"assistant", "associate", "full"};

        StringBuilder salary = new StringBuilder();

        for (int i = 1; i <= 1000; i++) {
            salary.append("FirstName" + i + " " + "LastName" + i + " ");
            int random = (int)(Math.random()*3);
            salary.append(rank[random] + " ");
            double income = 0;
            switch (random) {
                case 0 -> {
                    income += (int) (Math.random() * 30000 + 50000);
                    income += (double) (int) (Math.random() * 100) / 100;
                    salary.append(income + "\n");
                }
                case 1 -> {
                    income += (int) (Math.random() * 50000 + 60000);
                    income += (double) (int) (Math.random() * 100) / 100;
                    salary.append(income + "\n");
                }
                case 2 -> {
                    income += (int) (Math.random() * 55000 + 75000);
                    income += (double) (int) (Math.random() * 100) / 100;
                    salary.append(income + "\n");
                }
            }
        }

        try (PrintWriter output = new PrintWriter(file)){
            output.println(salary);
        }
    }
}
