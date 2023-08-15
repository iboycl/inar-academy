import java.util.Scanner;

public class Question_02_11 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of years: ");

        int years = input.nextInt();

        int curpop = 312032486;
        int yearsec = 365 * 24 * 60 * 60;
        double yearinc = yearsec / 7.0 - yearsec / 13.0 + yearsec / 45.0;

        System.out.println("The population in " + years + " is " + (int) (curpop + yearinc * years));

    }
}
