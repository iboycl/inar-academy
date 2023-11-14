package question_11_10;

import java.util.Scanner;

public class Question_11_10 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five strings: ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }

        System.out.println(stack);

        System.out.println("Displaying then in reverse order..");

        for (int i = 0; i < 5; i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}
