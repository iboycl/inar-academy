import java.util.Scanner;

public class Question_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String str = input.nextLine();

        checkPassword(str);
    }

    public static void checkPassword(String str){
        int digits = 0;
        boolean isValid = true;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i)) && !Character.isDigit(str.charAt(i))){
                isValid = false;
                break;
            }
            if (Character.isDigit(str.charAt(i))){
                digits++;
            }
        }

        if (str.length() < 8 || digits < 2 || !isValid){
            System.out.println("Invalid password!");
        } else
            System.out.println("Valid password!");

    }
}
