import java.util.Scanner;

public class Question_03_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte tailHead = (byte) (Math.random() * 2);

        System.out.println("Guess the flip of coin (0 represents head and 1 represents tail) :");

        byte guess = input.nextByte();

        if (guess > 1 || guess < 0) {
            System.out.println("Enter 0 or 1!");
        } else if (guess == tailHead){
            System.out.println("Your guess is correct!");
        } else {
            System.out.println("Your guess is not correct!");
        }


    }
}
