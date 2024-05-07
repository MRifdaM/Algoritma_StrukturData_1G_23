package P10.Tugas.Tugas1;

public class SingleLinkedList {
    Node head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print(){
        if(!isEmpty()){
            Node temp = head;
            System.out.println("Isi linkedlist: ");
            while (temp != null) {
                System.out.println( "NIM : "+ temp.data.nim);
                System.out.println( "Nama : "+ temp.data.nama);
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedList Kosong");
        }
    }

    public void addFirst(Mahasiswa input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = tail.next;
        }
    }

    public void insertAfter(int key, Mahasiswa input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do{
            if(temp.data.nim == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null){
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa input){
        if(index < 0){
            System.out.println("Invalid index");
        } else if (index == 0){
            addFirst(input);
        } else {
            Node temp = head;
            for(int i = 0; i < index-1; i++){
                temp = temp.next;
            }
        
            Node temp2 = head;
            int curr = 0;
            while(temp2.next != null){
                curr++;
                temp2 = temp2.next;
            }
            
            if(index <= curr+1){
                temp.next = new Node(input, temp.next);
    
                if(temp.next.next == null){
                    tail = temp.next;
                }
            } else {
                System.out.println("Index Melebihi Panjang LinkedList");
            }
        }
    }

    
}
