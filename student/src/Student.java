public class Student {
    String name;
    int marks[];
    int total;

    Student(String name,int arr[]){
        this.name = name;
        int s=0;
        marks = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            marks[i]=arr[i];
            s+=arr[i];
        }
        total = s;
    }

    void sort(Student sarr[]){
        for(int i=0;i< sarr.length-1;i++){
            for(int j=0;j<sarr.length-i-1;j++){
                if(sarr[j].total > sarr[j+1].total){
                    Student temp = sarr[j+1];
                    sarr[j+1] = sarr[j];
                    sarr[j] = temp;
                }
            }
        }
    }

    void display(){
        System.out.printf("Name: %s\n",name);
        System.out.println("Marks of Student... ");
        for(int i=0;i< marks.length;i++){
            System.out.printf("Makrs in subject %d: %d\n",i+1,marks[i]);
        }
        System.out.printf("Total Marks of Student: %d\n",total);
    }

    void display_students(Student arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.printf("******** Marks of Student %d *********\n",i+1);
            arr[i].display();
        }
    }

}
