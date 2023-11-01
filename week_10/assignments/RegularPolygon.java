package week_10.assignments;
//UML Class Diagram
/****************************************************************
 *               Regular Polygon                                *
 * -------------------------------------------------------------*
 * n: int                                                       *
 * side: double                                                 *
 * x: double                                                    *
 * y: double                                                    *
 * -------------------------------------------------------------*
 * +RegularPolygon()                                            *
 * +RegularPolygon(n: int, side: double)                        *
 * +RegularPolygon(n: int, side: double, x: double, y: double)  *
 * +getN() : int                                                *
 * +setN(n: int)                                                *
 * +getSide() : double                                          *
 * +setSide(side: double)                                       *
 * +getX() : double                                             *
 * +setX(x: double)                                             *
 * +getY() : double                                             *
 * +setY(y: double)                                             *
 * +getPerimeter() : double                                     *
 * +getArea() : double                                          *
 ****************************************************************/
public class RegularPolygon {
    private int n = 3;
    private double side = 1;

    private double x = 0;

    private double y = 0;

    RegularPolygon(){}

    RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
    }

    RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter(){
        return side * n;
    }

    public double getArea(){
        return  (n * Math.pow(side,2)) / (4 * Math.tan(Math.PI / n));
    }
}
