package week_01.assignments;

public class Question_01_12 {
    public static void main(String[] args){
        double dis = 24.0;
        double min = 100;
        double sec = 35;
        double aver = (dis * 1.6 / (min + (sec / 60)) * 60);
        System.out.println("Distance in miles:" + "\n" +
        dis + "\n" +
        "Time in minutes" + "\n" +
        min + " minutes " + sec + " seconds" + "\n" +
        "Average speed in kilometers per hour:" + "\n" +
        aver
        );
    }
}
