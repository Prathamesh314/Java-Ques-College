package Que6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static String[] arr = {"USA","China","Australia","Africa","Russia","Africa","France","Pakistan","Afganistan","England"};
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\kurve\\IdeaProjects\\OOP_Assignment\\src\\Que6\\input.txt");
        Scanner sc = new Scanner(file);
        String name = sc.nextLine();
        System.out.println("TimeZone in "+name);
        ConvertTimeZone cvt = new ConvertTimeZone(name);
        Time t = new Time();
        t = cvt.convert();
        t.display();
    }
}
