package week_10.assignments;

import week_11.assignments.question_10_4.MyPoint;

public class IntersectingPoint {
    private double a, b, c, d, e, f;

    public IntersectingPoint(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        a = y1 - y2;
        b = -1 * (x1 - x2);
        c = y3 - y4;
        d = -1 * (x3 - x4);
        e = (y1 - y2) * x1 - (x1 - x2) * y1;
        f = (y3 - y4) * x3 - (x3 - x4) * y3;
    }

    public IntersectingPoint(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4){
        a = p1.getY() - p2.getY();
        b = -1 * (p1.getX() - p2.getX());
        c = p3.getY() - p4.getY();
        d = -1 * (p3.getX() - p4.getX());
        e = (p1.getY() - p2.getY()) * p1.getX() - (p1.getX() - p2.getX()) * p1.getY();
        f = (p3.getY() - p4.getY()) * p3.getX() - (p3.getX() - p4.getX()) * p3.getY();
    }

    public void getSolution(){
        LinearEquation eq1 = new LinearEquation(a,b,c,d,e,f);
        if (isSolvable()){
            System.out.printf("The intersecting point is at ( %.4f, %.4f)", eq1.getX(), eq1.getY());
        } else System.out.println("The two lines are parallel");
    }

    public boolean isSolvable(){
        return new LinearEquation(a,b,c,d,e,f).isSolvable();
    }

    public double getX(){
        return ((e * d) - (b * f)) / ((a * d) - (b * c));
    }

    public double getY(){
        return ((a * f) - (e * c)) / ((a * d) - (b * c));
    }
}
