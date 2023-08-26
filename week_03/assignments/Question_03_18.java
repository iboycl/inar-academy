import java.util.Scanner;

public class Question_03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight of the package (in pounds):");

        double weight = input.nextDouble();
        double cost = 0.0;

        if (weight > 20){
            System.out.println("The package cannot be shipped!");
        } else if (weight > 10) {
            cost = weight * 10.5;
        } else if (weight > 3) {
            cost = weight * 8.5;
        } else if (weight > 1) {
            cost = weight * 5.5;
        } else {
            cost = weight * 3.5;
        }
        System.out.println("Shipping cost of the package is: " + cost);
    }
}
