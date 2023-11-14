public class TestCircleRectangle {
    public static void main(String[] args) {
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1);

        System.out.println(
                "A circle " + circle.toString() + "\n" +
                "The color is " + circle.getColor() + "\n" +
                "The radius is " + circle.getRadius() + "\n" +
                "The area is " + circle.getArea() + "\n" +
                "The diameter is " + circle.getDiameter() + "\n"
        );

        RectangleFromSimpleGeometricObject rectange =
                new RectangleFromSimpleGeometricObject(2,4);
        System.out.println(
                "A rectangle " + rectange.toString() + "\n" +
                "The area is " + rectange.getArea() + "\n" +
                "The perimeter is " + rectange.getPerimeter()
        );
    }
}
