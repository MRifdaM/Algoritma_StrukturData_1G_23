package P10.Tugas.Tugas2;

public class QSingleLinkedlist {
    Node front, rear;
    public QSingleLinkedlist(){
        front = rear = null;
    }

    public boolean isEmpty(){
        if(front == null ){
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(Mahasiswa input){
        Node newNode = new Node(input);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = rear.next;
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Antrian masih kosong");
        } else {
            front = front.next;
        }
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Antrian masih kosong");
        } else {
            Node temp = front;
            while(temp != rear){
                System.out.println("NIM : " + temp.data.nim);
                System.out.println("Nama : " + temp.data.nama);
                temp = temp.next;
            }
            System.out.println("NIM : " + temp.data.nim);
            System.out.println("Nama : " + temp.data.nama);
        }
    }

    public void peek(){
        if (isEmpty()){
            System.out.println("Antrian masih kosong");
        } else {
        System.out.println("NIM : " + front.data.nim);
        System.out.println("Nama : " + front.data.nama);
        }
    }

    public void peekLast(){
        if(isEmpty()){
            System.out.println("Antrian masih kosong");
        } else {
        System.out.println("NIM : " + rear.data.nim);
        System.out.println("Nama : " + rear.data.nama);
        }
    }

    public void peekAt(int index){
        if(isEmpty()){
            System.out.println("Antrian masih kosong");
        } else {
            Node temp = front;
            boolean indexs = false;
            for(int i = 0; i < index; i++){
                if(temp.next == null){
                    System.out.println("Index melebih panjang linkedlist");
                    indexs = true;
                    break;
                }
                if(!indexs){
                    temp = temp.next;
                }
            }
            if(!indexs){
                System.out.println("NIM : " + temp.data.nim);
                System.out.println("Nama : " + temp.data.nama);
            }
        }
    }

    
}
