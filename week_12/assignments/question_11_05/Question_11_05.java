package question_11_05;

public class Question_11_05 {
    public static void main(String[] args) {
        Course test = new Course("Java");
        test.addStudent("Nisanur Altuntaş");
        test.addStudent("Gurkan Serteser");
        test.addStudent("Sinan Çetin");
        test.addStudent("Mehmet Toprak");
        test.addStudent("Sefa Atakul");
        test.addStudent("Musa Denis");
        test.addStudent("Berkan Eris");

        System.out.println(test);
        System.out.println("-------------------------\n" +
        "After dropping student from the course..");
        test.dropStudent("Sinan Çetin");
        test.dropStudent("Mehmet Toprak");
        test.dropStudent("Berkan Eris");
        System.out.println(test);
    }
}
