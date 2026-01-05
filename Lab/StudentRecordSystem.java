import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;
    double cgpa;

    Student(int id, String name, int age, double cgpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println(
            "ID: " + id +
            ", Name: " + name +
            ", Age: " + age +
            ", CGPA: " + cgpa
        );
    }
}

public class StudentRecordSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        students.add(new Student(1, "Ayaan", 20, 8.6));
        students.add(new Student(2, "Rahul", 21, 7.9));
        students.add(new Student(3, "Zoya", 19, 9.1));

        System.out.println("1. Search by ID");
        System.out.println("2. Search by Name");
        System.out.println("3. Sort by CGPA");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            boolean found = false;

            for (Student s : students) {
                if (s.id == id) {
                    s.display();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student not found");
            }

        } else if (choice == 2) {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            boolean found = false;

            for (Student s : students) {
                if (s.name.equalsIgnoreCase(name)) {
                    s.display();
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Student not found");
            }

        } else if (choice == 3) {

            Collections.sort(students, new Comparator<Student>() {
                public int compare(Student s1, Student s2) {
                    return Double.compare(s2.cgpa, s1.cgpa);
                }
            });

            System.out.println("Students sorted by CGPA (High to Low):");
            for (Student s : students) {
                s.display();
            }

        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
