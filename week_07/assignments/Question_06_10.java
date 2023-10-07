public class Question_06_10 {
    public static void main(String[] args) {
        isPrime(10000);
    }

    public static void isPrime(int number){

        final int NUMBER_OF_PRIMES = number;
        int count = 0;
        int num = 2;


        while (num < NUMBER_OF_PRIMES){
            boolean isPrime = true;

            for (int divisor = 2; divisor <= num / 2; divisor++) {
                if (num % divisor == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) count++;
            num++;
        }

        System.out.println("The number of prime numbers less than " + number + " is: " + count);
    }
}
