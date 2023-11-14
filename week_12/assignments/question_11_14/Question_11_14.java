package question_11_14;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_14 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter five integers for list1: ");

        for (int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }

        System.out.print("Enter five integers for list2: ");

        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }

        System.out.print("The combined list is ");
        ArrayList<Integer> list = union(list1, list2);
        for (int i : list) System.out.print(i + " ");
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        return list;
    }
}
