package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_15_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a DNA sequence: ");
        String str = input.nextLine();

        Map<String, Integer> seqs = new HashMap<>();
        for (int i = 0; i < str.length() - 5; i++) {
            String seq = "";
            for (int j = 0; j < 5; j++) {
                seq += str.charAt(i + j);
            }
            seqs.put(seq, seqs.getOrDefault(seq, 0) + 1);
        }

        ArrayList<String> repeatedSeqs = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : seqs.entrySet()) {
            if (entry.getValue() > 1) {
                for (int i = 0; i < entry.getValue(); i++) {
                    repeatedSeqs.add(entry.getKey());
                }
            }
        }

        System.out.println("Repeated 5-letter sequences: \n" + repeatedSeqs);


    }
}
