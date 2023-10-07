public class Question_07_07 {
    public static void main(String[] args) {
        int[] digits = new int[100];
        int[] counts = new int[10];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = (int) (Math.random() * 10);
            for (int j = 0; j < counts.length; j++) {
                if (digits[i] == j) counts[j]++;
            }
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + "s: " + counts[i]);
        }
        System.out.println();
    }
    
}
