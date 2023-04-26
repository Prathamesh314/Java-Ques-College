public class Employee {
    String empname,designation;
    int empid,age;
    double salary;

    Attendence att[] = new Attendence[30];
    int atindex = 0;
    Employee(String name,int empid,int age,double salary,String designation){
        empname = name;
        this.empid = empid;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
    }

    void add_attendence(){
        att[atindex] = new Attendence(empname);
        att[atindex].add1(Integer.toString(atindex+1));
        atindex+=1;
    }

    void display(){
        System.out.printf("Name :- %s\nEmployee Id :- %d\nAge :- %d\nDegisnation :- %s\nSalary :- %f\n",empname,empid,age,designation,salary);
        att[0].show_time(0);

    }

}
