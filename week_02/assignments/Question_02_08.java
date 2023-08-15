import java.util.Scanner;

public class Question_02_08 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the time zone offset to GMT:");

        int timeZone = input.nextInt();

        long totalMilliSeconds = System.currentTimeMillis();

        long totalSeconds = totalMilliSeconds / 1000;

        int currentSecond = (int) (totalSeconds % 60);

        long totalMinutes = totalSeconds / 60;

        int currentMinute = (int) (totalMinutes % 60);

        long totalHours = totalMinutes / 60;

        int currentHour = (int) ((totalHours + timeZone) % 24);

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT +" + timeZone);

    }
}
