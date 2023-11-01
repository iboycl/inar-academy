package week_10.assignments;

import java.util.GregorianCalendar;

import static javax.swing.UIManager.get;

public class Question_09_05 {
    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar();

        System.out.println("Current year: " + date.get(date.YEAR) + "\n" +
                "Current month: " + date.get(date.MONTH) + "\n" +
                "Current day: " + date.get(date.DAY_OF_MONTH));

        System.out.println();

        date.setTimeInMillis(1234567898765L);

        System.out.println("Current year: " + date.get(date.YEAR) + "\n" +
                "Current month: " + date.get(date.MONTH) + "\n" +
                "Current day: " + date.get(date.DAY_OF_MONTH));
    }
}
