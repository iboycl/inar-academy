import java.util.Scanner;

public class Question_06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        reverse(input.nextInt());
    }

    public static void reverse(int number){
        String reverse = "";
        String num = Integer.toString(number);
        for (int i = 0; i < num.length(); i++) {

            reverse = num.charAt(i) + reverse;

        }
        System.out.println("Reversed integer is " + reverse);
    }
}
