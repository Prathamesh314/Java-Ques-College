import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            StudentDirectory directory = new StudentDirectory();

            Student student1 = new Student(1, "John Doe", 3, "New York", "1234567890");
            Student student2 = new Student(2, "Jane Smith", 2, "Los Angeles", "9876543210");
            Student student3 = new Student(3, "Alice Johnson", 3, "New York", "5555555555");

            directory.addStudent(student1);
            directory.addStudent(student2);
            directory.addStudent(student3);

            System.out.println("All Students:");
            List<Student> allStudents = directory.getAllStudents();
            for (Student student : allStudents) {
                System.out.println(student);
            }

            System.out.println("\nStudents in New York:");
            List<Student> studentsInNY = directory.getStudentsByCity("New York");
            for (Student student : studentsInNY) {
                System.out.println(student);
            }

            directory.removeStudent(student2);

            System.out.println("\nAll Students after removing Jane Smith:");
            allStudents = directory.getAllStudents();
            for (Student student : allStudents) {
                System.out.println(student);
            }
        } catch (MissingDataException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}