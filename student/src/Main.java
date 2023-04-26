public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int arr1[] = {50,60,70};
        int arr2[] = {80,60,90};
        int arr3[] = {100,60,60};
        Student sarr[] = new Student[3];
        sarr[0] = new Student("Abhinav",arr1);
        sarr[1] = new Student("Ashutosh",arr2);
        sarr[2] = new Student("Poushik",arr3);

        System.out.println("Details of Students before Sorting");
        sarr[0].display();
        sarr[0].display_students(sarr);
        System.out.println("Details of Students after Sorting");
        sarr[0].sort(sarr);
        sarr[0].display_students(sarr);

    }
}