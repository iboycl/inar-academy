package week_10.live_class;

public class Circle {

    double radius = 1;

    public Circle(){

    }

    Circle(double newRadius){
        radius = newRadius;
    }

    double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    double setRadius(double newRadius){
        radius = newRadius;
        return newRadius;
    }

    @Override
    public String toString() {
        return "Radius: " + radius;
    }
}
