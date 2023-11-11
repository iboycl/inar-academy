package week_11.assignments.question_10_10;

public class Queue {
    private int[] elements;
    private int size;
    public static  final int DEFAULT_CAPACITY = 8;

    public Queue(){
        this(DEFAULT_CAPACITY);
    }

    Queue(int capacity){
        elements = new int[capacity];
    }

    public void enqueue (int v){
        if (size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }

    int dequeue(){
        int num = elements[0];
        int[] temp = new int[elements.length];
        System.arraycopy(elements, 1, temp, 0, size);
        size--;
        elements = temp;
        return num;
    }

    boolean isEmpty(){return size == 0;}

    public int getSize(){return size;}

    public int[] getElements(){
        return elements;
    }
}
