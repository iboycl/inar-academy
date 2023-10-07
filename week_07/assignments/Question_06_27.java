public class Question_06_27 {
    public static void main(String[] args) {
        emirp(100, 10);
    }

    public static void emirp(int number, int perLine){

        int count = 0;
        int num = 10;


        while (count < number){
            boolean isPrime = true;
            boolean isEmirp = true;
            for (int divisor = 2; divisor <= num / 2; divisor++) {
                if (num % divisor == 0 || Question_06_03.isPalindrome(num)){
                    isPrime = false;
                    break;
                }
            }
            int emirpNum = Question_06_03.reverse(num);
            for (int divisor = 2; divisor <= emirpNum / 2; divisor++) {
                if (emirpNum % divisor == 0 || Question_06_03.isPalindrome(emirpNum)){
                    isEmirp = false;
                    break;
                }
            }

            if (isPrime && isEmirp) {
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
