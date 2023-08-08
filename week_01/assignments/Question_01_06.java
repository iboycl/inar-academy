package week_01.assignments;

public class Question_01_06 {
    public static void main(String[] args){
        int sum = 0;
        int N = 9;
        System.out.print("Toplanacak sayılar = ");
        for (int i = 1; i <= N; i++){
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\r\n" + "İlk " + N + " sayının toplamı = " + sum);
    }
}
