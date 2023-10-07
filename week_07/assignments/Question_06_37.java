import java.util.Scanner;

public class Question_06_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number and its width: ");
        int number = input.nextInt();
        int width = input.nextInt();

        System.out.printf("%d is formatted to width %d: %s", number, width, format(number, width));
    }

    public  static String format(int number, int width){
        String str = "";
        for (int i = 0; i < width - Integer.toString(number).length(); i++) {
            str += "0";
        }
        return str + number;
    }
}
