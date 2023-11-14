package question_11_17;

import java.util.Scanner;

public class Question_11_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer m: ");
        int m = input.nextInt();
        int n = 1;
        boolean check = true;

        while (check){
            String s = Double.toString(Math.sqrt(m * n));
            if (s.indexOf('.') == s.length() -2){
                break;
            }
            n++;
        }

        System.out.println("The smallest number n for m * n to be a perfect square is " + n + " m * n is " + (m * n));

    }
}
