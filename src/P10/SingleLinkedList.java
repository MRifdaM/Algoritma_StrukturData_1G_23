package P10;

public class SingleLinkedList {
    Node head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print(){
        if(!isEmpty()){
            Node temp = head;
            System.out.print("Isi linkedlist: ");
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedList Kosong");
        }
    }

    public void addFirst(int input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(int input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = tail.next;
        }
    }

    public void insertAfter(int key, int input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do{
            if(temp.data == key){
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

    public void insertAt(int index, int input){
        if(index < 0){
            System.out.println("Invalid index");
        } else if (index == 0){
            addFirst(input);
        } else {
            Node temp = head;
            for(int i = 0; i < index-1; i++){
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if(temp.next.next == null){
                tail = temp.next;
            }
        }
    }

    public int getData(int index){
        Node temp = head;
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        return temp.next.data;
    }

    public int indexOf(int key){
        Node temp = head;
        int index = 0;
        while(temp != null && temp.data != key){
            temp = temp.next;
            index++;
        }
        if(temp != null){
            return index;
        } else {
            return -1;
        }
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linkedlist masih kosong, tidak dapat dihapus");
        } else if(head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linkedlist masih kosong, tidak dapat dihapus");
        } else if(head == tail){
            head = tail = null;
        } else {
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(int key){
        if(isEmpty()){
            System.out.println("Linkedlist masih kosong, tidak dapat dihapus");
        } else {
            Node temp = head;
            while(temp != null){
                if(temp.data == key && temp == head){
                    removeFirst();
                    break;
                } else if(temp.next.data == key){
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index){
        if(isEmpty()){
            System.out.println("Linkedlist masih kosong, tidak dapat dohapus");
        } else if(index == 0){
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
                tail = temp;
            }
        }
    }
}
