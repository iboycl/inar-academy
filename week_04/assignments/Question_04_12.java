import java.util.Scanner;

public class Question_04_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String hexCodes = "0123456789ABCDEF";

        System.out.println("Enter a hex digit :");

        String hex = input.next();

        int decimal = hexCodes.indexOf(hex);

        if (decimal < 0 || hex.length() > 1) {
            System.out.println("Write a hex value between 0 and F!");
        } else {

            String[] binaryCodes = {"0000", "0001", "0010", "0011", "0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
            System.out.println("The binary value is " + binaryCodes[decimal]);

        }
    }
}
