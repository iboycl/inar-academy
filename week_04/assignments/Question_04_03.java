public class Question_04_03 {
    public static void main(String[] args) {

        double atlantax = Math.toRadians(33.7489954);
        double atlantay = Math.toRadians(-84.3879824);

        double orlandox = Math.toRadians(28.5383355);
        double orlandoy = Math.toRadians(-81.3792365);

        double savannahx = Math.toRadians(32.0835407);
        double savannahy = Math.toRadians(-81.0998342);

        double charlottex = Math.toRadians(35.2270869);
        double charlottey = Math.toRadians(-80.8431267);

        double radius = 6371.01;

        double distanceAtlantaToOrlando = radius * Math.acos(Math.sin(atlantax) * Math.sin(orlandox) + Math.cos(atlantax) * Math.cos(orlandox) * Math.cos(atlantay - orlandoy));

        double distanceOrlandoToCharlotte = radius * Math.acos(Math.sin(orlandox) * Math.sin(charlottex) + Math.cos(orlandox) * Math.cos(charlottex) * Math.cos(orlandoy - charlottey));

        double distanceCharlotteToAlanta = radius * Math.acos(Math.sin(charlottex) * Math.sin(atlantax) + Math.cos(charlottex) * Math.cos(atlantax) * Math.cos(charlottey - atlantay));

        double s = (distanceAtlantaToOrlando + distanceOrlandoToCharlotte + distanceCharlotteToAlanta)/2;

        double area = Math.sqrt(s * (s - distanceAtlantaToOrlando) * (s - distanceOrlandoToCharlotte) * (s - distanceCharlotteToAlanta));

        System.out.println("The area in the triangle of Atlanta - Orlando - Charlotte is " + area + " km square");
    }
}
