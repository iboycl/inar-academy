package assignments;

import java.util.ArrayList;

public class Question_15_06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add ((int) (Math.random() * 99) + 1);
        }
        System.out.println(list);

        ArrayList<Integer> evens = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);

            if (num % 2 == 0) {
                evens.add(list.remove(i));
            }
        }

        list.addAll(evens);
        System.out.println(list);

        System.out.println();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list2.add ((int) (Math.random() * 99) + 1);
        }
        System.out.println(list2);
        int count = 0;

        for (int i = 0; i < list2.size(); i++) {
            int num = list2.get(i);

            if (num % 2 == 0) {
                list2.add(list2.remove(i));
                i--;
                count++;
            }
            if (count == list2.size())break;
        }


        System.out.println(list2);
    }
}
