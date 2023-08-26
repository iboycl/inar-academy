import java.util.Scanner;

public class Question_03_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = (int) (Math.random() * 99) + 1;

        int b = (int) (Math.random() * 99) + 1;


        int sum = a + b;

        System.out.printf("What is %d + %d = ? \n", a, b);

        System.out.println("Enter the answer:");

        byte answer = input.nextByte();

        System.out.printf(
                sum == answer ? "%d + %d = %d is true" :
                        "%d + %d = %d is false", a, b, answer
        );
    }
}
