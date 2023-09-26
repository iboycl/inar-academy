import java.util.Scanner;

public class Question_05_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int n1 = input.nextInt();

        System.out.println("Enter second integer: ");
        int n2 = input.nextInt();

        int max = n1;
        int min = n2;

        if (n2 > n1){
            max = n2;
            min = n1;
        }

        while (max % min != 0){
            min--;
        }

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + min);

    }
}
