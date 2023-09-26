public class Question_05_25 {
    public static void main(String[] args) {

        double temp = Math.pow((-1), 10001) / 19999;
        int count = 1;
        for (int i = 9999; i >= 3; i-=2) {

            if (count % 2 == 0) {
                temp -= (double) 1 / i;
            } else{
                temp += (double) 1 / i;
            }
            count++;
        }
        double pi1 = 4 * (1 - temp);

        temp = Math.pow((-1), 20001) / 39999;
        count = 1;
        for (int i = 19999; i >= 3; i-=2) {

            if (count % 2 == 0) {
                temp -= (double) 1 / i;
            } else{
                temp += (double) 1 / i;
            }
            count++;
        }
        double pi2 = 4 * (1 - temp);

        temp = Math.pow((-1), 100001) / 199999;
        count = 1;
        for (int i = 99999; i >= 3; i-=2) {

            if (count % 2 == 0) {
                temp -= (double) 1 / i;
            } else{
                temp += (double) 1 / i;
            }
            count++;
        }
        double pi3 = 4 * (1 - temp);

        System.out.println("PI value for i = 10000: " + pi1);
        System.out.println("PI value for i = 20000: " + pi2);
        System.out.println("PI value for i = 100000: " + pi3);
    }
}
