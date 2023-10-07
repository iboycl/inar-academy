import java.util.Scanner;

public class Question_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        int[] scores = new int[n];

        System.out.print("Enter " + n + " scores: ");
        int best = 0;
        for (int i = 0; i < scores.length; i++) {
            scores[i] += input.nextInt();
            if (scores[i] > best) best = scores[i];
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Student %d score is %d and grade is ", i + 1, scores[i]);
            if (scores[i] >= best - 10){
                System.out.println("A");
            } else if (scores[i] >= best - 20) {
                System.out.println("B");
            } else if (scores[i] >= best - 30) {
                System.out.println("C");
            } else if (scores[i] >= best - 40){
                System.out.println("D");
            } else
                System.out.println("F");
        }

    }
}
