package assignments.question_13_16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_13_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the operation: ");
        //String str = "3/4 + 1/5";
        String str = input.nextLine();
        String operators = "+-*/";
        ArrayList<String> list = new ArrayList<>(List.of(str.split(" ")));

        if (list.size() != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        if (!operators.contains(list.get(1))) {
            System.out.println("Wrong operator! Use + , - , * , / ");
            System.exit(0);
        }

        String[] r1 = list.get(0).split("/");
        String[] r2 = list.get(2).split("/");

        Rational ra1 = new Rational(Integer.parseInt(r1[0]), Integer.parseInt(r1[1]));
        Rational ra2 = new Rational(Integer.parseInt(r2[0]), Integer.parseInt(r2[1]));

        switch (list.get(1)){
            case "+" -> System.out.println(str + " = " + ra1.add(ra2));
            case "-" -> System.out.println(str + " = " + ra1.subtract(ra2));
            case "*" -> System.out.println(str + " = " + ra1.multiply(ra2));
            case "/" -> System.out.println(str + " = " + ra1.divide(ra2));
        }
        System.out.println();


//        String operators = "+-*/";
//        ArrayList<String> list = new ArrayList<>(List.of(args[0].split(" ")));
//
//        if (list.size() != 3) {
//            System.out.println("Usage: java Calculator operand1 operator operand2");
//            System.exit(0);
//        }
//
//        if (!operators.contains(list.get(1))) {
//            System.out.println("Wrong operator! Use + , - , * , / ");
//            System.exit(0);
//        }
//
//        String[] r1 = list.get(0).split("/");
//        String[] r2 = list.get(2).split("/");
//
//        Rational ra1 = new Rational(Integer.parseInt(r1[0]), Integer.parseInt(r1[1]));
//        Rational ra2 = new Rational(Integer.parseInt(r2[0]), Integer.parseInt(r2[1]));
//
//        switch (list.get(1)){
//            case "+" -> System.out.println(args[0] + " = " + ra1.add(ra2));
//            case "-" -> System.out.println(args[0] + " = " + ra1.subtract(ra2));
//            case "*" -> System.out.println(args[0] + " = " + ra1.multiply(ra2));
//            case "/" -> System.out.println(args[0] + " = " + ra1.divide(ra2));
//        }
//        System.out.println();

    }
}


