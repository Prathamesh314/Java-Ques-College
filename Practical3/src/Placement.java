import java.util.Scanner;

public class Placement extends Student {
    String industry_name;
    double annual_package;
    int letter_number;
    Scanner sc = new Scanner(System.in);
    Placement(String name, String department, String gender, double cgpa) {
        super(name, department, gender, cgpa);
        System.out.print("Enter your industry name:- ");
        industry_name = sc.nextLine();
        System.out.print("Enter annual package:- ");
        annual_package = sc.nextDouble();
        System.out.print("Enter your letter number:- ");
        letter_number = sc.nextInt();
    }


    void display(){
        System.out.printf("Industry Name:- %s",industry_name);
        System.out.printf("Annual Package:- %d",annual_package);
        System.out.printf("Letter Number:- %d",letter_number);
    }


}
