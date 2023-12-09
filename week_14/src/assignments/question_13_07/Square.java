package assignments.question_13_07;

import live_class.GeometricObject;

public class Square extends GeometricObject implements Colorable {
    private double side = 2;

    Square() {

    }

    Square(Double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public boolean equals(GeometricObject square) {
        return side == ((Square)(square)).getSide();
    }
}
