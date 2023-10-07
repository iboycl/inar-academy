import java.util.Scanner;

public class Question_07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int[] list = new int[input.nextInt()];

        System.out.print("Enter the values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        System.out.println("The list has " + (isConsecutiveFour(list) ? "" : "no ")+ "consecutive fours \n");

    }
    public static boolean isConsecutiveFour(int[] values){
        boolean consecutive = false;
        for (int i = 0; i < values.length - 4; i++) {
            if ((values[i] == values[i + 1]) && (values[i] == values[i + 2]) && (values[i] == values[i + 3])){
                consecutive = true;
                break;
            }
        }
        return consecutive;
    }
}
