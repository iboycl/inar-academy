package week_09.assignments;

import java.util.Scanner;

public class Question_08_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 511: ");
        String number = Integer.toBinaryString(input.nextInt());


        String nine = "000000000";
        String result = nine.subSequence(0, 9 - number.length()) + number;

        for (int i = 0; i < 9; i++) {
            if (result.charAt(i) == '0'){
                System.out.print("H ");
            } else System.out.print("T ");

            if (i == 2 || i == 5){
                System.out.println();
            }
        }

    }
}
