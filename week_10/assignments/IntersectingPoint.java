package week_10.assignments;

public class IntersectingPoint {
    private double a, b, c, d, e, f;

    IntersectingPoint(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        a = y1 - y2;
        b = -1 * (x1 - x2);
        c = y3 - y4;
        d = -1 * (x3 - x4);
        e = (y1 - y2) * x1 - (x1 - x2) * y1;
        f = (y3 - y4) * x3 - (x3 - x4) * y3;
    }

    public void getSolution(){
        LinearEquation eq1 = new LinearEquation(a,b,c,d,e,f);
        if (eq1.isSolvable()){
            System.out.printf("The intersecting point is at ( %.4f, %.4f)", eq1.getX(), eq1.getY());
        } else System.out.println("The two lines are parallel");
    }
}
