public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        FixedDeposit fd = new FixedDeposit(3);
        SavinAcc sa = new SavinAcc();
        fd.openAccount("Prathamesh",125632121254L,1000);
        sa.openAccount("Ayush",123565213578L,5000);
        System.out.println("Account Number of saving account "+sa.acc_no);
        System.out.println("Account Number of FD account "+fd.acc_no);
        SavinAcc sa1 = new SavinAcc();
        sa1.openAccount("AAh",123565213578L,5000);
        System.out.println("Account Number of saving account "+sa1.acc_no);
//        sa.closeAcc();
        sa.withdraw(4000);
        System.out.println(sa.balance);
        sa.withdraw(2000);
        sa.updateInterest();
        System.out.print(sa.balance);
        fd.updateInterest();
        System.out.print(fd.balance);


    }
}