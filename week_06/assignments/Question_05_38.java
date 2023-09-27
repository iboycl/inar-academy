package week_06.assignments;

import java.util.Scanner;

public class Question_05_38 { // decimal to octal
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int num = input.nextInt();
        String octal = "";

        for (int i = num; i >= 1; i /= 8) {
            octal = i % 8 + octal;
        }

        System.out.println(octal);
    }
}
