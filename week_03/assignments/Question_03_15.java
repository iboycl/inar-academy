import java.util.Scanner;

public class Question_03_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lottery = (int)(Math.random() * (1000 - 100) + 100);

        System.out.println("Enter your lottery pick (three digits):");

        int guess = input.nextInt();

        System.out.println("The lottery number is " + lottery);

        int lotteryDigit1 = lottery / 100;

        int lotteryDigit2 = lottery % 100 / 10;

        int lotteryDigit3 = lottery % 10;

        int guessDigit1 = guess / 100;

        int guessDigit2 = guess % 100 / 10;

        int guessDigit3 = guess % 10;

        if (guess == lottery){
            System.out.println("Exact match: You Win $10.000");
        } else if (guessDigit1 == lotteryDigit2) {
            if (guessDigit2 == lotteryDigit3) {

                if (guessDigit3 == lotteryDigit1){

                    System.out.println("Match all digits: You Win $3000");

                } else {System.out.println("Match one digit: you win $1000");}

            } else if (guessDigit2 == lotteryDigit1) {

                if (guessDigit3 == lotteryDigit3){

                    System.out.println("Match all digits: You Win $3000");

                } else {System.out.println("Match one digit: you win $1000");}

            } else {

                System.out.println("Match one digit: you win $1000");
            }

        } else if (guessDigit1 == lotteryDigit3) {

            if (guessDigit2 == lotteryDigit1) {

                if (guessDigit3 == lotteryDigit2){

                    System.out.println("Match all digits: You Win $3000");

                } else {System.out.println("Match one digit: you win $1000");}

            } else if (guessDigit2 == lotteryDigit2) {

                if (guessDigit3 == lotteryDigit1){

                    System.out.println("Match all digits: You Win $3000");

                } else {System.out.println("Match one digit: you win $1000");}

            } else {

                System.out.println("Match one digit: you win $1000");
            }

        } else if (guessDigit1 == lotteryDigit1) {

            if (guessDigit2 == lotteryDigit3) {

                if (guessDigit3 == lotteryDigit2){

                    System.out.println("Match all digits: You Win $3000");

                } else {System.out.println("Match one digit: you win $1000");}

            } else {

                System.out.println("Match one digit: you win $1000");
            }

        } else if (
                guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 ||
                guessDigit2 == lotteryDigit3 || guessDigit3 == lotteryDigit1 ||
                guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3 ) {
            System.out.println("Match one digit: you win $1000");
        } else {
            System.out.println("Sorry, no match! You win nothing!");
        }
    }
}
