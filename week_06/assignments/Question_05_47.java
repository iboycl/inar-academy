package week_06.assignments;

import java.util.Scanner;

public class Question_05_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String number = input.next();
        String isbn = "";
        int checkSum = 0;
        int length = number.length();

        //System.out.println(length);

        if (length > 12) {
            System.out.println("Enter only 12 digits");
        } else if (length < 12) {
            System.out.println("Enter all digits");
        } else {
            for (int i = 0; i < 12; i++){
                int d = Integer.parseInt(number.charAt(i) + "");
                if (i % 2 != 0){
                    checkSum += 3 * d;
                } else {
                    checkSum += d;
                }

            }
            isbn = 10 - checkSum %10 == 10 ? number + "0" : number + (10 - checkSum %10);
            System.out.println("The ISBN-13 number is " + isbn);
        }
    }
}
