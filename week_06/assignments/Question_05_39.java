package week_06.assignments;

public class Question_05_39 {
    public static void main(String[] args) {
        double earn = 0;
        double sales = 0;

        while (earn < 25000){
            sales ++;
            if (sales <= 5000){
                earn = sales * 0.08;
            } else if (sales <= 10000) {
                earn = 5000 * 0.08 + (sales - 5000) * 0.10;
            } else {
                earn = 5000 * 0.08 + 5000 * 0.10 + (sales - 10000) * 0.12;
            }
        }
        System.out.println("Minimum sales to earn $30000: " + sales);
    }
}
