import java.util.Scanner;

public class Question_05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students:");

        int number = input.nextInt();
        input.nextLine();

        double maxScore = 0;
        String maxName = "";
        double secondScore = 0;
        String secondName = "";

        System.out.println("Enter each student's name and score:");

        for (int i = 0; i < number; i++) {
            System.out.printf("Student %d:", i + 1);
            System.out.print("\n\tName:");
            String name = input.nextLine();

            System.out.print("\tScore:");
            double score = input.nextDouble();
            input.nextLine();

            if (maxScore < score) {
                secondScore = maxScore;
                secondName = maxName;
                maxScore = score;
                maxName = name;
            }

            if (secondScore < score && maxScore > score){
                secondScore = score;
                secondName = name;
            }

        }

        System.out.println("Student with the highest score: " + maxName);
        System.out.println("Student with the second highest score: " + secondName);
    }
}
