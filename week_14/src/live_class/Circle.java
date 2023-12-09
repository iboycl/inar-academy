package live_class;

public class Circle extends GeometricObject{

    private double radius;

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
        /*setColor(color);
        setFilled(filled);*/
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }


    public void printCircle(){
        /*System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);*/
        System.out.println("The circle is created " + super.getDateCreated() + " and the radius is " + radius);
    }
    @Override
    public String toString(){
        return super.toString() +
                "\nRadius: " + radius +
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

    @Override
    public boolean equals(GeometricObject circle) {
        return radius == ((Circle)(circle)).getRadius();
    }
}
