public class Question_05_06 {
    public static void main(String[] args) {
        System.out.println("Miles Kilometers | Kilometers Miles");

        for (int i = 1, j = 20; i < 20; i++, j += 5) {
            System.out.printf("%-5d %-10.3f | %-10d %.3f\n", i, i * 1.609, j, j / 1.609);
        }
    }
}
