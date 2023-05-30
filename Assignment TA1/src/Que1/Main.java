package Que1;

import java.io.FileNotFoundException;

public class Main {
        public static void main(String[] args) throws FileNotFoundException {
                Department d = new Department();
                d.addStudent(1);
                d.addTeacher(1);
                d.st[0].Calculate_age();
                d.st[0].Calculate_avg_sem_cgpa(2);
                System.out.println("\nDisplaying Student Detail...");
                d.st[0].display();
                d.st[0].displayAge();
                d.tc[0].Calculate_age();
                d.tc[0].calculate_Salary();
                d.tc[0].findmin_max(d.tc);
                System.out.println("\nDisplaying Teacher details....");
                d.tc[0].display();
                d.tc[0].displayAge();
        }
}
