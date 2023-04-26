public class stack {
    int arr[];
    int size;
    int top;

    stack(int n){
        arr = new int[n];
        size = n;
        top = -1;
    }

    void push(int x){
        if(top==size-1){
            System.out.println("Stack Overflow...");
            return;
        }
        top+=1;
        arr[top] = x;
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack is Empty...");
            return;
        }
        top-=1;
    }

    int peek(){
        if(top==-1){
            System.out.println("Stack is empty...");
            return -1;
        }
        else{
            return arr[top];
        }

    }
}
