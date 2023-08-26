import java.util.Scanner;

public class Question_03_08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 digits:");

        byte a = input.nextByte();

        byte b = input.nextByte();

        byte c = input.nextByte();

        if (a < b && a < c) {
            System.out.print(a + " < ");
            if (b < c){
                System.out.print(b + " < " + c);
            } else {
                System.out.print(c + " < " + b);
            }
        } else if (b < a && b < c) {
            System.out.print(b + " < ");
            if (a < c){
                System.out.print(a + " < " + c);
            } else {
                System.out.print(c + " < " + a);
            }
        } else {
            if (a < b){
            System.out.print(c + " < " + a + " < " + b);
            } else {
                System.out.print(c + " < " + b + " < " + a);
            }
        }

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a + b + c - max - min;

        System.out.println("\n" + min + " < " + mid + " < " + max);
    }
}
