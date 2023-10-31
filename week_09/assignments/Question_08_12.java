package week_09.assignments;

import java.util.Scanner;

public class Question_08_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("(0-single filer, 1-married jointly or qualifying widow(er),\n" +
                "2-married separately, 3-head of household)\n" +
                "Enter the filing status:");

        int status = input.nextInt();

        System.out.print("Enter the taxable income: ");

        int income = input.nextInt();

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        int level = 0;

        for (int i = 0; i < 5; i++) {
            if (income > brackets[status][i]){
                level++;
            }
        }

        double tax = switch (level){
            case 0 -> income * rates[0];
            case 1 -> (income - brackets[status][level - 1]) * rates[1] +  brackets[status][0] * rates[0];
            case 2 -> (income - brackets[status][level - 1]) * rates[2] +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +  brackets[status][0] * rates[0];
            case 3 -> (income - brackets[status][level - 1]) * rates[3] +
                    (brackets[status][2] - brackets[status][1]) * rates[2] + (brackets[status][1] - brackets[status][0]) * rates[1] +
                    brackets[status][0] * rates[0];
            case 4 -> (income - brackets[status][level - 1]) * rates[4] + (brackets[status][3] - brackets[status][2]) * rates[3] +
                    (brackets[status][2] - brackets[status][1]) * rates[2] +  (brackets[status][1] - brackets[status][0]) * rates[1] +
                    brackets[status][0] * rates[0];
            case 5 -> (income - brackets[status][level - 1]) * rates[5] +  (brackets[status][4] - brackets[status][3]) * rates[4] +
                    (brackets[status][3] - brackets[status][2]) * rates[3] +  (brackets[status][2] - brackets[status][1]) * rates[2] +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +  brackets[status][0] * rates[0];
            default -> throw new IllegalStateException("Unexpected value: " + level);
        };

        System.out.println("Tax is $" + tax);
    }
}
