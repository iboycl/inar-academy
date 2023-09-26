import java.util.Scanner;

public class Question_04_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of sides:");

        int sideNumbers = input.nextInt();

        System.out.println("Enter the side:");

        double side = input.nextDouble();


        double area = (sideNumbers * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / sideNumbers));

        System.out.printf("The area of the polygon is %.2f", area);
    }
}
