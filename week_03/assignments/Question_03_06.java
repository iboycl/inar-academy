import java.util.Scanner;

public class Question_03_06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds:");

        double weight = input.nextDouble() * 0.45359237;

        System.out.println("Enter feet:");

        double feet = input.nextDouble() * 0.3048;

        System.out.println("Enter inches:");

        double inch = input.nextDouble() * 0.0254;

        double bmi = weight / Math.pow(feet + inch, 2);

        System.out.println("BMI is " + bmi);

        if (bmi < 18.5){
            System.out.println("Underweight");
        } else if (18.5 <= bmi && bmi < 25.0) {
            System.out.println("Normal");
        } else if (25.0 <= bmi && bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
