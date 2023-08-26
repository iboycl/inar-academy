import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("0 - single filler,\n 1- married jointly or qualifying widow(er),\n 2-married separately,\n 3-head of household \nEnter the taxable income:");

        int status = input.nextInt();

        System.out.println("Enter the taxable income:");
        double income = input.nextDouble();

        switch (status){
            case 0 :
                System.out.println("Compute tax for status 0");
                break;
            case 1 :
                System.out.println("Compute tax for status 1");
                break;
            case 2 :
                System.out.println("Compute tax for status 2");
                break;
            case 3 :
                System.out.println("Compute tax for status 3");
                break;
            default:
                System.out.println("Invalid status");
                break;
        }
    }
}
