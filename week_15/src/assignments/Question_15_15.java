package assignments;

import java.util.*;

public class Question_15_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements (n): ");
        int number = input.nextInt();
        input.nextLine();

        System.out.println("Enter the elements of the list (each in the range [1, n]) : ");
        ArrayList<String> elements = new ArrayList<>(List.of(input.nextLine().split(" ")));

        Map<String, Integer> elementMap = new HashMap<>();

        for (int i = 1; i <= number; i++) {
            elementMap.put(Integer.toString(i), 0);
        }

        for (String str : elements){
            elementMap.put(str, elementMap.getOrDefault(str, 0) + 1);
        }
        ArrayList<Integer> missing = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : elementMap.entrySet()){
            if (entry.getValue() == 0){
                missing.add(Integer.parseInt(entry.getKey()));
            }
        }
        System.out.println("Numbers missing from the list: " + missing);
    }
}
