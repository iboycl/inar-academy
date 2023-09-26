import java.util.Scanner;

public class Question_05_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year: ");
        int day = input.nextInt();

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            monthDays[1] += 1;
        }
        for (int i = 0; i < 12; i++) {
            if (i == 0){
                System.out.printf("%-9s 1, %d is %s\n", months[i], year, days[day]);
            } else {
                day = (day + monthDays[i - 1]) % 7;
                System.out.printf("%-9s 1, %d is %s\n", months[i], year, days[day]);
            }

        }

    }
}
