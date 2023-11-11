package week_11.assignments.question_10_12;

import week_10.assignments.IntersectingPoint;
import week_11.assignments.question_10_4.MyPoint;

import javax.swing.*;

public class Triangle2D {
    MyPoint p1, p2, p3;

    Triangle2D(){
        p1 = new MyPoint(0,0);
        p2 = new MyPoint(1,1);
        p3 = new MyPoint(2,5);

    }

    Triangle2D(MyPoint pnt1, MyPoint pnt2, MyPoint pnt3){
        p1 = pnt1;
        p2 = pnt2;
        p3 = pnt3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public double getArea(){
        double side1 = this.p1.distance(p2);
        double side2 = this.p2.distance(p3);
        double side3 = this.p3.distance(p1);
        double s = (side1 + side2 + side3) / 2.0;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter(){
        double side1 = this.p1.distance(p2);
        double side2 = this.p2.distance(p3);
        double side3 = this.p3.distance(p1);

        return side1 + side2 + side3;
    }

    public boolean contains(MyPoint p){
        double side1Check = (p2.getX() - p1.getX()) * (p.getY() - p1.getY()) - (p.getX() - p1.getX()) * (p2.getY() - p1.getY());
        double side2Check = (p3.getX() - p2.getX()) * (p.getY() - p3.getY()) - (p.getX() - p3.getX()) * (p3.getY() - p2.getY());
        double side3Check = (p3.getX() - p1.getX()) * (p.getY() - p1.getY()) - (p.getX() - p1.getX()) * (p3.getY() - p1.getY());

        return (side1Check > 0 && side2Check > 0 && side3Check < 0) ||
               (side1Check < 0 && side2Check > 0 && side3Check > 0) ||
               (side1Check > 0 && side2Check < 0 && side3Check > 0);
    }

    public boolean contains(Triangle2D t){
        return contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3());
    }

    public boolean overlaps(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4){

        if (new IntersectingPoint(p1,p2,p3,p4).isSolvable()){
            double intX =new IntersectingPoint(p1,p2,p3,p4).getX();
            double intY =new IntersectingPoint(p1,p2,p3,p4).getY();

            return Math.abs(p1.distance(p2) - (p1.distance(intX,intY) + p2.distance(intX,intY))) < 0.0001 &&
                    Math.abs(p3.distance(p4) - (p3.distance(intX,intY) + p4.distance(intX,intY))) < 0.0001;

        }

        return false;
    }

    public boolean overLaps(Triangle2D t){
        return  overlaps(p1, p2, t.p1, t.p2) || // check side 1
                overlaps(p1, p2, t.p2, t.p3) ||
                overlaps(p1, p2, t.p3, t.p1) ||
                overlaps(p2, p3, t.p2, t.p3) || // check side 2
                overlaps(p2, p3, t.p3, t.p1) ||
                overlaps(p2, p3, t.p1, t.p2) ||
                overlaps(p3, p1, t.p3, t.p1) || // check side 3
                overlaps(p3, p1, t.p1, t.p2) ||
                overlaps(p3, p1, t.p2, t.p3);
    }
}
