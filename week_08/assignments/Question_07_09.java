import java.util.Scanner;

public class Question_07_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");

        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        min (numbers);
    }

    private static void min(double[] numbers) {
        double min = numbers[0];

        for (double e: numbers) {
            if (e < min) min = e;
        }

        System.out.println("The minimum number is: " + min);
    }
}
