public class Question_06_09 {
    public static void main(String[] args) {
        System.out.println("Feet Meters | Meters Feet");
        double j = 20.0;
        for (double i = 1.0; i <= 10.0 ; i++) {
            double meter = footToMeter(i);
            System.out.printf("%-4.1f %-6.3f | ", i, meter);

            double feet = meterToFoot(j);
            System.out.printf("%-6.1f %-4.3f\n", j, feet);
            j += 5;
        }


    }

    public static double footToMeter(double foot) {
        return foot * 0.305;
    }

    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }
}
