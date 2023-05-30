package Que1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Department {
    int n;
    Student[] st;
    Teacher[] tc;
    File file = new File("C:\\Users\\kurve\\IdeaProjects\\OOP_Assignment\\src\\Que1\\Student.txt");
    Scanner sc = new Scanner(file);

    File file1 = new File("C:\\Users\\kurve\\IdeaProjects\\OOP_Assignment\\src\\Que1\\teacher.txt");
    Scanner sc1 = new Scanner(file1);
    public Department() throws FileNotFoundException {
    }

    void addStudent(int n) throws FileNotFoundException {
        st = new Student[n];
        String name;
        int day,month,year,roll,sem;

        for(int i=0;i<n;i++){
            name = sc.next();
            roll = Integer.parseInt(sc.next());
           sem = Integer.parseInt(sc.next());
           day = Integer.parseInt(sc.next());
           month = Integer.parseInt(sc.next());
           year = Integer.parseInt(sc.next());
            st[i] = new Student(name,day,month,year,roll,sem);
        }
    }

    void addTeacher(int n) throws FileNotFoundException{
        tc = new Teacher[n];
        String name,quali;
        int exp,day,month,year;
        for(int i=0;i<n;i++){
            name = sc1.next();
            quali = sc1.next();
            exp = Integer.parseInt(sc1.next());
            day = Integer.parseInt(sc1.next());
            month = Integer.parseInt(sc1.next());
           year = Integer.parseInt(sc1.next());
            tc[i] = new Teacher(name,day,month,year,quali,exp);
        }
    }
}
