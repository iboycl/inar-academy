public class DisplayTheCurrentTime {
    public static void main(String[] args){
        long totalMilliSeconds = System.currentTimeMillis();

        long totalSeconds = totalMilliSeconds / 1000;

        int currentSecond = (int) (totalSeconds % 60);

        long totalMinutes = totalSeconds / 60;

        int currentMinute = (int) (totalMinutes % 60);

        long totalHours = totalMinutes / 60;

        int currentHour = (int) ((totalHours + 3) % 24);

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT +3");

    }
}
