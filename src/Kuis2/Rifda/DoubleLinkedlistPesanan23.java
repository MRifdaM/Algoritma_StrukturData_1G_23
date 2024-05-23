package Kuis2.Rifda;

public class DoubleLinkedlistPesanan23 {
    NodePesanan23 head23, tail23;

    public boolean isEmpty(){
        return head23 == null;
    }

    public void push(Pesanan23 input23){
        if(isEmpty()){
            NodePesanan23 newNode23 = new NodePesanan23(null, input23, null);
            head23 = newNode23;
            tail23 = newNode23;
        } else {
            NodePesanan23 newNode23 = new NodePesanan23(tail23, input23, null);
            tail23.next23 = newNode23;
            tail23 = tail23.next23;
        }
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Pesanan masih kosong");
        } else {
            System.out.println("====================================");
            System.err.println("Daftar Pesanan Restoran");
            System.out.println("====================================");
            NodePesanan23 temp23  =  head23; 
            System.out.println("No\t Nama Pesanan\t\t\t Harga");
            while(temp23 != null){
                System.out.println(temp23.dataPesanan23.kodePesanan23 + "\t " + temp23.dataPesanan23.namaPesanan23 + "\t\t\t\t " + temp23.dataPesanan23.harga23);
                temp23 = temp23.next23;
            }
            System.out.println("Pesanan berhasil dicetak");
        }
    }

    public void totalPendapatan(){
        NodePesanan23 temp23 = head23;
        int total = 0;
        while(temp23 != null){
            total += temp23.dataPesanan23.harga23;
            temp23 = temp23.next23;
        }
        System.out.println("====================================");
        System.err.println("Total Pendapatan");
        System.out.println("====================================");
        System.out.println("Total pendapatan hari ini: " + total);
    }

    public DoubleLinkedlistPesanan23 copy(){
        DoubleLinkedlistPesanan23 copydll = new DoubleLinkedlistPesanan23();
        NodePesanan23 temp23 = head23;
        while (temp23 != null){
            copydll.push(temp23.dataPesanan23);
            temp23 = temp23.next23;
        }
        return copydll;
    }

    public void sortingASC(){
        if (head23 == null){
            return;
        }
        boolean isSwap;
        do {
            NodePesanan23 current23 = head23;
            isSwap = false;
            while(current23.next23!= null){
                if(current23.dataPesanan23.namaPesanan23.compareToIgnoreCase(current23.next23.dataPesanan23.namaPesanan23) > 0){
                    Pesanan23 temp23 = current23.next23.dataPesanan23;
                    current23.next23.dataPesanan23 = current23.dataPesanan23;
                    current23.dataPesanan23 = temp23;
                    isSwap = true;
                }
                current23 = current23.next23;
            }
        } while(isSwap);
    }

    public void sortingDES(){
        if (head23 == null){
            return;
        }
        boolean isSwap;
        do {
            NodePesanan23 current23 = head23;
            isSwap = false;
            while(current23.next23!= null){
                if(current23.dataPesanan23.namaPesanan23.compareToIgnoreCase(current23.next23.dataPesanan23.namaPesanan23) < 0){
                    Pesanan23 temp23 = current23.next23.dataPesanan23;
                    current23.next23.dataPesanan23 = current23.dataPesanan23;
                    current23.dataPesanan23 = temp23;
                    isSwap = true;
                }
                current23 = current23.next23;
            }
        } while(isSwap);
    }
}
