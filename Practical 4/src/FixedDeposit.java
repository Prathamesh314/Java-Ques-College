public class FixedDeposit extends BankAcc
{
    int lokinPeriod;
    static int Acc_no = 55001;

    FixedDeposit(int lokinPeriod){
        super.acc_no = Acc_no;
        this.lokinPeriod = lokinPeriod;
        Acc_no+=1;
    }
    void updateInterest(){
        if(lokinPeriod >=1 && lokinPeriod <=2){
            super.roi = 6;
            balance = (1+roi/100)*balance;
        }
        else if(lokinPeriod >=3 && lokinPeriod<=5){
            super.roi = 6.5;
            balance = (1+roi/100)*balance;
        }
        else{
            super.roi = 7;
            balance = (1+roi/100)*balance;
        }
    }

}
