package week_01.assignments;

public class Question_01_13 {
    public static void main(String[] args){
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = .55;
        double e = 44.5;
        double f = 5.9;
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
        /*System.out.println("x and y values in the following equation:" + "\n" +
                "3.4x + 50.2y = 44.5" + "\n" +
                "2.1x + .55y  = 5.9" + "\n");*/
        System.out.println("x and y values in the following equation:" + "\n" +
                           a + "x + " + b + "y = " + e + "\n" +
                           c + "x + " + d + "y = " + f + "\n");
        System.out.println("x =" + "\n" + x + "\n" + "y =" + "\n" + y);
    }
}
