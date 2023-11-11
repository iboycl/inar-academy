package week_11.assignments.question_10_14;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyDate {
    private int year, month, day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    MyDate(){
        GregorianCalendar cal = new GregorianCalendar();
        year = cal.get(GregorianCalendar.YEAR);
        month = cal.get(GregorianCalendar.MONTH);
        day = cal.get(GregorianCalendar.DAY_OF_MONTH);
    }

    MyDate(long milliseconds){
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(milliseconds);
        year = cal.get(GregorianCalendar.YEAR);
        month = cal.get(GregorianCalendar.MONTH);
        day = cal.get(GregorianCalendar.DAY_OF_MONTH);
    }

    MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(long milliseconds){
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(milliseconds);
        year = cal.get(GregorianCalendar.YEAR);
        month = cal.get(GregorianCalendar.MONTH);
        day = cal.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
