package Kuis2.Rifda;

public class DoubleLinkedlistPembeli23 {
    NodePembeli23 head23, tail23;
    int size23;

    public boolean isEmpty(){
        return head23 == null;
    }
    public void enqueue(Pembeli23 input23){
        if(isEmpty()){
            NodePembeli23 newNode23 = new NodePembeli23(null, input23, null);
            head23 = newNode23;
            tail23 = newNode23;
        } else {
            NodePembeli23 newNode23 = new NodePembeli23(tail23, input23, null);
            tail23.next23 = newNode23;
            tail23 = tail23.next23;
        }
        size23++;
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Antrian masih kosong");
        } else if(head23 == tail23){
            NodePembeli23 temp23 = head23;
            System.out.println(temp23.dataPembeli23.nama23 + " telah memesan menu");
            head23 = null;
            tail23= null;
        } 
        else {
            NodePembeli23 temp23 = head23;
            System.out.println(temp23.dataPembeli23.nama23 + " telah memesan menu");
            head23 = head23.next23;
            head23.prev23 = null;
            size23--;
        }
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Antrian masih kosong");
        } else {
            NodePembeli23 temp23 = head23;
            int number23 = 1;
            System.out.println("====================================");
            System.err.println("Daftar Antrian Restoran");
            System.out.println("====================================");
            System.out.println("No\t Nama Pembeli\t\t Nomer HP");
            while(temp23 != null){
                System.out.println(number23 + "\t " + temp23.dataPembeli23.nama23 + "\t\t\t " + temp23.dataPembeli23.noHP23);
                temp23 = temp23.next23;
                number23++;
            }
            System.out.println("Total antrian: " + number23);
        }
    }
}
