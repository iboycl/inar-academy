package assignments;

import java.util.Scanner;

public class Question_15_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.lastIndexOf(str.charAt(i)) == i && str.indexOf(str.charAt(i)) == i) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("There is not any non-repeating character.");
        } else {
            System.out.println("The first non-repeating character is " + str.charAt(index) + ": " + (index + 1) + ". character of the string.");
        }
    }
}
