package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Question_15_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add ((int) (Math.random() * 100));
        }
        System.out.println("Generated list: " + list);

        int index = (int) (Math.random() * 10) + 1;

        Collections.sort(list);

        System.out.println("What is the " + index + ". greatest number?");
        System.out.println("The " + index + "th latgest element is: " + list.get(list.size()-index));


    }
}
