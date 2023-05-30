package Que6;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class ConvertTimeZone{
    int ind_time;
    double ind_min;
    String country;
    int country_time;
    double country_min;

    Conutries d = new Conutries();
    DecimalFormat dobj = new DecimalFormat("#.##");
    public ConvertTimeZone(String name){
        country = name;
        Double time = d.map.get("India");
        ind_time = (int) Math.floor(time);
        ind_min = Double.parseDouble(dobj.format(time-ind_time));

        Double time1 = d.map.get(country);
        country_time = (int) Math.floor(time1);
        country_min = Double.parseDouble(dobj.format(time1-country_time));

    }

    public Time convert(){
        LocalDateTime ld = LocalDateTime.now();
        Time t1 = new Time(ind_time, (int) (ind_min*100),0);
        Time t2 = new Time(country_time,(int)country_min*100,0);

        Time t3 = new Time();
        t3.subtract(t1,t2);

        Time t = new Time();
        Time nowtime = new Time(ld.getHour(),ld.getMinute(),ld.getSecond());
        t.add(nowtime,t3);
        return t;
    }

}