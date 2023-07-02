import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("C:\\Users\\kurve\\Documents\\GitHub\\Java-Ques-College\\Practical 5\\src\\input.txt");
        Scanner sc = new Scanner(f1);
        String name = sc.next();
        double cgpa = Double.parseDouble(sc.next());
        String enroll_no = sc.next();
        String password = sc.next();

        Student s = new Student(name,cgpa,enroll_no,password);
        s.check();
        s.check_Pass();
    }
}