import java.util.Scanner;

public class Question_03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as integer:");
        String number = input.next();
        String isbn = "";
        int mul = 0;
        int n = Integer.parseInt(number);
        int length = number.length();

        //System.out.println(length);

        if (length > 9) {
            System.out.println("Enter only 9 digits");
        } else if (length < 9) {
            System.out.println("Enter all digits");
        } else {
            for (int i = 9; i > 0 ; i--){
                mul = n %10 * i + mul;
                n = n / 10;

            }
            isbn = mul %11 == 10 ? number + "X" : number + mul %11;
            System.out.println("The ISBN-10 number is " + isbn);
        }
    }
}
