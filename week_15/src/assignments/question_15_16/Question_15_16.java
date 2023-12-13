package assignments.question_15_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Question_15_16 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file path: ");
        String path = input.nextLine();

        File file = new File(path);
        Scanner input2 = new Scanner(file);
        String str = "";
        while (input2.hasNext()){
            str += input2.nextLine().toLowerCase() + " ";
        }

        ArrayList<String> words = new ArrayList<>(List.of(str.split("[,.;:?() \"']")));
        words.removeIf(String::isEmpty);
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (Character.isDigit(word.charAt(0))) {
                words.remove(word);
                String wordNew = removeDigit(word);
                words.add(i, wordNew);
            }
        }


        System.out.println(words);

        Map<String, Integer> wordCount = new HashMap<>();

        while (!words.isEmpty()) {
            String wrd = words.remove(0);
            wordCount.put(wrd, wordCount.getOrDefault(wrd, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()){
            System.out.printf("%-20s %d\n", entry.getKey(), entry.getValue());
        }
    }

    public static String removeDigit (String word) {
        String wordNew = "";
        for (int j = 1; j < word.length(); j++) {
            wordNew += word.charAt(j);
        }
        if (Character.isDigit(wordNew.charAt(0))){
            return removeDigit(wordNew);
        } else {
            return wordNew;
        }
    }
}
