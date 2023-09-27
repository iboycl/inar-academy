package week_06.assignments;

import java.util.Scanner;

public class Question_05_37 { // decimal to binary
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int num = input.nextInt();
        String binary = "";

        for (int i = num; i >= 1; i /= 2) {
            binary = i % 2 + binary;
        }

        System.out.println(binary);
    }
}
