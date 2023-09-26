public class Question_05_23 {
    public static void main(String[] args) {
        double total = 0;
        for (double i = 1.0; i <= 50000; i++) {
            total += 1 / i;
        }
        System.out.println(total);

        double total2 = 0;
        for (double i = 50000.0; i >= 1; i--) {
            total2 += 1 / i;
        }
        System.out.println(total2);
    }
}
