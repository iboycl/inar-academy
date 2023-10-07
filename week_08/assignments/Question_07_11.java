import java.util.Scanner;

public class Question_07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mean = 0;
        double deviation = 0;

        System.out.print("Enter ten numbers: ");

        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("The mean is " + mean(numbers));
        System.out.println("The standard deviation is " + deviation(numbers));

    }

    private static double deviation(double[] numbers) {
        double mean = mean(numbers);
        double deviation = 0;

        for (double e : numbers) {
            deviation += Math.pow(e - mean, 2);
        }
        
        return Math.sqrt(deviation / (10 - 1));
    }

    private static double mean(double[] numbers) {
        double mean = 0;

        for (double e : numbers) {
            mean += e;
        }

        return mean / 10;
    }
}
