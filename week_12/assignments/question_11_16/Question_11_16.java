package question_11_16;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> answers = new ArrayList<>();

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        System.out.println("What is " + number1 + " + " + number2 + "? ");

        answers.add(input.nextInt());

        while (!answers.contains(number1 + number2)){
            System.out.println("Wrong answer! Try again. What is " + number1 + " + " + number2 + "? ");
            int answer = input.nextInt();
            if (answers.contains(answer)){
                System.out.println("You already entered " + answer);
            } else answers.add(answer);
        }

        System.out.println("You got it!");
    }
}
