package assignments.question_15_03;

public class Point implements Comparable<Point>{
    private double x;
    private double y;

    Point(){
        this(0,0);
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
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

    @Override
    public int compareTo(Point o) {
        if (x < o.x)
            return -1;

        else if (x == o.x)

            if (y > o.y)
                return 1;
            else if (y < o.y)
                return -1;
            else
                return  0;

        else
            return 1;
    }

    @Override
    public String toString() {
        return "(" + String.format("%5.2f", x) + ", " + String.format("%5.2f", y) + ")";
    }
}
