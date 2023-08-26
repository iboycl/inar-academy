import java.util.Scanner;

public class Question_03_33 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight and price for package 1:");

        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        double x1 = price1 / weight1;
        System.out.println("Enter weight and price for package 2:");

        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        double x2 = price2 / weight2;

        String result = "";

        if(x1 == x2){
            result = "Two packages have the same price.";
        } else if (x1 < x2) {
            result = "Package 1 has a better price.";
        } else {
            result = "Package 2 has a better price.";
        }

        System.out.println(result);
    }
}
