public class Student {
    String name,department,gender;
    double cgpa;
    Student(String name,String department,String gender,double cgpa){
        this.name = name;
        this.department = department;
        this.gender = gender;
        this.cgpa = cgpa;
    }

    void display(){
        System.out.printf("Name:- %s",name);
        System.out.printf("Department:- %s",department);
        System.out.printf("Gender:- %s",gender);
    }
}
