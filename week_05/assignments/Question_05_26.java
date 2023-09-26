public class Question_05_26 {
    public static void main(String[] args) {
        double temp1 = 0;
        double temp2 = 1;
        for (int i = 10000; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                temp2 *= j;
            }
            temp1 += (1 / temp2);
            temp2 = 1;
        }
        System.out.println("e at i = 10000 is " + (temp1 + 1));

        temp1 = 0;
        temp2 = 1;
        for (int i = 20000; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                temp2 *= j;
            }
            temp1 += (1 / temp2);
            temp2 = 1;
        }
        System.out.println("e at i = 20000 is " + (temp1 + 1));

        temp1 = 0;
        temp2 = 1;
        for (int i = 100000; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                temp2 *= j;
            }
            temp1 += (1 / temp2);
            temp2 = 1;
        }
        System.out.println("e at i = 100000 is " + (temp1 + 1));
    }
}
