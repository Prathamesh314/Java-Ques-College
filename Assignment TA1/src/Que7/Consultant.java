package Que7;

public class Consultant extends TemporaryEmployee{
    Consultant(String name, int empid, int salary, int timeperiod) {
        super(name, empid, salary, timeperiod);
    }

    public void show_experience(){
        System.out.println("Hii i am consultant");
    }
}
