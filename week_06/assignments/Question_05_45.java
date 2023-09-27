package week_06.assignments;

import java.util.Scanner;

public class Question_05_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mean = 0;
        double deviation = 0;
        double num = 0;

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < 10; i++) {
            num = input.nextDouble();
            mean += num;
            deviation += Math.pow(num, 2);

        }

        deviation = Math.sqrt((deviation - (Math.pow(mean,2) / 10)) / (10 - 1 ));
        mean/= 10;


        System.out.println("The mean is: " + mean);
        System.out.printf("The standard deviation: %.5f", deviation);

    }
}
