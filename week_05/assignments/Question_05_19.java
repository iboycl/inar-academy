public class Question_05_19 {
    public static void main(String[] args) {

        int space = 15;

        for (int i = 1; i <= 8 ; i++) {
            for (int j = 1; j < space; j++) {
                System.out.print("  ");
            }
            space-=2;
            for (int j = 1; j < i; j++) {
                System.out.printf("%3.0f ", Math.pow(2, j-1));
            }
            for (int j = i; j >= 1; j--) {
                System.out.printf(j == 1 ? "%3.0f\n" : "%3.0f ", Math.pow(2, j-1));
            }

        }
    }
}
