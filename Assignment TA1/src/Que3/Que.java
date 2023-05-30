package Que3;

public class Que {

    double ans;
    char[] charArray;
    int whole_part;

    public void calculate(double numerator,double denominator,int number){
        ans = (numerator/denominator)*number;
        whole_part = (int) Math.floor(ans);
        System.out.println(ans);
        ans = ans-whole_part;
        charArray = String.valueOf(ans).substring(2).toCharArray();
    }

    public void display(){
        System.out.println("Whole Part "+whole_part);
        System.out.println("Displaying array of decimal part...");
        for(int i=0;i<charArray.length;i++){
            System.out.printf("%c ",charArray[i]);
        }
    }
}
