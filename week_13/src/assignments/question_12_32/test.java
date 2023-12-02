package assignments.question_12_32;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://spillmagazine.com/spill-album-review-cranberries-something-else/");
        try(Scanner input = new Scanner(url.openStream()))
        {
            while (input.hasNext()){
                String str = input.nextLine();
                if (str.contains("Tamagotchi")){
                    System.out.println(str);
                }
            }
        }
    }
}
