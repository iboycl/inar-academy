package assignments.question_15_08;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> list1 = new LinkedList<>();

    public void push(int x) {
        list1.add(x);
    }

    public int pop() {
        Queue<Integer> list2 = new LinkedList<>();
        while (list1.size() != 1) {
            list2.add(list1.remove());
        }
        int top = list1.remove();
        list1 = list2;
        return top;
    }

    public int top() {
        Queue<Integer> list2 = new LinkedList<>();

        while (list1.size() != 1) {
            list2.add(list1.remove());
        }
        int top = list1.remove();
        list2.add(top);
        list1 = list2;
        return top;
    }

    public boolean empty() {
        return list1.isEmpty();
    }

    @Override
    public String toString() {
        return list1.toString();
    }
}
