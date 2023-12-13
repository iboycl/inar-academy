package assignments.question_15_09;

public class Question_15_09 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        System.out.println("Is the queue empty? -> " + queue.empty());
        System.out.println();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);

        System.out.println("Integers were added to the queue: " + queue);
        System.out.println();

        System.out.println("The queue popped: " + queue.pop());
        System.out.println(queue);
        System.out.println();

        System.out.println("The first element in the queue: " + queue.peek());
        System.out.println(queue);
        System.out.println();

        System.out.println("Is the queue empty? -> " + queue.empty());
    }
}
