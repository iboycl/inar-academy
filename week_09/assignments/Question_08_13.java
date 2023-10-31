package week_09.assignments;

import java.util.Scanner;

public class Question_08_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");

        double[][] nums = new double[input.nextInt()][input.nextInt()];

        System.out.println("Enter the array:");

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = input.nextDouble();
            }
        }

        locateLargest(nums);

    }

    public static void locateLargest(double[][] nums){
        double max = 0;
        int maxR = 0;
        int maxC = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (max < nums[i][j]){
                    max = nums[i][j];
                    maxR = i;
                    maxC = j;
                }
            }
        }

        System.out.println("The location of the largest element is at ("+ maxR + ", " + maxC + ")");
    }
}
