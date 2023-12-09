package assignments.question_13_03;

import java.util.ArrayList;

public class Question_13_03 {
    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(1.5);
        list.add(10);
        list.add(1.53);
        list.add(5);
        list.add(12.5);
        list.add(65);
        System.out.println("Before sorting..");
        System.out.println(list);

        System.out.println("After sorting..");
        sort(list);
        System.out.println(list);
    }

    public static void sort(ArrayList<Number> list){
        for (int i = 0; i < list.size(); i++) {
            int index = i;
            Number min = list.get(i);

            for (int j = i + 1; j < list.size(); j++) {
                if (min.doubleValue() > list.get(j).doubleValue()) {
                    min = list.get(j);
                    index = j;
                }
            }

            if (index != i) {
                list.set(index, list.get(i));
                list.set(i,min);
            }
        }
    }
}
