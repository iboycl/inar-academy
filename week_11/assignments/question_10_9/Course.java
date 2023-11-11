package week_11.assignments.question_10_9;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String name){
        courseName = name;
    }
    public void addStudent(String student){
        if (numberOfStudents >= students.length){
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }

        students[numberOfStudents++] = student;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(String student){
        String[] temp = new String[students.length];
        for (int i = 0, j = 0; i < numberOfStudents; i++) {
            if(students[i].equals(student)){
                continue;
            };
            temp[j] = students[i];
            j++;
        }
        students = temp;
        numberOfStudents--;
    }

    public void clear(){
        students = new String[100];
        numberOfStudents = 0;
    }
}
