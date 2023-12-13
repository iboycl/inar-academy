package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Question_15_01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 90) + 10);
        }

        System.out.print("Generated integers: " + list);

        System.out.println();
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);
    }
}
