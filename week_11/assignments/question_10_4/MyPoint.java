package week_11.assignments.question_10_4;

public class MyPoint {
    private double x, y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public MyPoint(){
        this(0,0);
    }
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint pnt){
        return Math.sqrt(Math.pow(pnt.x - this.x,2) + Math.pow(pnt.y - this.y,2));
    }

    public double distance(double x, double y){
        return Math.sqrt(Math.pow(x - this.x,2) + Math.pow(y - this.y,2));
    }
}
