package assignments.question_12_04;

public class Question_12_04 {
    public static void main(String[] args) {
        try {
            Loan loan = new Loan(-1,2,3);
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
