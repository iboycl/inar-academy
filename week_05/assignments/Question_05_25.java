public class Question_05_25 {
    public static void main(String[] args) {

        double temp = 0;
        for (int i = 1; i <= 9999; i++) {
            temp += Math.pow(-1, i +1) / (2 * i - 1);
        }
        double pi1 = 4 * temp;

        temp = 0;

        for (int i = 1; i <= 19999; i++) {
            temp += Math.pow(-1, i +1) / (2 * i - 1);
        }
        double pi2 = 4 * temp;

        temp = 0;

        for (int i = 1; i <= 99999; i++) {
            temp += Math.pow(-1, i +1) / (2 * i - 1);
        }
        double pi3 = 4 * temp;

        System.out.println("PI value for i = 10000: " + pi1);
        System.out.println("PI value for i = 20000: " + pi2);
        System.out.println("PI value for i = 100000: " + pi3);
    }
}
