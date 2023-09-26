import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gcd = 1;
        int k = 2;
        int whileLoop = 0;
        int forLoop = 0;

        System.out.println("Enter first integer: ");
        int n1 = input.nextInt();

        System.out.println("Enter second integer: ");
        int n2 = input.nextInt();

        while (k <= n1 && k <= n2){
            if(n1 % k == 0 && n2 % k == 0){
                gcd = k;
            }
            k++;
            whileLoop++;
        }

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
        System.out.println("While loop: " + whileLoop);

        int gcd2 = 0;
        for (int l = 2; l <= n1 / 2 && l <= n2 / 2; l++) {
            if (n1 % l == 0 && n2 % l == 0) {
                gcd2 = l;
            }
            forLoop++;
        }

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd2);
        System.out.println("For loop: " + forLoop);
    }
}
