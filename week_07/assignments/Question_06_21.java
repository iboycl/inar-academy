import java.util.Scanner;

public class Question_06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String str = input.nextLine();

        String numStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)){
                numStr += getNumber(ch);
            } else
                numStr += ch;
        }
        System.out.println(numStr);
    }

    public static int getNumber(char chr){
        String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        char ch = Character.toLowerCase(chr);
        int num = 0;
        for (int i = 0; i < 10; i++){
            if (letters[i].indexOf(ch) != -1){
                num = i;
                break;
            }
        }
        return num;
    }
}
