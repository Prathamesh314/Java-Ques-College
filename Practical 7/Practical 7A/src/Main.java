import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        MyArray<Integer> myArray = new MyArray<>(5);
        myArray.add(1);
        myArray.add(1);
        myArray.add(1);
        myArray.add(1);
        myArray.add(1);
        myArray.display();
        myArray.add(2);
    }
}