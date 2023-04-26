public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        stack st = new stack(10);
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.printf("Top element :- %d\n",st.peek());
        st.pop();
        st.pop();
        st.pop();
        System.out.printf("Top element :- %d\n",st.peek());

    }
}