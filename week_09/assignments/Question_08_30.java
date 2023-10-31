package week_09.assignments;

public class Question_08_30 {
    public static void main(String[] args) {
        double[][] a = {{4,6},{3,2}};
        double[] b = {8,2};

        if (linearEquation(a,b) == null) System.out.println("The equation has no solution.");

        System.out.println("x is " + linearEquation(a, b)[0] + " and y is " + linearEquation(a,b)[1]);
    }

    public static double[] linearEquation(double[][] a, double[] b){
        if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0) return null;
        double[] solution = {0,0};
        solution[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        solution[1]  = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

        return solution;
    }

}
