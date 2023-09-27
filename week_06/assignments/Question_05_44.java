package week_06.assignments;

import java.util.Scanner;

public class Question_05_44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        String binary = "";
        for (int i = 0; i < 16; i++) {
            binary = (num & 1) + binary;
            num >>= 1;
        }

        System.out.println(binary);
    }
}
