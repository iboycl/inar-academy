package question_11_02;

public class Question_11_02 {
    public static void main(String[] args) {
        Person gurol = new Person("Gurol", "Istanbul", 999999999, "gurol@inar.com");
        Student nafiz = new Student("Nafiz", "Ankara", 333333333, "nafiz@gmail.com", 0);
        Employee recai = new Employee("Recai", "İstanbul", 66666666,
                "recai@gmail.com", "910", 60000);
        Faculty serhat = new Faculty("Serhat", "Texas, Dallas", 413333333,
                "serhat@inar.com", "101", 50000, "10am to 6pm", "manager");
        Staff elon = new Staff("Elon", "California", 203022220,
                "elon@musk.com", "12", 6005000, "CEO");

        System.out.println(
                "   _Person_" + "\n" +
                gurol + "\n" +
                "\n" +
                "   _Student_" + "\n" +
                nafiz + "\n" +
                "\n" +
                "   _Employee_" + "\n" +
                recai + "\n" +
                "\n" +
                "   _Faculty_" + "\n" +
                serhat + "\n" +
                "\n" +
                "   _Staff_" + "\n" +
                elon
        );

    }
}
