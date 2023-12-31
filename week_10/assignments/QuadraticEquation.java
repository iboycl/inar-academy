package week_10.assignments;
//UML Class Diagram
/****************************************************************
 *               Quadratic Equation                             *
 * -------------------------------------------------------------*
 * a: double                                                    *
 * b: double                                                    *
 * c: double                                                    *
 * side: double                                                 *
 * -------------------------------------------------------------*
 * +QuadraticEquation(a: double, b: double, c: double)          *
 * +getA() : double                                             *
 * +setA(a: double)                                             *
 * +getB() : double                                             *
 * +setB(b: double)                                             *
 * +getC() : double                                             *
 * +setC(c: double)                                             *
 * +getDiscriminant() : double                                  *
 * +getRoot1() : double                                         *
 * +getRoot2() : double                                         *
 ****************************************************************/
public class QuadraticEquation {
    private  double a, b, c;

    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        return Math.pow(b,2) - 4 * a * c;
    }

    public double getRoot1(){
        if (getDiscriminant() < 0) return 0;
        return (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / 2 * a;
    }

    public double getRoot2(){
        if (getDiscriminant() < 0) return 0;
        return (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / 2 * a;
    }
}
