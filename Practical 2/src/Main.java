// This is our practical 2 and main aim is as follows :-
// We need to write a code which stores the attendence of n Employees in an office
// We need to store how much hours an employee works everyday and we need to calculate total working hour of that employee in a month
// We need to do the same for n employees, take arrival and depature time as input for 30 days and then return total working hours by that employee

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee emp[] = new Employee[3];
        // Person 1
        emp[0] = new Employee("Prathamesh", 948, 19, 5000, "Head of Department");
        int tin1[] = { 10, 12, 20 };
        int tout1[] = { 17, 40, 20 };
        emp[0].add_attendence();
        emp[0].display();
    }
}