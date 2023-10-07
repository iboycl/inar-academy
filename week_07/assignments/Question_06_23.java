import java.util.Scanner;

public class Question_06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.print("Enter a character you want to count: ");
        char ch = input.nextLine().charAt(0);

        System.out.println(count(str, ch));
    }

    public static int count(String str, char ch){
        int occ = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) occ++;
        }
        return occ;
    }
}
