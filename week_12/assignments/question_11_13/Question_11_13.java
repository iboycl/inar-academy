package question_11_13;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Question_11_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        int value;

        do {
            value = input.nextInt();
            if (value != 0)
                list.add(value);
        } while (value != 0);
        removeDuplicate(list);

        System.out.print("The distinct integers are ");
        for (int i : list) System.out.print(i + " ");
    }

    public static void removeDuplicate(ArrayList<Integer> list){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (Objects.equals(list.get(i), list.get(j))) list.remove(j);
            }
        }
    }
}
