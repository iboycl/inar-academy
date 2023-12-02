package assignments.question_12_32;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_32 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = input.nextLine();
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        crawler(url, word); // Traverse the Web from the starting URL
    }

    public static void crawler(String startingURL, String word) throws IOException {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(startingURL);
        boolean stop = true;
        while ( stop &&
                !listOfPendingURLs.isEmpty() &&
                listOfTraversedURLs.size() <= 100) {
            String urlString = listOfPendingURLs.remove(0);
            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);
                System.out.println("Craw " + urlString);
                java.net.URL url = new java.net.URL(urlString);

                try (Scanner input = new Scanner(url.openStream());){
                    while (input.hasNext()){
                        String line = input.nextLine();
                        if (line.contains(word)){
                            System.out.println("The word has been found!");
                            stop = false;
                            break;}
                    }
                }

                for (String s : getSubURLs(urlString)) {
                    if (!listOfTraversedURLs.contains(s))
                        listOfPendingURLs.add(s);
                }
            }
        }
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            java.net.URL url = new java.net.URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("http:", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) { // Ensure that a correct URL is found
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    } else {
                        current = -1;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return list;
    }
}


