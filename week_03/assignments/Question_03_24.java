import java.util.Scanner;

public class Question_03_24 {
    public static void main(String[] args) {

        String[] cards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        String[] shapes = {"Clubs", "Diamonds", "Hearts", "Spades"};

        System.out.println("The card you pick is " + cards[(int) (Math.random() * 13)] + " of " + shapes[(int) (Math.random() * 4)]);

    }
}
