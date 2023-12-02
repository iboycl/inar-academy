package assignments.question_12_10;

public class Question_12_10 {
    public static void main(String[] args) {
        try {
            int[] array = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError ex) {
            System.out.println("OutOfMemoryError occurs.! : Java heap space");
        }
    }
}
