package week_11.assignments.question_10_17;

import java.math.BigDecimal;
import java.math.BigInteger;


public class Question_10_17 {
    public static void main(String[] args) {
        long ln = 3037000500L;
        for (int i = 0; i < 10; i++) {
            System.out.println(new BigInteger(String.valueOf(ln)).pow(2));
            ln++;
        }
    }
}
