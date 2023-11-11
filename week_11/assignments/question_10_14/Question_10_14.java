package week_11.assignments.question_10_14;

public class Question_10_14 {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        System.out.println(date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
        MyDate date2 = new MyDate(34355555133101L);
        System.out.println(date2.getDay() + "/" + date2.getMonth() + "/" + date2.getYear());
    }
}
