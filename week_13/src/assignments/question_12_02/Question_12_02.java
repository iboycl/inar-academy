package assignments.question_12_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers to sum: ");
        int num1, num2;
        boolean noEx = true;
        do {
            try {
                num1 = input.nextInt();
                num2 = input.nextInt();
                int sum = num1 + num2;
                System.out.printf("Sum of %d + %d is %d", num1, num2, sum);
                noEx = false;
            } catch (InputMismatchException ex){

                System.out.println(
                        ex + "\n" +
                                "Wrong input !! Please enter integer -->"
                );
                input.nextLine();
            }
        } while (noEx);

    }
}
