package assignments.question_13_01;

import live_class.GeometricObject;

public class Triangle extends GeometricObject {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    Triangle() throws IllegalTriangleException{

    }

    public Triangle (double side1, double side2, double side3) throws IllegalTriangleException{
        if (side1 < side2 + side3 && side2 < side1 + side3 && side3 < side2 + side1){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else throw new IllegalTriangleException(this);

    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) throws IllegalTriangleException{
        if (side1 < side2 + side3){
            this.side1 = side1;
        } else throw new IllegalTriangleException(this);
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) throws IllegalTriangleException {
        if (side2 < side1 + side3){
            this.side2 = side2;
        } else throw new IllegalTriangleException(this);
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) throws IllegalTriangleException {
        if (side3 < side2 + side1){
            this.side3 = side3;
        } else throw new IllegalTriangleException(this);
    }


    public double getArea(){
        double s = (side1 + side2 + side3) / 2.0;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public boolean equals(GeometricObject triangle) {
        return getArea() == ((Triangle)(triangle)).getArea();
    }

    @Override
    public String toString() {
        return "A Triangle " + super.toString() + "\n" +
                "side1 = " + getSide1() + " side2 = " + getSide2() + " side3 = " + getSide3() + "\n" +
                "Area: " + getArea() + "\n" +
                "Perimeter: " + getPerimeter();
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
}
