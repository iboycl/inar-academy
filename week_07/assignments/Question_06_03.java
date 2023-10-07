import java.util.Scanner;

public class Question_06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = input.nextInt();

        System.out.println(num + " is " + (isPalindrome(num) ? "" : "not ")+ "a palindrome");
    }

    public static boolean isPalindrome(int number){
        return reverse(number) == number;
    }

    public static int reverse(int number){
        String reverse = "";
        String num = Integer.toString(number);
        for (int i = 0; i < num.length(); i++) {

            reverse = num.charAt(i) + reverse;

        }
        return Integer.parseInt(reverse);
    }

}
