public class Triangle extends SimpleGeometricObject {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    Triangle(){

    }

    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(){
        double s = (side1 + side2 + side3) / 2.0;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "A Triangle " + super.toString() + "\n" +
                "side1 = " + getSide1() + " side2 = " + getSide2() + " side3 = " + getSide3() + "\n" +
                "Area: " + getArea() + "\n" +
                "Perimeter: " + getPerimeter();
    }
}
