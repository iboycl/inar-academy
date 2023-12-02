package assignments.question_12_05;

public class IllegalTriangleException extends Exception{
    private Triangle triangle;

    public IllegalTriangleException(Triangle triangle){
        super("Invalid triangle!! Sum of any two sides must be greater than the other side" );
        this.triangle = triangle;
    }

    public Triangle getTriangle() {
        return triangle;
    }
}
