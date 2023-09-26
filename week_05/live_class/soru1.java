public class soru1 {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i += 2) {
            System.out.printf("%2d, ", i );
            if (i % 10 == 0){
                System.out.println();
            }
        }
    }
}
