package week_11.assignments.question_10_6;

import week_11.assignments.question_10_5.StackOfIntegers;

public class Question_10_06 {
    public static void main(String[] args) {
        int number = 120;
        int num = 2;

        StackOfIntegers primes = new StackOfIntegers();

        while (num < number){
            boolean isPrime = true;
            for (int divisor = 2; divisor <= num / 2; divisor++) {
                if (num % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) primes.push(num);
            num++;
        }


        for (int i = primes.getSize() - 1; i >= 0; i--) {
            System.out.print(primes.getElements()[i] + " ");
        }
    }

}
