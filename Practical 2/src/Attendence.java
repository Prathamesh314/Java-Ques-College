import java.util.Scanner;

public class Attendence {
    String name;
    int d = 0;
    Time Tin[] = new Time[30];
    Time Tout[] = new Time[30];
    Time working_time [] = new Time[30];
    Time monthly_working_time[] = new Time[30];
    String day[] = new String[30];

    Attendence(String name){
        this.name = name;
    }
    void add1(String day){
//        if(d<30){
        for(int t=0;t<3;t++){
            int timein[] = new int[3];
            int timeout[] = new int[3];
            Scanner sc = new Scanner(System.in);
//            n1 = sc.nextInt();
            System.out.printf("Enter hour,minutes and seconds when you entered for day %d: ",t+1);
            for(int i=0;i<3;i++){
                timein[i] = sc.nextInt();
            }
            System.out.printf("Enter hour,minutes and seconds when you departed for day %d: ",t+1);
            for(int i=0;i<3;i++){
                timeout[i] = sc.nextInt();
            }
            Tin[t] = new Time(timein[0],timein[1],timein[2]);
            Tout[t] = new Time(timeout[0],timeout[1],timeout[2]);
            this.day[t] = day;
//            d+=1;
        }
    }
    void show_time(int i){
        for(int t=0;t<3;t++){
            Tin[t].display("Arrival Time");
            Tout[t].display("Departure Time");
            find_day_time(t);
            working_time[t].display("Total Working Time in a day");
//            find_working(t);
//            monthly_working_time[t].display("Total Working Time in a Month");
//            System.out.printf("\n");
        }
        find_working(0);
        monthly_working_time[0].display("Total Working Time in a Month");
        System.out.printf("\n");
    }

    void find_working(int i){
        monthly_working_time[i] = new Time();
//        monthly_working_time[i].add(Tin[i],Tout[i]);
        monthly_working_time[i].test(working_time);
    }

    void find_day_time(int i){
        working_time[i] = new Time();
        working_time[i].delete(Tout[i],Tin[i]);
    }

}
