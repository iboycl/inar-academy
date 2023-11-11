package week_11.assignments.question_10_22;

import java.util.Arrays;

public class MyString1 {
    private String str;

    public MyString1(String s){
        str = s;
    }
    public MyString1(char[] chars){
        str = String.valueOf(chars);
    }

    public char charAt(int index){
        return str.charAt(index);
    }

    public int length(){
        return str.length();
    }

    public MyString1 subString(int begin, int end){
        str = str.substring(begin,end);
        return new MyString1(str.substring(begin,end));
    }

    public MyString1 toLoweCase(){
        str = str.toLowerCase();
        return new MyString1(str.toLowerCase());
    }

    public boolean equals(MyString1 s){
        return s.str.equals(str);
    }

    public static MyString1 valueOf(int i){
        return new MyString1(String.valueOf(i));
    }

    @Override
    public String toString(){
        return str;
    }
}
