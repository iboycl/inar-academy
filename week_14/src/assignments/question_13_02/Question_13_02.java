package assignments.question_13_02;

import java.util.ArrayList;

public class Question_13_02 {
    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(1.5);
        list.add(10);
        list.add(1.53);
        list.add(5);
        list.add(12.5);
        list.add(65);
        System.out.println("Before shuffle..");
        System.out.println(list);

        System.out.println("After shuffle..");
        shuffle(list);
        System.out.println(list);
    }

    /*public static void shuffle(ArrayList<Number> list){
        ArrayList<Number> list2 = new ArrayList<>();
        while (!list.isEmpty()){
            int index = (int)(Math.random() * list.size());
            list2.add(list.remove(index));
        }
        list = list2.clone();
    }*/

    public static void shuffle(ArrayList<Number> list){
        for (int i = 0; i < list.size(); i++) {
            int index = (int)(Math.random() * list.size());
            list.add(list.remove(index));
        }
    }
}
