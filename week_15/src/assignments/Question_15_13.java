package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_15_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add((int)(Math.random() * 5));
        }
        System.out.println(list);

        Map<Integer, Integer> repetitions = new HashMap<>();

        for (int e : list){
            repetitions.put(e, repetitions.getOrDefault(e, 0) + 1);
        }
        System.out.println(repetitions);

        System.out.print("Enter a number to find elements appearing more than this number: ");
        int num = input.nextInt();

        System.out.print("Elements appearing more than " + num + " times: ");
        for (Map.Entry<Integer, Integer> entry : repetitions.entrySet()){
            if (entry.getValue() > num) System.out.print(entry.getKey() + " ");
        }
    }
}
