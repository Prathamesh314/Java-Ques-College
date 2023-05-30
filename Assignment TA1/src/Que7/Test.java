package Que7;

public class Test {

    public static void main(String[] args){
        ConsultantManager cm = new ConsultantManager("Prathamesh",123,50000,4);
        Director d = new Director();
        PermanantManager pm = new PermanantManager("Prathamesh",123,50000);
        cm.show_experience();
        d.manage();
        pm.display();
    }

}
