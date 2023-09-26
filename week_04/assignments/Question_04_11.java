import java.util.Scanner;

public class Question_04_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal value (0 to 15):");

        int decimal = input.nextInt();

        if (decimal > 15 || decimal < 0) {
            System.out.println("Write a decimal value between 0 and 15!");
        } else {

            String[] hexCodes = {"0", "1", "2", "3", "4","5","6","7","8","9","A","B","C","D","E","F"};
            System.out.println("The hex value is " + hexCodes[decimal]);

        }

    }

}
