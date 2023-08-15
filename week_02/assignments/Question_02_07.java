import java.util.Scanner;

public class Question_02_07 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of minutes:");

        long minutes = input.nextLong();

        int years = (int) minutes / 60 / 24 / 365;

        int days = ((int) minutes / 60 / 24) % 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}
