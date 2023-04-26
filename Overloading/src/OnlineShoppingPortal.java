public class OnlineShoppingPortal {
    double checkout(double amount,String promocode){
        if(amount < 500){
            amount -= 10;
        }
        else {
            amount = 0.9 * amount;
        }
        return amount;
    }
    double checkout (double amount){
        if(amount > 1000){
            amount = 0.7*amount;
        }
        else{
            amount = 0.8*amount;
        }
        return amount;
    }
}

