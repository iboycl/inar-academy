import java.util.Scanner;

public class Question_03_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        byte a = (byte) (Math.random() * 10);

        byte b = (byte) (Math.random() * 10);

        byte c = (byte) (Math.random() * 10);

        int sum = a + b + c;

        System.out.printf("What is %d + %d + %d = ? \n", a, b, c);

        System.out.println("Enter the answer:");

        byte answer = input.nextByte();

        System.out.printf(
                sum == answer ? "%d + %d + %d = %d is true" :
                "%d + %d + %d = %d is false", a, b, c, answer
        );
    }
}
