package week_11.assignments.question_10_3;

public class Question_10_03 {
    public static void main(String[] args) {
        MyInteger num = new MyInteger(41614161);

        System.out.println(
                "\ngetValue(): " + num.getValue() +
                "\nisEven(): " + num.isEven() +
                "\nisOdd(): " + num.isOdd() +
                "\nisPrime(): " + num.isPrime() +
                "\nequals(10): " + num.equals(10) +
                "\nequals(MyInteger(41614161)): " + num.equals(new MyInteger(41614161)) +
                "\nisEven(2) static: " + MyInteger.isEven(2) +
                "\nisOdd(11) static: " + MyInteger.isOdd(11) +
                "\nisPrime(47) static: " + MyInteger.isPrime(47) +
                "\nparseInt(char[] {1, 2, 3}) static:" + MyInteger.parseInt(new char[]{'1', '2', '3'}) +
                "\nparseInt(String 123) static:" + MyInteger.parseInt("123")

        );
    }
}
