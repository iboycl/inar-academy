package question_11_10;

import java.util.ArrayList;

public class MyStack extends ArrayList{
     private ArrayList<Object> list = new ArrayList<>();

     public Object peek() {
         return list.get(list.size() - 1);
     }
     public Object pop() {
         Object o = list.get(list.size() - 1);
         list.remove(list.size() - 1);
         return o;
     }

     public void push(Object o) {
         list.add(o);
     }

     @Override
     public String toString() {
         return "Stack: " + list.toString();
     }
 }
