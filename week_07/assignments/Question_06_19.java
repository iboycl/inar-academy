import java.util.Scanner;

public class Question_06_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides for a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (MyTriangle.isValid(side1,side2,side3)){
            System.out.println("The area of your triangle is " + MyTriangle.area(side1,side2,side3));
        } else
            System.out.println("Invalid input");
    }
}
