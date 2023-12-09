package live_class;

public class Rectangle extends GeometricObject{

    private double width;
    private double height;

    public Rectangle(){

    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea(){
        return height * width;
    }
    @Override
    public double getPerimeter(){
        return 2 * (width + height);
    }

    @Override
    public boolean equals(GeometricObject rectangle) {
        return getArea() == rectangle.getArea();
    }

    public String toString(){
        return super.toString() +
                "\nWidth: " + width +
                "\nHeight: " + height +
                "\nArea: " + getArea() +
                "\nPerimeter: " + getPerimeter();
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
