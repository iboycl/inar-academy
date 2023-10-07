import java.util.Scanner;

public class Question_06_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.println("The approximated square root of " + n + " is: " + sqrt(n));

    }

    public static double sqrt(long n){
        double lastGuess = 1;
        double nextGuess = 0;

        do {
            nextGuess = (lastGuess + n / lastGuess) / 2;
            if (Math.abs(nextGuess - lastGuess) > 0.0001){
                lastGuess = nextGuess;
                nextGuess = 0;
            }
        } while (Math.abs(nextGuess - lastGuess) > 0.0001);

        return nextGuess;
    }

}
