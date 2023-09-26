import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = input.nextLine().toLowerCase();

        int count = 0;


        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));

            if (c == 'a' || c == 'e' ||
                c == 'i' || c == 'o' ||
                c == 'u' || c == 'ö' ||
                c == 'ü'){
                count++;
            }
        }

        System.out.println("Your string includes " + count + " vowels");
    }

}
