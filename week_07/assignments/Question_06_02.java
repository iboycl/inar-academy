import java.util.Scanner;

public class Question_06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.printf("Sum of the digits in %d is %d", n, sumDigits(n));
    }

    public static int sumDigits(int n){
        int total = 0;

        for (int i = n; i > 0; i /= 10) {
            total += i % 10;
        }

        return total;
    }
}
