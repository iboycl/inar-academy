package week_10.assignments;

import java.util.Date;

public class Question_09_03 {
    public static void main(String[] args) {
        for (long i = 10000; i < Math.pow(10, 12) ; i*= 10) {
            System.out.println("For elapsed " + i + " time is " + new Date(i).toString());
        }

    }
}
