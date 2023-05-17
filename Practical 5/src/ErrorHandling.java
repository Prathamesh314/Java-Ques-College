public class ErrorHandling extends Throwable {
    int type;
    ErrorHandling(int a){
        type = a;
    }

    @Override
    public String toString() {
        if(type == 1){
            return "Minimum 8 characters are required";
        }
        else if(type==2){
            return "Upper case letters are missing";
        }
        else if(type == 3){
            return "Lower case letters are missing";
        }
        else if(type == 4){
            return "Symbols are missing";
        }
        else if(type == 5){
            return "Invalid Branch";
        }
        else if(type == 6){
            return "Invalid year";
        }
        else if(type == 7){
            return "Invalid roll no";
        }
        else if(type==8){
            return "Wrong Degree";
        }
        else if(type==9){
            return "Numbers are missing";
        }
        else if(type == 10){
            return "Invalid CGPA";
        }
        return "";
    }
}
