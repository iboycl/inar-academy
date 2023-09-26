import java.util.Scanner;

public class Question_05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.println("Enter the number of students:");

        int number = input.nextInt();
        input.nextLine();

        double maxScore = 0;
        String maxName = "";

        System.out.println("Enter each student's name and score:");

        for (int i = 0; i < number; i++) {
            System.out.printf("Student %d:", i + 1);
            System.out.print("\n\tName:");
            String name = input.nextLine();

            System.out.print("\tScore:");
            double score = input.nextDouble();
            input.nextLine();

            if (maxScore < score) {
                maxScore = score;
                maxName = name;
            }

        }

        System.out.println("Student with the highest score: " + maxName);
    }
}
