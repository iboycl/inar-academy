package week_06.assignments;

import java.util.Scanner;

public class Question_05_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String rvrStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rvrStr += str.charAt(i);
        }
        System.out.println("The reversed string is:" + rvrStr);
    }
}
