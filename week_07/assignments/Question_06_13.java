public class Question_06_13 {
    public static void main(String[] args) {
        sumSeries(20);
    }

    public static void sumSeries(int num){
        double sum = 0;
        System.out.println("i   |   m(i)");
        System.out.println("------------");
        for (double i = 1; i <= num; i++) {
            sum += i / (i + 1);
            System.out.printf("%-3.0f | %6.4f\n", i, sum);
        }

    }
}
