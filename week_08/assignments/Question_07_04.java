import java.util.Scanner;

public class Question_07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of scores: ");
        int n = input.nextInt();

        double[] numbers = new double[n];

        double sum = 0;

        System.out.print("Enter the scores: ");

        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / n;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > average) count++;
        }

        System.out.println("Average is " + average);
        System.out.println("Number of scores above the average is " + count);
    }
}
