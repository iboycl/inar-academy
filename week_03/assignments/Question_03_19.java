import java.util.Scanner;

public class Question_03_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three edges of the triangle:");

        byte first = input.nextByte();

        byte second = input.nextByte();

        byte third = input.nextByte();

        double perimeter = first + second + third;

        if (first + second > third && second + third > first && third + first > second){
            System.out.println("The perimeter is " + perimeter);
        } else {
            System.out.println("The input is invalid!");
        }
    }
}
