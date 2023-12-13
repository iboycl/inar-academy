package assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Question_15_11 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Java source code file name:");
        String path = input.nextLine();


        String str = "";
        File source = new File(path);
        Scanner input2 = new Scanner(source);
        while (input2.hasNext()){
            str += input2.nextLine();
        }


        Stack<Character> symbols = new Stack<>();
        boolean illegal = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                symbols.push(ch);
            } else if (ch == '}' && (symbols.isEmpty() || symbols.pop() != '{')) {
                illegal = false;
            } else if (ch == ')' && (symbols.isEmpty() || symbols.pop() != '(')) {
                illegal = false;
            } else if (ch == ']' && (symbols.isEmpty() || symbols.pop() != '[')) {
                illegal = false;
            }
        }

        System.out.println("The source code has " + (illegal ? "" : "in") + "correct pairs of grouping symbols.");
    }
}
