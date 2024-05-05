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
        Node ndInput = new Node(input, head);
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
}
