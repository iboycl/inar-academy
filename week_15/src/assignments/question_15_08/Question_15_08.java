package assignments.question_15_08;

public class Question_15_08 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        System.out.println("Is the stack empty? -> " + stack.empty());
        System.out.println();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Integers were added to the stack: " + stack);
        System.out.println();

        System.out.println("The stack popped: " + stack.pop());
        System.out.println(stack);
        System.out.println();

        System.out.println("The top element in the stack: " + stack.top());
        System.out.println(stack);
        System.out.println();

        System.out.println("Is the stack empty? -> " + stack.empty());
    }
}
