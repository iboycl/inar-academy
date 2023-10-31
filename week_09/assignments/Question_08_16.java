package week_09.assignments;

import java.util.Arrays;

public class Question_08_16 {
    public static void main(String[] args) {
        int[][] nums = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
        System.out.println(Arrays.deepToString(nums));
        //sortSum(nums);
        sort(nums);
    }

    public static void sortSum(int[][] nums){

        for (int i = 0; i < nums.length; i++) {
            int min = 0;
            int[] temp = nums[0];
            for (int k = 0; k < nums[i].length; k++) {
                min += nums[i][k];
                temp = nums[i];
            }

            int sum = 0;
            int minIndex = i;

            for (int l = i + 1; l < nums.length; l++) {
                for (int j = 0; j < nums[l].length; j++) {
                    sum += nums[l][j];
                }
                if (sum < min){
                    min = sum;
                    minIndex = l;
                }
                sum = 0;
            }

            if (minIndex != i){
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }

        System.out.println(Arrays.deepToString(nums));
    }

    public static void sort(int[][] nums){


        for (int i = 0; i < nums[0].length; i++) {

            for (int k = 0; k < nums.length; k++) {
                int min = nums[k][i];
                int minIndex = k;

                for (int j = k; j < nums.length; j++) {
                    if(nums[k][i] == nums[j][i] || nums[k][0] < nums[j][0])continue;

                    if (nums[j][i] <= min){
                        min = nums[j][i];
                        minIndex = j;
                    }
                }

                if (i == 0 && minIndex != k){
                    int[] temp = nums[k];
                    nums[k] = nums[minIndex];
                    nums[minIndex] = temp;
                } else if (minIndex != k && nums[k][0] == nums[minIndex][0]) {
                    int[] temp = nums[k];
                    nums[k] = nums[minIndex];
                    nums[minIndex] = temp;
                }


            }
        }

        System.out.println(Arrays.deepToString(nums));
    }

}
