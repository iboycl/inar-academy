package week_06.assignments;

public class Question_05_35 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 625; i >= 2; i--) {
            sum += 1 / ((Math.sqrt(i) + Math.sqrt(i - 1)));
        }
        System.out.println(sum);

        double sum2 = 0;
        for (int i = 1; i <= 624; i++) {
            sum2 += 1 / ((Math.sqrt(i) + Math.sqrt(i + 1)));
        }
        System.out.println(sum2);
    }
}
