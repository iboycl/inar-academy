public class Question_06_29 {
    public static void main(String[] args) {
        twinPrime(1000);
    }
    public static void twinPrime(int number){

        int num = 2;

        while (num <= number){
            boolean isPrime = true;
            boolean isTwinPrime = true;

            for (int divisor = 2; divisor <= num / 2; divisor++) {
                if (num % divisor == 0){
                    isPrime = false;
                    break;
                }
            }

            int twinPrime = num + 2;
            for (int divisor = 2; divisor <= twinPrime / 2; divisor++) {
                if (twinPrime % divisor == 0){
                    isTwinPrime = false;
                    break;
                }
            }

            if (isPrime && isTwinPrime) {
                System.out.printf("(%d, %d)\n", num, twinPrime);
            }
            num++;
        }
    }
}
