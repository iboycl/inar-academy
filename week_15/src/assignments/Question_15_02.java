package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Question_15_02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            list.add((int)(Math.random() * 100));
        }

        System.out.print("Generated integers: " + list);

        System.out.println();

        Set<Integer> list2 = new HashSet<>(list);
        System.out.println("List after removing duplicates: " + list2);
    }
}
