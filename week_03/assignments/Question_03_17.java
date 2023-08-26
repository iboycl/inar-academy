import java.util.Scanner;

public class Question_03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("scissor (0), rock (1), paper (2):");

        byte computer = (byte) (Math.random() * 3);
        byte user = input.nextByte();

        String[] options = {"scissor", "rock", "paper"};

        if (user < 0 || user > 2 ){
            System.out.println("Enter 0, 1 or 2!");
        } else if (computer == user){
            System.out.printf("The computer is %s. You are %s too. It is a draw!", options[computer], options[user]);
        } else if (computer == 0 && user == 2 || computer == 1 && user == 0 || computer == 2 && user == 1) {
            System.out.printf("The computer is %s. You are %s. The computer won!", options[computer], options[user]);
        } else {
            System.out.printf("The computer is %s. You are %s. You won!", options[computer], options[user]);
        }
    }
}
