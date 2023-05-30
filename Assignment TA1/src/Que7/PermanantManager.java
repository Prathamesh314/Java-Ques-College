package Que7;

public class PermanantManager extends PermanantEmployee implements Manager{
    PermanantManager(String name,int empid,int salary){
        super(name,empid,salary);
    }

    public void manage(){
        super.display();
        System.out.println("Hello I am here to manage hard tasks");
    }
}
