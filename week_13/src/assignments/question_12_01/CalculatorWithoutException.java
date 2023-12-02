package assignments.question_12_01;

public class CalculatorWithoutException {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        // The result of the operation
        int result = 0;
        boolean isArgsDigit = true;

        for (int i = 0; i < args[0].length(); i++) {
            if (!Character.isDigit(args[0].charAt(i))){
                isArgsDigit = false;
                System.out.println("Wrong input: " + args[0]);
            }
        }

        for (int i = 0; i < args[2].length(); i++) {
            if (!Character.isDigit(args[2].charAt(i))){
                isArgsDigit = false;
                System.out.println("Wrong input: " + args[2]);
            }
        }

        if (isArgsDigit){

        // Determine the operator
            switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                    break;
                case '-':
                    result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                    break;
                case '*':
                    result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                    break;
                case '/':
                    result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                    break;
            }

        // Display result
            System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
        }
    }
}
