package week_09.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter bank number and unsafe limit: ");

        int bankNumber = input.nextInt();

        int unsafe = input.nextInt();
        String unsafeBanks = "";
//        double[][] banks = {{25.0, 100.5, 0.0, 0.0, 320.5}, {0.0, 125.0, 40.0, 85.0, 0.0},
//                {125.0, 0.0, 175.0, 75.0, 0.0}, {125.0, 0.0, 0.0, 75.0, 0.0}, {0.0, 0.0, 125.0, 0.0, 181.0}};


        double[][] banks = new double[bankNumber][bankNumber];



        for (int i = 0; i < bankNumber; i++) {
            System.out.print("Enter bank " + i + "'s total assets: "); // assets of bank
            banks[i][i] = input.nextDouble();

            System.out.print("Enter the number of banks that borrowed money from bank " + i + ": "); // number of borrowers

            int borrowers = input.nextInt();

            System.out.print("Enter borrowers' ID and loan amounts" );
            for (int j = 0; j < borrowers; j++) {
                banks[i][input.nextInt()] = input.nextDouble();
            }
        }


        for (int i = 0; i < bankNumber; i++) {
            double sum = 0;
            if (unsafeBanks.contains(Integer.toString(i)))continue;

            for (int j = 0; j < bankNumber; j++) {
                if (unsafeBanks.contains(Integer.toString(j)))continue;
                sum += banks[i][j];
            }
            if (sum != 0 && sum < unsafe){
                unsafeBanks += i + " ";
                i = -1;
            }

        }
        System.out.println();
        System.out.println("Unsafe banks are " + unsafeBanks);
        System.out.println(Arrays.deepToString(banks));
    }
}
