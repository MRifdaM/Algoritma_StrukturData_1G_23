package P8;

public class StackKonversi {
    int[] tumpukanBiner;
    int size, top;

    public StackKonversi(){
        size = 32;   
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isFull(){
        if (top == size-1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }

    public void push(int val){
        if (isFull()){
            System.out.println("Gagal! Tumpukan Penuh");
        } else {
            top++;
            tumpukanBiner[top] = val;
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Gagal! Tumpukan Kosong");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
