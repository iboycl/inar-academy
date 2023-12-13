package assignments;

import java.util.*;

public class Question_15_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter words (enter -1 to finish): ");

        ArrayList<String[]> words = new ArrayList<>();
        String str = input.next();
        while (!str.equals("-1")) {
            char[] chs = str.toCharArray();
            Arrays.sort(chs);
            String str2 = Arrays.toString(chs);
            String[] arr = new String[2];
            arr[0] = str;
            arr[1] = str2;
            words.add(arr);
            str = input.next();
        }

        ArrayList<String> wordsList = new ArrayList<>();
        for (String[] arr : words){
            wordsList.add(arr[0]);
        }
        System.out.print("Original list: " + wordsList + "\n");

        ArrayList<Object> anagram = new ArrayList<>();
        while (!words.isEmpty()){
            String[] element = words.remove(0);
            ArrayList<String> group = new ArrayList<String>();
            group.add(element[0]);
            for (int i = 0; i < words.size(); i++) {
                String[] element2 = words.get(i);
                if (element2[1].equals(element[1])){
                    group.add(element2[0]);
                    words.remove(i);
                    i--;
                }
            }
            anagram.add(group);
        }

        System.out.println("Anagram groups" + anagram);
        //ArrayList<String> words = new ArrayList<>(List.of(input.nextLine().split(" ")));
        //words.remove(words.size() - 1);

        /*String str = input.next();
        Map<String, String> words = new HashMap<>();
        while (!str.equals("-1")) {
            char[] chs = str.toCharArray();
            Arrays.sort(chs);
            String str2 = Arrays.toString(chs);
            words.put(str, str2);
            str = input.next();
        }

        System.out.println("Original list of words: " + words.keySet());

        ArrayList<Object> anagram = new ArrayList<>();
        for (Map.Entry<String, String> entry : words.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            words.remove(key);
            ArrayList<String> group = new ArrayList<String>();
            group.add(entry.getKey());

            for (Map.Entry<String, String> entry2 : words.entrySet()){
                String key2 = entry2.getKey();
                if (value.equals(entry2.getValue())){
                    group.add(key2);
                    words.remove(key2);
                }
            }
            anagram.add(group);
        }

        System.out.println(anagram);*/
        /*ArrayList<String> letters = new ArrayList<>();
        for (String word : words){
            char[] letter = word.toCharArray();
            Arrays.sort(letter);
            letters.add(Arrays.toString(letter));
        }

        System.out.println(letters);
        ArrayList<Object> anagram = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (anagram.isEmpty()) {
                ArrayList<String> str = new ArrayList<>();
                str.add(word);
                for (int j = i + 1; j < letters.size(); j++) {
                    if (letters.get(i) == letters.get(j)){
                        anagram.get(0).
                    }
                }
            }

        }*/
    }
}
