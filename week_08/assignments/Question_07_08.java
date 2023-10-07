import java.util.Scanner;

public class Question_07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");

        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        average (numbers);
    }

    private static void average(int[] numbers) {
        int sum = 0;

        for (int e : numbers) {
            sum += e;
        }

        System.out.println("The average value: " + sum / 10);
    }

    private static void average(double[] numbers) {
        double sum = 0;

        for (double e : numbers) {
            sum += e;
        }

        System.out.println("The average value: " + sum / 10);
    }
}
