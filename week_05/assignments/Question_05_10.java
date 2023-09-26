public class Question_05_10 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 1000; i+=10) {
            if (i % 5 == 0 && i % 6 == 0){
                count++;
                System.out.print(count % 10 == 0 ? i +"\n" : i + " ");
            }
        }
    }
}
