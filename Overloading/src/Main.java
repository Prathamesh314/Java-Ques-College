// We were taught about function overloading
// Function overloading is a concept in which we write same function name in class and just varry it's parameters

public class Main {
    public static void main(String[] args) {
        OnlineShoppingPortal regular = new OnlineShoppingPortal();
        OnlineShoppingPortal premium = new OnlineShoppingPortal();
        System.out.printf("Regular : %f\n", regular.checkout(500, "prat99"));
        System.out.printf("Premium : %f\n", premium.checkout(2000));
        System.out.printf("Amount of regular customer : %f\n", regular.checkout(630, "Prat99"));
        System.out.printf("Amount of premium customer : %f\n", regular.checkout(2000));
    }

}
