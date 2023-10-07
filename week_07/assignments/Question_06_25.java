import java.util.Scanner;

public class Question_06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a milliseconds: ");
        System.out.println(convertMillis(input.nextInt()));
    }
    public static String convertMillis(long millis){

        long totalSeconds = millis / 1000;

        int currentSecond = (int) (totalSeconds % 60);

        long totalMinutes = totalSeconds / 60;

        int currentMinute = (int) (totalMinutes % 60);

        long totalHours = totalMinutes / 60;

        return totalHours + ":" + currentMinute + ":" + currentSecond;
    }
}
