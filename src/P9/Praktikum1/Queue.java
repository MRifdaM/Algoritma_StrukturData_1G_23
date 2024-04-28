package P9.Praktikum1;

public class Queue {
    int[] data;
    int size;
    int front;
    int rear;
    int max;

    public Queue(int n){
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isFull(){
        if (size == max){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        if ( size == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean enqueue(int dt){
        if(isFull()){
            System.out.println("Queue sudah penuh");
            return false;
        } else {
            if(isEmpty()){
                front = rear = 0;
            } else if(rear == max-1){
                rear = 0;
            } else {
                rear++;
            }

            data[rear] = dt;
            size++;
            return true;
        }
    }

    public boolean dequeue(){
        int dt = 0;
        if(isEmpty()){
            System.out.println("Queue masih kosong");
            return false;
        } else {
            dt = data[front];
            size--;
            if(isEmpty()){
                front = rear = -1;
            } else if(front == max-1){
                front = 0;
            } else {
                front++;
            }
            if(dt != 0){
                System.out.println("Data yang dikeluarkan " + dt);
            }
            return true;
        }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            System.out.println("Elemen terdepan: " + data[front]);
        }
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while(i != rear){
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemet: " + size);
        }
    }

    public void clear(){
        if(!isEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
}
