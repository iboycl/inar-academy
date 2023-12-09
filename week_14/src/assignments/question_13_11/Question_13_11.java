package assignments.question_13_11;

public class Question_13_11 {
    public static void main(String[] args) {
        Octagon octagon = new Octagon(5.0);
        System.out.println("Area: " + octagon.getArea());
        System.out.println("Perimeter: " + octagon.getPerimeter());

        System.out.println();

        System.out.println("Cloning the Octagon...");

        Octagon octagon2 = octagon.clone();
        System.out.println("Is octagon1 equal to octagon2 -> " + octagon.equals(octagon2));
    }
}
