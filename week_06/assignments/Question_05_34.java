package week_06.assignments;

import java.util.Scanner;

public class Question_05_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userScore = 0;
        int comScore = 0;
        while (Math.abs(userScore - comScore) < 2){
            System.out.println("scissor (0), rock (1), paper (2):");

            byte computer = (byte) (Math.random() * 3);
            byte user = input.nextByte();

            String[] options = {"scissor", "rock", "paper"};

            if (user < 0 || user > 2 ){
                System.out.println("Enter 0, 1 or 2!\n");
            } else if (computer == user){
                System.out.printf("The computer is %s. You are %s too. It is a draw!\n", options[computer], options[user]);
            } else if (computer == 0 && user == 2 || computer == 1 && user == 0 || computer == 2 && user == 1) {
                System.out.printf("The computer is %s. You are %s. The computer won!\n", options[computer], options[user]);
                comScore++;
            } else {
                System.out.printf("The computer is %s. You are %s. You won!\n", options[computer], options[user]);
                userScore++;
            }

            System.out.println("Computer wins: " + comScore);
            System.out.println("User wins: " + userScore);
        }

    }
}
