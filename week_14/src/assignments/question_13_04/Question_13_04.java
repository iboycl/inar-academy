package assignments.question_13_04;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Question_13_04 {
    public static void main(String[] args) {
        if (args.length == 0){
            monthCalendar(new GregorianCalendar().get(Calendar.YEAR), new GregorianCalendar().get(Calendar.MONTH) + 1);
        } else if (args.length == 1) {
            monthCalendar(new GregorianCalendar().get(Calendar.YEAR), Integer.parseInt(args[0]));
        } else
            monthCalendar(Integer.parseInt(args[1]),Integer.parseInt(args[0]));
    }

    public static void monthCalendar(int year, int month){
        GregorianCalendar cal = new GregorianCalendar();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DATE, 1);

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("           " + months[month - 1] + "  " + year);
        System.out.println("---------------------------------");
        System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        int day = cal.get(Calendar.DAY_OF_WEEK) - 1;

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) monthDays[1] += 1;

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
}
