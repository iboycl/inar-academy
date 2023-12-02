package assignments.question_12_08;

import java.util.Scanner;

public class Question_12_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        try {
            String hex = input.nextLine();
            System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
        } catch (HexFormatException ex){
            System.out.println(ex);
        }
    }

    public static int hexToDecimal(String hex) throws HexFormatException{
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar, hex);
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch, String hex) throws HexFormatException{
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else if (ch >= '0' && ch <= '9')// ch is '0', '1', ..., or '9'
            return ch - '0';
        else throw new HexFormatException(hex);
    }
}
