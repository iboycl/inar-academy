package week_11.assignments.question_10_20;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Question_10_20 {
    public static void main(String[] args) {
        BigDecimal temp1 = new BigDecimal(0);
        double temp2 = 1;

        for (int k = 100; k <= 1000; k+= 100) {
            for (int i = k; i >= 1; i--) {
                for (int j = i; j >= 1; j--) {
                    temp2 *= j;
                }
                temp1 = temp1.add(new BigDecimal ((1 / temp2) + ""));
                temp2 = 1;
            }
            System.out.println("e at i = 100 is " + (temp1.add(new BigDecimal(1+"")).setScale(25, RoundingMode.CEILING)));
            temp1 = new BigDecimal(0);

        }
    }
}
