public class TwoDecimalPlace2 {
    public static void main(String[] args){
        double num = 10.23982934;

        System.out.println("Double Number: " + num);

        System.out.println("Double Number: " + String.format("%.2f", num));

        System.out.format("Double Number: %.3f", num);
    }
}
