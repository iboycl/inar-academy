package week_11.assignments.question_10_21;

import java.math.BigInteger;

public class Question_10_21 {
    public static void main(String[] args) {
        int count = 0;
        BigInteger big = new BigInteger("9223372036854775807");
        BigInteger five = new BigInteger("5");
        BigInteger six = new BigInteger("6");
        while (count < 10){

            if (
                    big.remainder(five).compareTo(new BigInteger("0")) == 0 ||
                    big.remainder(six).compareTo(new BigInteger("0")) == 0
            ){
                System.out.println(big);
                count++;
            }

            big = big.add(new BigInteger("1"));
        }
    }
}
