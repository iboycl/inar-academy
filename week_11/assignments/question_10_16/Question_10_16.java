package week_11.assignments.question_10_16;

import java.math.BigInteger;

public class Question_10_16 {
    public static void main(String[] args) {
        String str = "1";
        for (int i = 0; i < 49; i++) {
            str += "0";
        }
        int count = 0;
        int i = 0;
        while(count < 10) {
            if (i % 2 == 0 || i % 3 == 0){
                System.out.println(new BigInteger(str).add(new BigInteger(String.valueOf(i))));
                count++;
            }
            i++;
        }
    }
}
