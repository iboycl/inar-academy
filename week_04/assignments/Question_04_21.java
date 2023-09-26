import java.util.Scanner;

public class Question_04_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a SSN (DDD-DD-DDDD):");

        String ssn = input.next();

        if (ssn.length() != 11){
            System.out.println(ssn + " is not a valid social security number");
        } else {
            for (int i = 0; i < ssn.length(); i++) {
                if (!Character.isDigit(ssn.charAt(i)) && !((i == 3 || i == 6) && ssn.charAt(i) == 45)) {

                    System.out.println(ssn + " is not a valid social security number");
                    System.exit(0);
                }
            }
            System.out.println(ssn + " is a valid social security number");
        }

    }
}
