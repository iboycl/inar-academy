import java.util.Scanner;

public class Question_07_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.print("Enter five numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The greatest common divisor is " + gcd(numbers));
    }

    public static int gcd(int... numbers){
        int gcd = 2;
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] <= min) min = numbers[i];
        }

        for (int i = 2; i <= min / 2; i++) {
            boolean divisor = true;
            for (int number : numbers) {
                if (number % i != 0) divisor = false;
            }
            if (divisor) gcd = i;
        }

        return gcd;
    }
}
