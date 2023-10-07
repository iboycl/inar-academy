public class Question_06_14 {
    public static void main(String[] args) {
        estimatePi(1000);
    }

    public static void estimatePi(int num){
        System.out.println("i   |   m(i)");
        System.out.println("------------");
        for (double j = 1; j <= num; j+=100) {
            double estimate = 0;
            for (double i = 1; i <= j; i++) {
                estimate += Math.pow(-1, i +1) / (2 * i - 1);
            }
            double pi = 4 * estimate;
            System.out.printf("%-3.0f | %6.4f\n", j, pi);
        }
    }
}
