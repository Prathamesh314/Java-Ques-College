import java.util.Scanner;

public class Future_Plans extends Placement{
    String deg_name,clg_name,comp_exam_name,field,company_name,Sector;
    int score,letter_num,choice,num_of_emp;
    long  turnover;
    Future_Plans(String name, String department, String gender, double cgpa) {
        super(name, department, gender, cgpa);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your Future Plans:- \n");
        System.out.print("Enter 1 for Higher Studies\nEnter 2 for Entrepreneurship\n");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        if(choice == 1){
            field = "Higher Studies";
        }
        else if(choice == 2){
            field = "Entreprenuership";
        }
        else{
            System.out.print("You entered wrong choice\n");
            while(choice >=3){
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                if(choice == 1){
                    field = "Higher Studies";
                    break;
                }
                else if(choice == 2){
                    field = "Entreprenuership";
                    break;
                }
            }
        }

        if(field.equals("Higher Studies")){
            System.out.println("Enter Degree name:- ");
            deg_name = sc.next();
            System.out.println("Enter your college name:- ");
            clg_name = sc.next();
            System.out.println("Enter your letter number:- ");
            letter_num = sc.nextInt();
            System.out.println("Enter name of your competetive exam:- ");
            comp_exam_name = sc.next();
            System.out.println("Enter your score:- ");
            score = sc.nextInt();
        }
        else{
            company_name = "Go_Shopping.com";
            Sector = "Fashion";
            num_of_emp = 10000;
            turnover = 70_827_364;
        }

    }
    void display(){
        if(choice == 1){
            System.out.printf("Degree Name:- %s\nCollege Name:- %s\nAdmission number:- %d\nName of Competetive Exam:- %s\nScore:- %d\n",deg_name,clg_name,letter_num,comp_exam_name,score);
        }
        else{
            System.out.printf("Company Name:- %s\nSector:- %s\nTotal number of employees:- %d\nTurn over:- %f\n",company_name,Sector,num_of_emp,turnover);
        }
    }
}
