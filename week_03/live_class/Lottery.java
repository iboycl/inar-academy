import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lottery = (int)(Math.random() * (100 - 10) + 10);

        System.out.println("Enter your guess for the lottery -> ");

        int guess = input.nextInt();

        System.out.println("Lottery number -> " + lottery);

        int lotteryDigit1 = lottery / 10;

        int lotteryDigit2 = lottery % 10;

        int guessDigit1 = guess / 10;

        int guessDigit2 = guess % 10;


        if (guess == lottery){
            System.out.println("Exact match: You Win $10.000");
        } else if (guessDigit1 == lotteryDigit2 &&
                guessDigit2 == lotteryDigit1){
            System.out.println("Match all digits: You Win $3000");
        } else if (guessDigit1 == lotteryDigit1 ||
                guessDigit1 == lotteryDigit2 ||
                guessDigit2 == lotteryDigit1 ||
                guessDigit2 == lotteryDigit2) {
            System.out.println("Match one digit: you win $1000");
        } else {
            System.out.println("Sorry, no match! You win nothing!");
        }
    }
}
