public class Question_05_11 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 5 == 0 ^ i % 6 == 0){
                count++;
                System.out.print(count % 10 == 0 ? i +"\n" : i + " ");
            }
        }
    }
}
