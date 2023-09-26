import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");

        int decimal = input.nextInt();

        String hex = "";

        while (decimal != 0){
            int hexVal = decimal % 16;

            char hexDigit = (hexVal <= 9 && hexVal >= 0) ?
                    (char) (hexVal + '0') : (char) (hexVal - 10 + 'A');

            hex = hexDigit + hex;

            decimal /= 16;
        }

        System.out.println("The hex number is " + hex);
    }
}
