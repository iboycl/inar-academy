public class Question_07_06 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;
        int[] primes = new int[50];

        System.out.println("The first 50 prime numbers are \n");

        while (count < NUMBER_OF_PRIMES){
            boolean isPrime = true;

            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                if (number % divisor == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                primes[count] = number;
                count++;
            }
            number++;
        }

        for (int i = 1; i <= primes.length; i++) {
            System.out.printf((i % 10 == 0) ? "%4d\n" : "%4d ",primes[i- 1]);
        }
    }
}
