import java.util.Scanner;

public class Question_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        int[] numbers = new int[10];
        int distinct = 0;

        String distincts = "";
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            boolean dis = true;
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) continue;
                if (numbers[i] == numbers[j]) dis = false;
            }
            if (dis){
                distinct++;
                distincts += numbers[i] + " ";
            }
        }

        System.out.println("The number of distinct number is " + distinct);
        System.out.print("The distinct numbers are: ");

        System.out.println(distincts);
    }
}
