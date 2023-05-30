package Que7;

public class ConsultantManager extends Consultant implements Manager{
    ConsultantManager(String name, int empid, int salary, int timeperiod) {
        super(name, empid, salary, timeperiod);
    }

    public void show_experience(){
        System.out.println("Hello I am a Consultant Manager having experience of 5 years and I am here to help you with your problems");
    }

    public void manage(){
        System.out.println("Hii i am a manager");
    }
}
