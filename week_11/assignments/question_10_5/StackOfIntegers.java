package week_11.assignments.question_10_5;

import java.util.Arrays;

public class StackOfIntegers {
    private int[] elements;
    private int size;
    public static  final int DEFAULT_CAPACITY = 16;
    public StackOfIntegers(){
        this(DEFAULT_CAPACITY);
    }

    StackOfIntegers(int capacity){
        elements = new int[capacity];
    }

    public void push (int value){
        if (size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    int pop() {
        return elements[--size];
    }

    int peek() {
        return elements[size-1];
    }

    boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public int[] getElements() {
        return elements;
    }

    int[] reverse(){
        int[] reverse = new int[elements.length];
        for (int i = 0, j = elements.length - 1; i < elements.length; i++, j--) {
            reverse[j] = elements[i];
        }
        return reverse;
    }

}
