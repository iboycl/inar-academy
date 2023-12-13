package assignments;

import java.util.*;

public class Question_15_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first list: ");
        ArrayList<String> list1 = new ArrayList<>(List.of(input.nextLine().split(" ")));

        System.out.println("Enter the second list: ");
        ArrayList<String> list2 = new ArrayList<>(List.of(input.nextLine().split(" ")));

        ArrayList<String> intersection = getStrings(list1, list2);

        System.out.println("Intersection of the two lists: " + intersection);
    }

    private static ArrayList<String> getStrings(ArrayList<String> list1, ArrayList<String> list2) {
        Map<String, Integer> combinedList = new HashMap<>();
        for (String str : list1) {
            combinedList.put(str, combinedList.getOrDefault(str, 0) + 1);
        }

        for (String str : list2) {
            combinedList.put(str, combinedList.getOrDefault(str, 0) + 1);
        }

        ArrayList<String> intersection = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : combinedList.entrySet()) {
            if (entry.getValue() > 1) {
                intersection.add(entry.getKey());
            }
        }
        return intersection;
    }
}
