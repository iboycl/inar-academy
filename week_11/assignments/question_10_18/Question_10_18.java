package week_11.assignments.question_10_18;

import java.math.BigInteger;

public class Question_10_18 {
    public static void main(String[] args) {
        int count = 0;
        BigInteger big = new BigInteger("9223372036854775807");

        while (count < 5){

            boolean isPrime = true;
            for (BigInteger divisor = new BigInteger("2"); divisor.compareTo(big.divide(new BigInteger("2"))) <= 0; divisor = divisor.add(new BigInteger("1"))) {

                if (big.remainder(divisor).compareTo(new BigInteger("0")) == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(big);
                count++;
            }
            big = big.add(new BigInteger("1"));
        }
    }
}
