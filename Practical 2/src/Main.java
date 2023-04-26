import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee emp[] = new Employee[3];
        // Person 1
        emp[0] = new Employee("Prathamesh",948,19,5000,"Head of Department");
        int tin1[] = {10,12,20};
        int tout1[] = {17,40,20};
        emp[0].add_attendence();
        emp[0].display();

        // Person 2
//        emp[1] = new Employee("Ashutosh",950,19,100000,"Department of Humanities");
//        int tin2[] = {10,45,50};
//        int tout2[] = {18,30,20};
//        emp[1].add_attendence();
//        emp[1].display();
//
//        // Person 3
//        emp[2] = new Employee("Abhinav",900,19,50000,"Department of presentation");
//        int tin3[] = {10,0,0};
//        int tout3[] = {18,0,0};
//        emp[2].add_attendence();
//        emp[2].display();

//        String name,desig;
//        int empid,age,salary;
//        int n;
//        System.out.println("Enter total number of Employees:- ");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for(int i=0;i<n;i++){
//            System.out.println("Enter the name of Employee: ");
//            name = sc.next();
//            System.out.println("Enter Designation: ");
//            desig = sc.next();
//            System.out.println("Enter Employee Id: ");
//            empid = sc.nextInt();
//            System.out.println("Enter Age: ");
//            age = sc.nextInt();
//            System.out.println("Enter Salary: ");
//            salary = sc.nextInt();
//            emp[i] = new Employee(name,empid,age,salary,desig);
//            emp[i].add_attendence();
//        }
//        System.out.println("Displaying Details of Employees...");
//        for(int i=0;i<n;i++){
//            emp[i].display();
//        }
    }
}