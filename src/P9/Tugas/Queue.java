package P9.Tugas;

public class Queue {
    Pembeli[] antrian;
    int front;
    int rear;
    int size;

    int max;

    public Queue(int n){
        max = n;
        antrian = new Pembeli[max];
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

    public void enqueue(Pembeli dt){
        if(isFull()){
            System.out.println("Queue sudah penuh");
        } else {
            if(isEmpty()){
                front = rear = 0;
            } else if(rear == max-1){
                rear = 0;
            } else {
                rear++;
            }

            antrian[rear] = dt;
            size++;
        }
    }

    public Pembeli dequeue(){
        Pembeli dt = new Pembeli();
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            dt = antrian[front];
            size--;
            if(isEmpty()){
                front = rear = -1;
            } else if(front == max-1){
                front = 0;
            } else {
                front++;
            }
        }
        return dt;
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            System.out.println("Elemen terdepan: " + antrian[front].nama + " " + antrian[front].noHP);
        }
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while(i != rear){
                System.out.println(antrian[i].nama + " " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHP);
            System.out.println("Jumlah element: " + size);
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

    public void peekRear(){
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            System.out.println("Elemen paling belakang: " + antrian[rear].nama + " " + antrian[rear].noHP);
        }
    }

    public void peekPosition(String nama){
        int position = -1;
        for(int i = 0; i < antrian.length; i++){
            if (antrian[i].nama.equalsIgnoreCase(nama)) {
                position = i;
                break;
            }
        }
        if (position != -1){
            System.out.println("Elemen dicari: " + antrian[position].nama + " " + antrian[position].noHP);
        } else {
            System.out.println("Nama pembeli tidak ada dalam antrian");
        }
    }

    public void daftarPembeli(){
        for(int i = 0; i < antrian.length; i++){
            System.out.println("Nama Pembeli: " + antrian[i].nama);
            System.out.println("No HP Pembeli: " + antrian[i].noHP);
            System.out.println();
        }
    }
}
