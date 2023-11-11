package week_11.assignments.question_10_1;

import java.util.Calendar;
import java.util.Date;

public class Time {
    private int hour, minute, second;

    Time(){
        Date date = new Date();
        hour = date.getHours();
        minute = date.getMinutes();
        second = date.getSeconds();
    }

    Time(long time){
        Date date = new Date();
        date.setTime(time);
        hour = date.getHours();
        minute = date.getMinutes();
        second = date.getSeconds();
    }

    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public double getHour() {
        return hour;
    }

    public double getMinute() {
        return minute;
    }

    public double getSecond() {
        return second;
    }

    public static void setTime(long elapseTime){
        new Time(elapseTime);
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
