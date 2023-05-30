package Que1;

public class Teacher extends Person{
    double salary;
    String qualification;
    int experience;
    private int sal;

    int max = -2147483648,min= 2147483647;
    String name_min,name_max;

    Teacher(String name,int date,int month,int year,String qualification,int experience){
        super(name,date,month,year);
        this.qualification = qualification;
        this.experience = experience;
    }

    void findmin_max(Teacher[] t){
        for(Teacher teacher:t){
            if(teacher.age < min){
                min = teacher.age;
                name_min = teacher.name;
            }
            if(teacher.age > max){
                max = teacher.age;
                name_max  = teacher.name;
            }
        }
    }

    void calculate_Salary(){
        if(this.qualification.equals("PG")){
            sal = 60000;
        }
        else if(this.qualification.equals("PHD")){
            sal = 80000;
        }

        this.salary = sal + this.experience*2000;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Qualifications: "+qualification);
        System.out.println("Experience: "+experience);
        calculate_Salary();
        System.out.println("Salary: "+salary);
        System.out.println(name_min + " has minimum age of " + min);
        System.out.println(name_max + " has minimum age of " + max);
    }
}
