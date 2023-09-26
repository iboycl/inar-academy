public class Question_04_06 {
    public static void main(String[] args) {


        // Define random angles
        // Calcullate the x and y coordinates
        // Find tha abc sides
        // Find the angles

        double angle1 = (Math.random() * (2 * Math.PI));
        double angle2 = (Math.random() * (2 * Math.PI));
        double angle3 = (Math.random() * (2 * Math.PI));

        final double RADIUS = 40;

        double x1 = RADIUS * Math.cos(angle1);
        double y1 = RADIUS * Math.sin(angle1);
        double x2 = RADIUS * Math.cos(angle2);
        double y2 = RADIUS * Math.sin(angle2);
        double x3 = RADIUS * Math.cos(angle3);
        double y3 = RADIUS * Math.sin(angle3);

        double side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double side2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double side3 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

        double angleA = Math.acos((side1 * side1 - side2 * side2 - side3 * side3) / (-2 * side2 * side3));
        double angleB = Math.acos((side2 * side2 - side1 * side1 - side3 * side3) / (-2 * side1 * side3));
        double angleC = Math.acos((side3 * side3 - side2 * side2 - side1 * side1) / (-2 * side1 * side2));

        System.out.println(Math.toDegrees(angleA) + "--" + Math.toDegrees(angleB) + "--" + Math.toDegrees(angleC));

    }
}
