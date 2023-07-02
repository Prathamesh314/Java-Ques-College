public class Student implements Comparable<Student> {
    private int roll;
    private String name;
    private int semester;
    private String city;
    private String contact;

    public Student(int roll, String name, int semester, String city, String contact) throws MissingDataException {
        if (name == null || city == null || contact == null) {
            throw new MissingDataException("Missing student data");
        }
        this.roll = roll;
        this.name = name;
        this.semester = semester;
        this.city = city;
        this.contact = contact;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public int getSemester() {
        return semester;
    }

    public String getCity() {
        return city;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public int compareTo(Student other) {
        if (this.semester == other.semester) {
            return this.roll - other.roll;
        }
        return this.semester - other.semester;
    }

    @Override
    public String toString() {
        return "Roll: " + roll + ", Name: " + name + ", Semester: " + semester + ", City: " + city + ", Contact: " + contact;
    }
}