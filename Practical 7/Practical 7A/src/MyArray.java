public class MyArray<T> {
    private T[] array;
    private int size = -1;
    private int capacity;
    int isgrown = 0;

    public MyArray(int capacity) {
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public void add(T element) {
        if(this.isgrown == 0){
            if (this.size == this.capacity) {
                System.out.println("Reallocating Size");
                grow();
            }
        }
        else if(this.isgrown == 1 && this.size == this.capacity && this.size != -1){
            System.out.println("Array is full");
            return;
        }
        array[this.size] = element;
        this.size++;

    }

    private void grow() {
        capacity = (int) (capacity * 1.5);
        this.isgrown = 1;
        T[] newArray = (T[]) new Object[capacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public void swap(int index1, int index2) {
        if (index1 < 0 || index1 >= size || index2 < 0 || index2 >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public void display(){
        for(T a:array){
            if (a!=null) System.out.println(a);
        }
    }
}
