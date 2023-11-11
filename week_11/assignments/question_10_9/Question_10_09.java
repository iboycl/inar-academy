package week_11.assignments.question_10_9;

public class Question_10_09 {
    public static void main(String[] args) {
        Course math = new Course("Math");

        math.addStudent("Özgür Kartal");
        math.addStudent("Bilal Topal");
        math.addStudent("Ada Kaya");
        math.addStudent("Besim Karabıyık");
        math.addStudent("Emir Uyanık");

        System.out.println(
                "Name of the course: " + math.getCourseName() + "\n" +
                        "Number of the students: " + math.getNumberOfStudents()
        );

        for (int i = 0; i < math.getNumberOfStudents(); i++) {
            System.out.println(math.getStudents()[i]);
        }

        System.out.println("-----------------------------------------------------------");

        math.dropStudent("Ada Kaya");

        System.out.println("Ada Kaya dropped.");

        System.out.println(
                "Name of the course: " + math.getCourseName() + "\n" +
                "Number of the students: " + math.getNumberOfStudents()
        );

        for (int i = 0; i < math.getNumberOfStudents(); i++) {
            System.out.println(math.getStudents()[i]);
        }

        System.out.println("-----------------------------------------------------------");

        math.clear();
        System.out.println("Course ended and all students graduated");

        System.out.println(
                "Name of the course: " + math.getCourseName() + "\n" +
                "Number of the students: " + math.getNumberOfStudents()
        );

        for (int i = 0; i < math.getNumberOfStudents(); i++) {
            System.out.println(math.getStudents()[i]);
        }


    }
}
