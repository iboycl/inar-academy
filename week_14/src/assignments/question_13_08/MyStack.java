package assignments.question_13_08;

import java.util.ArrayList;

public class MyStack implements Cloneable{
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.isEmpty() ? null : list.get(getSize() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    @Override
    public Object clone() {
        try {
            MyStack clone = (MyStack) super.clone();
            clone.list = (ArrayList<Object>)(list.clone());
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
