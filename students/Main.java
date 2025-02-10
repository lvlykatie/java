import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Student Manager:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by Name");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter name:");
                    String name = sc.nextLine();
                    System.out.println("Enter age:");
                    int age = sc.nextInt();
                    System.out.println("Enter grade:");
                    double grade = sc.nextDouble();
                    Student s = new Student(name, age, grade);
                    sm.addStudent(s);
                    break;
                case 2:
                    sm.displayStudents();
                    break;
                case 3:
                    System.out.println("Enter name:");
                    String searchName = sc.nextLine();
                    sm.searchStudent(searchName);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
