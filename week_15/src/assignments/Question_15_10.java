package assignments;

import java.util.Scanner;
import java.util.Stack;

public class Question_15_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Post Fix Expression: ");

        Stack<Integer> operation = new Stack<>();
        String[] str = input.nextLine().split(" ");
        Stack<String> explanation = new Stack<>();

        for (String num : str){
            if (num.contains("+") || num.contains("-") || num.contains("*") || num.contains("/")){
                switch (num) {
                    case "+" -> {
                        int num1 = operation.pop();
                        int num2 = operation.pop();
                        operation.add(num1 + num2);
                        if (operation.size() == 1){

                            if (explanation.empty()){
                                explanation.add("(" + num1 + " + " + num2 + ")");
                            } else {
                                explanation.add("(" + explanation.pop() + " + " + num2 + ")");
                            }

                        } else {
                            explanation.add("(" + num1 + " + " + num2 + ")");
                        }
                    }
                    case "-" -> {
                        int num1 = operation.pop();
                        int num2 = operation.pop();
                        operation.add(num1 - num2);
                        if (operation.size() == 1){

                            if (explanation.empty()){
                                explanation.add("(" + num1 + " - " + num2 + ")");
                            } else {
                                explanation.add("(" + explanation.pop() + " - " + num2 + ")");
                            }

                        } else {
                            explanation.add("(" + num1 + " - " + num2 + ")");
                        }
                    }
                    case "*" -> {
                        int num1 = operation.pop();
                        int num2 = operation.pop();
                        operation.add(num1 * num2);
                        if (operation.size() == 1){

                            if (explanation.empty()){
                                explanation.add("(" + num1 + " * " + num2 + ")");
                            } else {
                                explanation.add("(" + explanation.pop() + " * " + num2 + ")");
                            }

                        } else {
                            explanation.add("(" + num1 + " * " + num2 + ")");
                        }
                    }
                    case "/" -> {
                        int num1 = operation.pop();
                        int num2 = operation.pop();
                        operation.add(num1 / num2);
                        if (operation.size() == 1){

                            if (explanation.empty()){
                                explanation.add("(" + num1 + " / " + num2 + ")");
                            } else {
                                explanation.add("(" + explanation.pop() + " / " + num2 + ")");
                            }

                        } else {
                            explanation.add("(" + num1 + " / " + num2 + ")");
                        }
                    }
                }
            } else {
                operation.add(Integer.parseInt(num));
            }
        }

        System.out.print("Output: ");
        while (!operation.empty()){
            System.out.print(((operation.size() > 1) ? operation.pop() + ", " : operation.pop() + "\n"));
        }

        System.out.print("Explanation: ");
        while (!explanation.empty()) {
            System.out.print(explanation.pop());
        }
    }
}
