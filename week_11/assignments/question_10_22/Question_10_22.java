package week_11.assignments.question_10_22;

public class Question_10_22 {
    public static void main(String[] args) {
        MyString1 str = new MyString1(new char[]{'I', 'N', 'A', 'R'});
        System.out.println(str);
        System.out.println(str.toLoweCase());
        System.out.println(str.subString(0,3));
        System.out.println(str.length());
        System.out.println(str.equals(new MyString1(new char[]{'ı','n','a','r'})));
        System.out.println(str.equals(new MyString1(new char[]{'ı','n','a'})));
        System.out.println( MyString1.valueOf(65913));
    }
}
