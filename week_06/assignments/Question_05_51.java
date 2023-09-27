package week_06.assignments;

import java.util.Scanner;

public class Question_05_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        String common = "";

        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            if (str1.charAt(i) == str2.charAt(i)){
                common += str1.charAt(i);
            } else break;
        }

        System.out.println(common.isEmpty() ? "No common prefix" : "The common prefix is " + common);


    }
}
