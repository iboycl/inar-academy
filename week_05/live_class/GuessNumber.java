import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = (int) (Math.random() * 100);

        System.out.println("Guess a magic number between 0 and 100");

        System.out.println("Enter your guess: ");

        int guess = input.nextInt();

        while (guess != number){
            if (guess < number){
                System.out.println("Your guess is too low\nEnter your new guess: ");
                guess = input.nextInt();
            } else {
                System.out.println("Your guess is too high\nEnter your new guess: ");
                guess = input.nextInt();
            }
        }

        System.out.println("Yes, the number is " + number);
    }
}
