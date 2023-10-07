public class Question_06_28 {
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

            int mersenneNum = (int) (Math.pow(2, num) - 1);
            for (int divisor = 2; divisor <= mersenneNum / 2; divisor++) {
                if (mersenneNum % divisor == 0){
                    isMersenne = false;
                    break;
                }
            }

            if (isPrime && isMersenne) {
                System.out.printf("%-2d       %d\n", num, mersenneNum);
            }
            num++;
        }
    }
}
