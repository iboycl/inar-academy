import java.util.Scanner;

public class Question_06_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The first 100 pentagonal number, ten per line:");

        for (int i = 1; i <= 100; i++) {
            int pent = getPentagonalNumber(i);
            System.out.printf(i % 10 != 0 ? "%5d " : "%5d\n",pent);
        }
    }

    public static int getPentagonalNumber(int n){
        return n * (3 * n -1) / 2;
    }
}
