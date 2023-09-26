public class Question_05_15 {
    public static void main(String[] args) {
        int count = 1;

        for (int i = '!'; i <= '~'; i++) {
            System.out.print((count % 10 == 0) ? (char) i + "\n" : (char) i + " ");
            count++;
        }
    }
}
