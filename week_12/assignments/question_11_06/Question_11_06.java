package question_11_06;

import week_10.live_class.Circle;
import week_10.live_class.Loan;

import java.util.ArrayList;
import java.util.Date;

public class Question_11_06 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();

        list.add(new Loan());
        list.add(new Circle());
        list.add(new Date());
        list.add("Inar Academy");

        for (Object o : list) System.out.println(o + "\n---------------------------------");

    }
}
