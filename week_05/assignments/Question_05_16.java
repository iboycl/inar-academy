import java.util.Scanner;

public class Question_05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");

        int number = input.nextInt();
        int count = 0;
        String factor = "";

        for (int i = 2; number / i != 0; i++) {
            if (number % i == 0) {
                count++;
                if (count == 1){
                    factor = factor + i;
                } else {
                    factor = factor + ", " + i;
                }
                number /= i;
                i--;
            }
        }

        factor = "Factors of your number " + (count == 1 ? "is" : "are") + ": " + factor;
        System.out.println(factor + ".");
    }
}
