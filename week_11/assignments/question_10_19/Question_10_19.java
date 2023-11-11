package week_11.assignments.question_10_19;

import java.math.BigInteger;

public class Question_10_19 {
    public static void main(String[] args) {
        mersennePrime(31);
    }

    public static void mersennePrime(int number){

        int num = 2;

        System.out.println("p       (2^p)-1");
        System.out.println("------------------------");

        while (num <= number){
            boolean isPrime = true;
            boolean isMersenne = true;

            for (int divisor = 2; divisor <= num / 2; divisor++) {
                if (num % divisor == 0){
                    isPrime = false;
                    break;
                }
            }

            BigInteger mersenneNum = new BigInteger ((int) (Math.pow(2, num) - 1) + "");
            for (int divisor = 2; 0 <= mersenneNum.divide(new BigInteger(2 + "")).compareTo(new BigInteger(divisor + "")); divisor++) {
                if (mersenneNum.remainder(new BigInteger(divisor + "")).compareTo(new BigInteger(0+""))  == 0){
                    isMersenne = false;
                    break;
                }
            }

            if (isPrime && isMersenne) {
                System.out.printf("%-2d       %d\n", num, mersenneNum.intValue());
            }
            num++;
        }
    }
}
