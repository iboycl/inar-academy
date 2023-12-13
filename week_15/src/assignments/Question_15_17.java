package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_15_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers (enter 0 to stop): ");

        int num = input.nextInt();
        Map<Integer, Integer> nums = new HashMap<>();
        while (num != 0) {
            nums.put(num, nums.getOrDefault(num, 0) + 1);
            num = input.nextInt();
        }


        int most = 0;
        ArrayList<Integer> mosts = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : nums.entrySet()) {
            int value = entry.getValue();
            int key = entry.getKey();

            if (value > most){
                mosts.clear();
                most = value;
                mosts.add(key);
            } else if (value == most) {
                mosts.add(key);
            }
        }


        System.out.println(nums);
        System.out.println("Number(s) with the most occurrences: ");
        for (int i : mosts){
            System.out.println(i + " --> " + nums.get(i) + " times. ");
        }

    }
}
