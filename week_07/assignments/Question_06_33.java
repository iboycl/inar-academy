public class Question_06_33 {
    public static void main(String[] args) {
        currentTimeDate();
    }

    public static void currentTimeDate(){
        long totalMilliSeconds = System.currentTimeMillis();

        long totalSeconds = totalMilliSeconds / 1000;

        int currentSecond = (int) (totalSeconds % 60);

        long totalMinutes = totalSeconds / 60;

        int currentMinute = (int) (totalMinutes % 60);

        long totalHours = totalMinutes / 60 + 3;

        int currentHour = (int) (totalHours % 24);

        long totalDays = totalHours / 24 + 1;

        int currentDay = 0;

        int currentMonth = 0;

        int currentYear = (int) totalDays / 365 + 1970;

        for (int i = 1970; i < currentYear; i++) {
            if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)){
                totalDays -= 366;
            } else
                totalDays -=365;
        }

        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (currentYear % 400 == 0 || (currentYear % 4 == 0 && currentYear % 100 != 0)) months[1] += 1;

        while (totalDays > months[currentMonth]){
            totalDays -= months[currentMonth];
            currentMonth++;
        }

        String[] monthString = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        currentDay = (int) totalDays;

        String time = currentHour + ":" + currentMinute + ":" + currentSecond + " GMT +3";
        String date =  monthString[currentMonth] + " " + currentDay + ", " + currentYear;

        System.out.println("Current date and time is " + date + " " + time);
    }
}
