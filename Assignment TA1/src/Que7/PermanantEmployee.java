package Que7;

public class PermanantEmployee implements Employee{
    String name;
    int id;
    int salary;

    public PermanantEmployee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display(){
        System.out.print("This is Permanant Employee");
    }

}
