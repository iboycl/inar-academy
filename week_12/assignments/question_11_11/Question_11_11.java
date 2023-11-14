package question_11_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt();
            if (value != 0)
                list.add(value);
        } while (value != 0);

        System.out.println("Before sorting..");
        for (int i : list) System.out.print(i + " ");

        System.out.println();

        System.out.println("After sorting");
        sort(list);
        for (int i : list) System.out.print(i + " ");
    }

    public static void sort(ArrayList<Integer> list){
        Collections.sort(list);
    }
}
