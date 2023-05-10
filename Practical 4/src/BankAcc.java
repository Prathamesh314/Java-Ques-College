public class BankAcc implements Debitable {
    public int acc_no;
    long adhar_no;
    String name;
    double roi,balance;

    void openAccount(String name,long adhar_no,double amount){
        this.name = name;
        this.adhar_no = adhar_no;
        balance = amount;
    }

    void deposit(double amount){
        balance += amount;
    }

    double closeAcc(){
        name = null;
        adhar_no = 0;
        acc_no = 0;
        double bal = balance;
        balance = 0;
        System.out.println("Your account has been closed");
        return bal;
    }

    void updateInterest(){
        balance = (1+roi/100)*balance;
        System.out.println("Your balance is updated");
    }

    public void withdraw(int amount){
        if(balance < amount){
            System.out.println("Insufficient Balance...Cannot withdraw");
            return;
        }
        balance -= amount;
    }
}
