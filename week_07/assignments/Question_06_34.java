import java.util.Scanner;

public class Question_06_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("To get a monthly calendar enter a year and a month: ");

        int year = input.nextInt();
        int month = input.nextInt();

        monthCalendar(year, month);

    }

    public static void monthCalendar(int year, int month){
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("           " + months[month - 1] + "  " + year);
        System.out.println("---------------------------------");
        System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        int day = getDay(year, month);

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) months[1] += 1;

        int count = 1;
        for (int i = 0; i < day; i++) {
            System.out.print("     ");
            count++;
        }
        for (int i = 1; i <= (monthDays[month - 1]); i++) {
            System.out.printf((count % 7 == 0 ) ? "%d\n" : "%-5d", i);
            count++;
        }
    }

    private static int getDay(int year, int month) {
        int day = 0;

        if (month == 1) {
            int y = year -1;
            day = (1 + ((26 * (14)) / 10) + y % 100 + (y % 100) / 4 + (y / 100) / 4 + 5 * (y / 100)) % 7;

        } else if (month == 2) {
            int y = year -1;
            day = (1 + ((26 * (15)) / 10) + y % 100 + (y % 100) / 4 + (y / 100) / 4 + 5 * (y / 100)) % 7;
        } else {
            day = (1 + ((26 * (month + 1)) / 10) + year % 100 + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;
        }

        if (day == 0){
            day = 6;
        } else {
            day -= 1;
        }
        return day;
    }
}
