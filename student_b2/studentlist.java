import java.util.ArrayList;
import java.util.Comparator;

public class studentlist {
    private ArrayList<student> students;

    public studentlist() {
        students = new ArrayList<student>();
    }

    public void addStudent(student s) {
        students.add(s);
        System.out.println("Student added successfully");
    }

    public void removeStudent(String name) {
        students.removeIf(s -> s.getName().equals(name));
        System.out.println("Student removed successfully");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        } else {
            System.out.println("Student List:");
            students.forEach(System.out::println);
        }
    }

    public void searchStudent(String name) {
        for (student s : students) {
            if (s.getName().equals(name)) {
                System.out.println("Student found:");
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student not found");
    }

    public void sortByName() {
        students.sort(Comparator.comparing(student::getName));
        System.out.println("Students sorted by name.");
    }
}
