public class Student {
    String name;
    double cgpa;
    String enroll_no;
    String password;

    private String s1;
    private int year;
    private String s2;
    private int roll;
    private int flag1 = 0,flag2=0,flag3=0,flag4=0;
    private String[] branch = {"CSU","ECU","ENU","EEU"};
    private int upper=0,lower=0,symbol=0,number=0;

    Student(String name,double cgpa,String enroll_no,String password){
        this.name = name;
        this.cgpa = cgpa;
        this.enroll_no = enroll_no;
        this.password =  password;
        this.s1 = enroll_no.substring(0,2);
        this.year = Integer.parseInt(enroll_no.substring(2,4));
        this.s2 = enroll_no.substring(4,7);
        this.roll = Integer.parseInt(enroll_no.substring(7));
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cgpa=" + cgpa +
                ", enroll_no='" + enroll_no + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    void check(){
        try{
            if(!(cgpa >=0 && cgpa <=10)) throw new ErrorHandling(10);
            if(!s1.equals("BE")) throw new ErrorHandling(8);
            if(!(year >=20 && year<=23)) throw new ErrorHandling(6);
            for(int i=0;i<branch.length;i++){
                if(s2.equals(branch[i])){
                    flag3 = 1;
                }
            }
            if(flag3==0) throw new ErrorHandling(5);
            if(!(roll >=1 && roll<=250)) throw new ErrorHandling(7);
            System.out.println("Valid Enrollment number");
        }
        catch(ErrorHandling e){
            System.out.println(e);
        }
    }

    void check_Pass(){
        try{
            if(password.length()<8) throw new ErrorHandling(1);
            for(int i=0;i<password.length();i++){
                if(password.charAt(i) >= 65 && password.charAt(i)<=90){
                    upper++;
                }
                else if(password.charAt(i) >= 97 && password.charAt(i)<=122){
                    lower++;
                }
                else if(password.charAt(i) >= 48 && password.charAt(i)<=57){
                    number++;
                }
                else{
                    symbol++;
                }
            }
            if(lower==0) throw new ErrorHandling(3);
            if(upper == 0) throw new ErrorHandling(2);
            if(number ==0) throw new ErrorHandling(9);
            if(symbol == 0) throw new ErrorHandling(4);
            System.out.println("Password is correct");
        }
        catch(ErrorHandling e){
            System.out.println(e);
        }
    }
}
