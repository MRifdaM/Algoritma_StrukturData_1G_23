package P10.Tugas.Tugas1;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList sLL = new SingleLinkedList();
        sLL.print();
        Mahasiswa mhs2 = new Mahasiswa(112, "Prita");
        sLL.addFirst(mhs2);
        sLL.print();
        Mahasiswa mhs3 = new Mahasiswa(113, "Yusuf");
        sLL.insertAfter(112, mhs3);
        sLL.print();
        Mahasiswa mhs4 = new Mahasiswa(114, "Doni");
        sLL.insertAt(2 ,mhs4);
        sLL.print();
        Mahasiswa mhs1 = new Mahasiswa(111, "Anton");
        sLL.addFirst(mhs1);
        sLL.print();
        Mahasiswa mhs5 = new Mahasiswa(115, "Sari");
        sLL.addLast(mhs5);
        sLL.print();


    }
}
