import java.util.Scanner;

public class Question_07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string to sort: ");

        String s = input.next();

        System.out.println("Sorted form: " + sort(s));
    }

    public static String sort(String s){
        String sorted = "";
        int[] sort = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            sort[i] = s.charAt(i);
        }
        SelectionSort.selectionSort(sort);

        for (int e : sort) sorted += (char) e;

        return  sorted;
    }
}
