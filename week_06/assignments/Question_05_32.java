package week_06.assignments;

import java.util.Scanner;

public class Question_05_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your lottery pick (two distinct digits): ");
        String pick = input.nextLine();

        if (pick.length() == 1) {
            pick = "0" + pick;
        }

        String lottery = "" + (int) (Math.random() * 9);

        if (lottery.length() == 1){
            lottery = lottery + (int) (Math.random() * 9);
            while (lottery.charAt(0) == lottery.charAt(1)){
                lottery = "" + lottery.charAt(0) + (int) (Math.random() * 9);
            }
        }

        System.out.println("The lottery number is " + lottery);

        if (pick.equals(lottery)){
            System.out.println("You win $10,000");
        } else if (pick.charAt(0) == lottery.charAt(1) && pick.charAt(1) == lottery.charAt(0)) {
            System.out.println("You win $3,000");
        } else if (
                pick.charAt(0) == lottery.charAt(1) || pick.charAt(0) == lottery.charAt(0)||
                pick.charAt(1) == lottery.charAt(1) || pick.charAt(1) == lottery.charAt(0)
        ) {
            System.out.println("You win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }

    }
}
