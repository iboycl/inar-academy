import java.util.Scanner;

public class Question_02_16 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side: ");

        double side = input.nextDouble();

        double area = (Math.pow(side,2.0) * Math.sqrt(3.0) * 3.0) / 2.0;

        System.out.println("The area of the hexagon is " + String.format("%.4f", area));
    }
}
