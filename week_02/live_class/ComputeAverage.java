import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int average;

        System.out.println("Enter three numbers");

        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();

        average = (number1 + number2 + number3) / 3;

        System.out.println("Merhaba " + number1 + ", " + number2 + ", " + number3 + " is " + average);
    }

}
