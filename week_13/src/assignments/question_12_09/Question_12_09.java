package assignments.question_12_09;

import java.util.Scanner;

public class Question_12_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        try {
            String binary = input.nextLine();
            System.out.println("The decimal value for binary number " + binary + " is " + binToDecimal(binary));
        } catch (BinaryFormatException ex){
            System.out.println(ex);
        }
    }

    public static int binToDecimal(String bin) throws BinaryFormatException{
        int decimalValue = 0;
        for (int i = 0; i < bin.length(); i++) {
            char ch = bin.charAt(i);
            if (ch == '0' || ch == '1')
                decimalValue += (int) (Integer.parseInt(ch + "") * Math.pow(2, bin.length() - 1 - i));
            else throw new BinaryFormatException(bin);
        }
        return decimalValue;
    }

}
