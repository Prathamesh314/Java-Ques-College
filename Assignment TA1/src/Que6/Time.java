package Que6;

public class Time {
    int hour,min,sec,day,ms;
    private String meridian = "AM";

    Time(){

    }
    Time(int hour,int min,int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    void add(Time t1,Time t2){
        int carry = 0;
        sec = t1.sec + t2.sec + carry;
        if(sec >= 60){
            carry = sec/60;
            sec = sec%60;
        }
        min = t1.min+t2.min + carry;
        if(min >= 60){
            carry = min/60;
            min = min%60;
        }
        else{
            carry = 0;
        }
        hour = t1.hour+t2.hour+carry;
        if(hour>12 && hour<24){
            meridian = "PM";
            hour = hour%12;
        }
        if(hour>=24){
            carry =  hour/24;
            hour = hour%24;
        }
        else{
            carry = 0;
        }
        if(carry > 0){
            day = carry;
        }
    }
    void add(Time t1,Time t2,int ms1,int ms2){
        int carry = 0;
        ms = ms1+ms2;
        if(ms>=100){
            carry = ms/100;
            ms = ms%100;
        }
        sec = t1.sec + t2.sec + carry;
        if(sec >= 60){
            carry = sec/60;
            sec = sec%60;
        }
        min = t1.min+t2.min + carry;
        if(min >= 60){
            carry = min/60;
            min = min%60;
        }
        hour = t1.hour+t2.hour+carry;
        if(hour>12 && hour<24){
            meridian = "PM";
            hour = hour%12;
        }
        if(hour>=24){
            carry =  hour/24;
            hour = hour%24;
        }
        if(carry > 0){
            day = carry;
        }
    }

    void subtract(Time t1,Time t2){
        int carry = 0;
        sec = t2.sec - t1.sec;
        if(sec < 0){
            carry = -1;
            sec = 60 - Math.abs(sec);
        }

        min = t2.min - t1.min + carry;
        if(min < 0){
            carry = -1;
            min = 60 - Math.abs(min);
        }
        else{
            carry = 0;
        }

        hour = t2.hour - t1.hour + carry;
    }
    void subtract(Time t1,Time t2,int ms2,int ms1){
        int carry = 0;
        ms = ms2 - ms1;
        if(ms < 0){
            carry = -1;
            ms = 100 - Math.abs(ms);
        }
        sec = t2.sec - t1.sec + carry;
        if(sec < 0){
            carry = -1;
            sec = 60 - Math.abs(sec);
        }
        else{
            carry = 0;
        }

        min = t2.min - t1.min + carry;
        if(min < 0){
            carry = -1;
            min = 60 - Math.abs(min);
        }
        else{
            carry = 0;
        }

        hour = t2.hour - t1.hour + carry;
    }
    void display(){
        System.out.printf("Day: %d\n",day);
        System.out.printf("Hour: %d %s\n",hour,meridian);
        System.out.printf("Minutes: %d\n",min);
        System.out.printf("Second: %d\n",sec);
        System.out.printf("Milli second: %d",ms);
    }

}
