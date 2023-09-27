package week_06.assignments;

import java.util.Scanner;

public class Question_05_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the commission sought: ");
        int commission = input.nextInt();

        double earn = 0;
        double sales = 0;

        for (;earn < commission;sales++){
            if (sales <= 5000){
                earn = sales * 0.08;
            } else if (sales <= 10000) {
                earn = 5000 * 0.08 + (sales - 5000) * 0.10;
            } else {
                earn = 5000 * 0.08 + 5000 * 0.10 + (sales - 10000) * 0.12;
            }
        }
        System.out.println("Minimum sales to earn $" + commission + ": " + sales);
    }
}
