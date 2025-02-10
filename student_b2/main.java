import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        studentlist sl = new studentlist();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Student Manager:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Students");
            System.out.println("3. Display Students");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Sort Students by Name");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter id:");
                    String id = sc.nextLine();
                    System.out.println("Enter name:");
                    String name = sc.nextLine();
                    System.out.println("Enter age:");
                    int age = sc.nextInt();
                    student s = new student(id, name, age);
                    sl.addStudent(s);
                    break;
                case 2:
                    System.out.println("Enter name:");
                    String removeName = sc.nextLine();
                    sl.removeStudent(removeName);
                    break;
                case 3:
                    sl.displayStudents();
                    break;
                case 4:
                    System.out.println("Enter name:");
                    String searchName = sc.nextLine();
                    sl.searchStudent(searchName);
                    break;
                case 5:
                    sl.sortByName();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}