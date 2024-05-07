package P10.Tugas.Tugas2;
import java.util.Scanner;

public class MainQSLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QSingleLinkedlist sll = new QSingleLinkedlist();
        boolean isRun = true;

        while(isRun){
            System.out.println("Masukkan operasi yang diinginkan: ");
            System.out.println("1. Antrian Baru");
            System.out.println("2. Antrian Keluar");
            System.out.println("3. Cek Antrian Terdepan");
            System.out.println("4. Cek Semua Antrian");
            System.out.println("5. Cek Antrian Paling Belakang");
            System.out.println("6. Cek Antrian Tertentu");
            System.out.println("7. Keluar");
            System.out.println("-------------------------------------------");
            int menu = sc.nextInt();

            switch(menu){
                case 1: 
                System.out.print("Masukkan NIM : ");
                int nim = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan Nama : ");
                String nama = sc.nextLine();
                Mahasiswa mhs = new Mahasiswa(nim, nama);
                sll.enqueue(mhs);
                break;

                case 2:
                sll.dequeue();
                break;

                case 3:
                sll.peek();
                break;

                case 4:
                sll.print();
                break;

                case 5:
                sll.peekLast();
                break;

                case 6:
                System.out.print("Masukkan indeks : ");
                int index = sc.nextInt();
                sll.peekAt(index);
                break;

                case 7:
                isRun = false;
                break;

                default:
                System.out.println("Input tidak valid");
                break;
            }
        }
        sc.close();
    }
}
