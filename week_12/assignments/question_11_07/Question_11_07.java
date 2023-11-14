package question_11_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt();
            if (!list.contains(value) && value != 0)
                list.add(value);
        } while (value != 0);

        System.out.println("Before shuffling..");

        for (Integer i : list) System.out.print(i + " ");

        shuffle(list);

        System.out.println("\nAfter shuffling..");

        for (Integer i : list) System.out.print(i + " ");
    }

    public static void shuffle(ArrayList<Integer> list){
        Collections.shuffle(list);
    }
}
