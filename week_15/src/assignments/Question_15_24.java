package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Question_15_24 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 20));
        }

        System.out.println("List : " + list);
        int k = (int) (Math.random() * 5) + 1;

        System.out.println("Range to check duplicate: " + k);

        System.out.println("Is there a nearby duplicate absolute range at most " + k + "? " + checkDuplicatesInRange(list, k));
    }

    public static boolean checkDuplicatesInRange(ArrayList<Integer> list, int range) {
        Set<Integer> nums = new HashSet<>();
        for (int i : list) {
            if (!nums.add(i)){
                return list.lastIndexOf(i) - list.indexOf(i) <= range;
            }
        }
        return false;
    }
}
