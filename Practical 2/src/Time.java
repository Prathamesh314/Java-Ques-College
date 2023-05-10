public class Time {
    int hour,minutes,second,day;
    Time(){
        hour=0;
        minutes=0;
        second=0;
    }
    Time(int h,int m,int s){
        hour = h;
        minutes = m;
        second = s;
    }
    
    void test(Time obj[]){
        int carry;
        int n = obj.length%3;
        for(int i=0;i< 3;i++){
            second+=obj[i].second;
        }
        if(second>=60){
            carry = second/60;
            second = second%60;
        }
        else{
            carry=0;
        }
        for(int i=0;i<3;i++){
            minutes+=obj[i].minutes;
        }
        minutes+=carry;
        if(minutes>=60){
            carry  = minutes/60;
            minutes=minutes%60;
        }
        else{
            carry = 0;
        }
        for(int i=0;i<3;i++){
            hour+=obj[i].hour;
        }
        hour+=carry;
        day = hour/24;
        hour = hour%24;
    }

    void delete(Time t1,Time t2){
        int carry=0;
        second = t2.second-t1.second;
        if(second<0){
            second = 60-Math.abs(t1.second-t2.second);
            t1.minutes-=1;
        }
        minutes = t1.minutes-t2.minutes;
        if(minutes<0){
            minutes = 60 - Math.abs(t1.minutes - t2.minutes);
            t1.hour-=1;
        }
        hour = t1.hour-t2.hour;
    }

    void display(String s){
        System.out.printf("%s : %d days %d hour : %d minutes : %d seconds\n",s,day,hour,minutes,second);
    }
}
