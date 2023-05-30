package DemoPackageQUe4;
import Que4.Arithmetic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\kurve\\IdeaProjects\\OOP_Assignment\\src\\DemoPackageQUe4\\input.txt");
        Scanner sc = new Scanner(file);
        Arithmetic a = new Arithmetic();
        double b,c;
        b = Double.parseDouble(sc.next());
        c = Double.parseDouble(sc.next());
        System.out.printf("4 + 5 = %f\n",a.add(b,c));
        System.out.printf("4 - 5 = %f",a.substract(b,c));
    }
}
