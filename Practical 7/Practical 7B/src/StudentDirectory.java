import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDirectory {
    private List<Student> directory;

    public StudentDirectory() {
        directory = new ArrayList<>();
    }

    public void addStudent(Student student) {
        directory.add(student);
        Collections.sort(directory);
    }

    public void removeStudent(Student student) {
        directory.remove(student);
    }

    public List<Student> getStudentsByCity(String city) {
        List<Student> studentsByCity = new ArrayList<>();
        for (Student student : directory) {
            if (student.getCity().equalsIgnoreCase(city)) {
                studentsByCity.add(student);
            }
        }
        return studentsByCity;
    }

    public List<Student> getAllStudents() {
        return directory;
    }
}
