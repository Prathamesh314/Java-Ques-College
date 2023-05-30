package Que5;

public class UserException extends Exception {
    int type;
    UserException(int a){
        type = a;
    }

    @Override
    public String toString() {
        if(type == 1) return "Invalid State";
        else if(type == 2) return "Hyphen is missing";
        else if(type == 3) return "Upper cases are missing is vehicle registration number";
        else if(type == 4) return "Number is not of appropriate length";
        return "";
    }
}
