package week_11.assignments.question_10_3;

import java.util.Arrays;

public class MyInteger {
    private int value;

    MyInteger(int num){
        value = num;
    }

    public int getValue(){
        return value;
    }

    public boolean isEven(){
        return value % 2 == 0;
    }

    public boolean isOdd(){
        return !(value % 2 == 0);
    }

    public boolean isPrime(){
        for (int divisor = 2; divisor <= value / 2; divisor++) if (value % divisor == 0) return false;
        return true;
    }

    public boolean equals(int num) {
        return num == value;
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    public static boolean isOdd(int num){
        return !(num % 2 == 0);
    }

    public static boolean isPrime(int num){
        for (int divisor = 2; divisor <= num / 2; divisor++) if (num % divisor == 0) return false;
        return true;
    }

    public boolean equals(MyInteger num) {
        return num.value == this.value;
    }

    public static int parseInt(char[] c){
        return Integer.parseInt(String.valueOf(c));
    }

    public static int parseInt(String str){
        return Integer.parseInt(str);
    }

}
