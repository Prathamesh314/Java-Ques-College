import java.lang.reflect.AccessibleObject;

public class SavinAcc extends BankAcc
{
    static int Acc_no = 11001;
    SavinAcc(){
        super.acc_no = Acc_no;
        super.roi = 4;
        Acc_no = Acc_no+1;
    }

}
