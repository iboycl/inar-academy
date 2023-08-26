import java.util.Scanner;

public class Question_03_30 {
    public static void main(String[] args) {
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

        String amPM = currentHour > 12 ? " PM" : " AM";

        System.out.println("Current time is " + currentHour % 12 + ":" + currentMinute + ":" + currentSecond + amPM +" GMT " + timeZone);

    }
}
