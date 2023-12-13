package assignments.question_15_09;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> list1 = new Stack<>();

    public void push(int x) {
        list1.add(x);
    }

    public int pop() {
        Stack<Integer> list2 = new Stack<>();
        while (list1.size() != 1) {
            list2.add(list1.pop());
        }
        int bottom = list1.pop();
        while (!list2.empty()){
            list1.add(list2.pop());
        }
        return bottom;
    }

    public int peek() {
        Stack<Integer> list2 = new Stack<>();

        while (list1.size() != 1) {
            list2.add(list1.pop());
        }
        int bottom = list1.pop();
        list2.add(bottom);
        while (!list2.empty()){
            list1.add(list2.pop());
        }
        return bottom;
    }

    public boolean empty() {
        return list1.isEmpty();
    }

    @Override
    public String toString() {
        return list1.toString();
    }
}
