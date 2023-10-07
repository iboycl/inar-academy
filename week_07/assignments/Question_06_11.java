public class Question_06_11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount | Commission");
        for (double i = 10000; i <= 100000; i+= 5000) {
            System.out.printf("%-12.0f | %10.1f\n",i ,computeCommission(i));
        }
    }

    public static double computeCommission(double salesAmount){
        double commission = 0;

        if (salesAmount <= 5000){
            commission = salesAmount * 0.08;
        } else if (salesAmount <= 10000) {
            commission = 5000 * 0.08 + (salesAmount - 5000) * 0.10;
        } else {
            commission = 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12;
        }

        return commission;
    }
}
