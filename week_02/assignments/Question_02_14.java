import java.util.Scanner;

public class Question_02_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds:");

        double weight = input.nextDouble() * 0.45359237;

        System.out.println("Enter height in inches:");

        double height = input.nextDouble() * 0.0254;

        double bmi = weight / Math.pow(height, 2);

        System.out.println("BMI is " + String.format("%.4f", bmi));

    }
}
