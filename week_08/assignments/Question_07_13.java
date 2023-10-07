import java.util.Scanner;

public class Question_07_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers to exclude from random (1-54): ");

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println(randomNumber(numbers));
    }

    private static int randomNumber(int... numbers) {
        int random = (int) (Math.random() * 55);
        for (int i = 0; i < numbers.length; i++) {
            if (random == numbers[i]) {
                random = (int) (Math.random() * 55);
            }
        }
        return random;
    }
}
