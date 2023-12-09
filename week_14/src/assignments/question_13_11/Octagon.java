package assignments.question_13_11;

import live_class.GeometricObject;

public class Octagon extends GeometricObject implements Cloneable, Comparable<GeometricObject> {
    private double side = 2;

    Octagon(){

    }

    Octagon(Double side){
        this.side = side;
    }

    Octagon(Double side, String color, boolean isFilled) {
        super(color,isFilled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 2 * Math.pow(side, 2)*(1 + Math.sqrt(2));
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public boolean equals(GeometricObject octagon) {
        return getArea() == octagon.getArea();
    }

    @Override
    public Octagon clone() {
        try {
            return (Octagon) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
