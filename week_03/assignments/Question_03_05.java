import java.util.Arrays;
import java.util.Scanner;

public class Question_03_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter today's day:");

        int day = input.nextInt();

        System.out.println("Enter the number of days elapsed since today:");

        int futureDay = (input.nextInt() + day) %7;

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.printf("Today is %s and the future day is %s", days[day], days[futureDay]);

    }
}
