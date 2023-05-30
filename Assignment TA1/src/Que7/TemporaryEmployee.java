package Que7;

public class TemporaryEmployee implements Employee{
    int timeperiod;
    String name;
    int id;
    int salary;

    public TemporaryEmployee(int timeperiod, String name, int id, int salary) {
        this.timeperiod = timeperiod;
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display(){
        System.out.println("************ Details of Temporary Employee ***********");
        System.out.printf("Time Period : %d\n",timeperiod);
    }
}
