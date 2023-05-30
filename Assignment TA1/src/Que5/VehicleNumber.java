package Que5;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class VehicleNumber{
    String s1;
    private int flag1 = 0,flag2 = 0;
    String s2;
    String state,id;

    String[] states = {"MP","MH","AP","DL","GJ"};
    File file = new File("C:\\Users\\kurve\\IdeaProjects\\OOP_Assignment\\src\\Que5\\input.txt");
    Scanner sc = new Scanner(file);

    public VehicleNumber() throws FileNotFoundException {
    }

    public void check(){
        s1 = sc.next();
        s2 = sc.next();
        state = s1.substring(0,2);
        try{
            for(int i=0;i< states.length;i++){
                if(state.equals(states[i])) flag1 = 1;
            }
            if(flag1 == 0) throw new UserException(1);
            if(s1.charAt(2)!='-') throw new UserException(2);
            try{
                int n = Integer.parseInt(s1.substring(3));

            }
            catch(Exception e){
                System.out.println("Invalid number");
            }
            if(s1.substring(3).length() != 2) throw new UserException(4);
            String demo = s2.substring(0,2).toUpperCase();
            if(!demo.equals(s2.substring(0,2))) throw new UserException(3);
            if(s2.charAt(2) != '-') throw new UserException(2);
            try{
                int n = Integer.parseInt(s2.substring(3));
            }
            catch(Exception e){
                System.out.println("Invalid number");
            }
            if(s2.substring(3).length() != 4) throw new UserException(4);

            System.out.println("Given vehicle number is Valid");

        }
        catch (UserException e){
            System.out.println(e);
        }
    }

}
