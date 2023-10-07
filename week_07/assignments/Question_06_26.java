public class Question_06_26 {
    public static void main(String[] args) {

        palindromicPrime(100, 10);
    }

    public static void palindromicPrime(int number, int perLine){

        int count = 0;
        int num = 2;


        while (count < number){
            boolean isPrime = true;

            for (int divisor = 2; divisor <= num / 2; divisor++) {
                if (num % divisor == 0 || !Question_06_03.isPalindrome(num)){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                if (count % perLine == 0){
                    System.out.print(num + "\n");
                } else
                    System.out.print(num + " ");
            }
            num++;
        }
    }
}
