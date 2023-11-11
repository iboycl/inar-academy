package week_11.assignments.question_10_10;

public class Question_10_10 {
    public static void main(String[] args) {
        Queue que = new Queue();

        for (int i = 1; i < 21; i++) {
            que.enqueue(i);
        }

        for (int i = 0; i < que.getSize(); i++) {
            System.out.print(que.getElements()[i] + " ");
            if (i==9)System.out.println();
        }
        int size = que.getSize();
        System.out.println("\n-------------------------------");
        System.out.println("Size is " + size);
        System.out.println("Dequeue started:\n");
        for (int i = 0; i < size; i++) {
            System.out.print(que.dequeue() + " ");
        }
        System.out.println("\nQueue size: " + que.getSize());

        System.out.println("-------------------------------");
        System.out.println("Is queue empty?");
        System.out.println(que.isEmpty());
    }
}
