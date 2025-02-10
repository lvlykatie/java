import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<Student>();
    }

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        System.out.println("List of Students:");
        for (Student s : students) {
            s.displayStudent();
        }
    }

    public void searchStudent(String name) {
        for (Student s : students) {
            if (s.getName().equals(name)) {
                s.displayStudent();
                return;
            }
        }
        System.out.println("Student not found");
    }
}
