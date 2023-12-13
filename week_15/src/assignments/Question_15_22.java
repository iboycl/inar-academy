package assignments;

import java.util.Scanner;

public class Question_15_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        while (num <= 0 ) {
            System.out.println("Enter a positive number larger than '0'!");
            num = input.nextInt();
        }

        int count = 0;
        int num2 = num;
        while (num2 != 1) {
            count++;
            String str = Integer.toString(num2);
            num2 = 0;
            for (int i = 0; i < str.length(); i++) {
                num2 += (int) Math.pow(Integer.parseInt(str.charAt(i) + "") ,2);
            }
            if (count == 100) {
                System.out.println(num + " is not a happy number!");
                break;
            }
        }
        if (num2 == 1) System.out.println(num + " is a happy number!");

    }
}
