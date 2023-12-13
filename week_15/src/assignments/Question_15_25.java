package assignments;

import java.util.ArrayList;

public class Question_15_25 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add((int) (Math.random() * 100));
        }

        System.out.println("Generated list: ");
        System.out.println(list);

        int num = (int) (Math.random() * 100);
        System.out.println("Generated target sum: " + num);

        boolean check = false;

        for (int i1 : list){
            if (i1 * 2 == num) {
                continue;
            } else if (list.contains(num - i1)){
                check = true;
                System.out.println("Numbers are: " + i1 + ", " + (num - i1));
                System.out.println("Result: " + check);
                break;
            }
        }

        if (!check) System.out.println("Result: " + check);
    }
}
