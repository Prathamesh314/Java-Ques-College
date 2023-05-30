package Que1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Student extends Person{
    int roll_no,sem,age;
    double cgpa;
    private List<Double> CgpaList = new ArrayList<Double>();
    Scanner sc =  new Scanner(System.in);

    Student(String name,int date,int month,int year,int roll_no,int sem){
        super(name,date,month,year);
        this.roll_no = roll_no;
        this.sem = sem;
        for(int i=0;i<this.sem;i++) {
            System.out.printf("Enter CGPA of sem %d: ", i + 1);
            double CGPA = sc.nextDouble();
            CgpaList.add(CGPA);
        }

    }

    double Departmental_Average(Student[] s){
        int ans = 0;
        for (Student student : s) {
            ans += student.cgpa;
        }
        ans = ans/s.length;
        return ans;
    }

    double Calculate_average_age(Student[] s){
        double ans = 0;

        for(Student student: s){
            student.Calculate_age();
            ans+=student.age;
        }
        ans = ans/s.length;
        return ans;
    }

    void Calculate_avg_sem_cgpa(int n){
        double ans = 0;
        for(int i=0;i<n;i++){
            ans+=CgpaList.get(i);
        }
        cgpa = ans/n;
//        return ans;
    }

    void display_cgpa(){
        for(int i=0;i<CgpaList.size();i++){
            System.out.println("SGPA of sem "+i+1+" "+CgpaList.get(i));
        }
    }

    void display(){
        System.out.printf("Name :- %s\nRoll No.:- %d\n" +
                "Semester :- %d\n" +
                "CGPA :- %f\n",
                super.name,roll_no,sem,cgpa);
    }
}
