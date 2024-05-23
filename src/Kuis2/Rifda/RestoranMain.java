package Kuis2.Rifda;
import java.util.Scanner;

public class RestoranMain {
    public static void main(String[] args) {
        Scanner rifda1 = new Scanner(System.in);
        Scanner rifda2 = new Scanner(System.in);
        DoubleLinkedlistPembeli23 pembeli23 = new DoubleLinkedlistPembeli23();
        DoubleLinkedlistPesanan23 pesanan23 = new DoubleLinkedlistPesanan23();
        boolean isRun = true;

        System.out.println("============================== QUIZ 2 PRAKTIKUM ASD TI ==============================");
        System.out.println("Dibuat oleh: Muhammad Rifda Musyaffa" );
        System.out.println("NIM: 2341720028 " );
        System.out.println("Absen: 23");
        System.out.println("=====================================================================================");
        System.err.println("Sistem Antrian Resto");

        while(isRun){
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan pengurutun pesnan by nama");
            System.out.println("5. Hitung total pendapatan");
            System.out.println("6. keluar");
            System.out.println("============================================================");
            System.out.print("Opsi: ");
            int opsi23 = rifda1.nextInt();

            switch(opsi23){
                case 1: 
                System.out.println("==============================");
                System.out.println("Masukkan data pembeli");
                System.out.println("==============================");
                System.out.print("Masukkan nama pembeli: ");
                String namaPembeli23 = rifda2.nextLine();
                System.out.print("Masukkan nomor HP pembeli: ");
                String noHP23 = rifda2.nextLine();
                Pembeli23 dtPembeli23 = new Pembeli23(namaPembeli23, noHP23);
                pembeli23.enqueue(dtPembeli23);
                break;

                case 2:
                pembeli23.print();
                break;

                case 3:
                pembeli23.dequeue();
                System.out.println("=========================================");
                System.out.print("Masukkan No Pesanan: ");
                int kdPesanan23 = rifda1.nextInt();
                System.out.print("Masukkan Nama Pesanan: ");
                String namaPesanan23 = rifda2.nextLine();
                System.out.print("Masukkan Harga: ");
                int harga23 = rifda1.nextInt();
                Pesanan23 dtPesanan23 = new Pesanan23(kdPesanan23, namaPesanan23, harga23);
                pesanan23.push(dtPesanan23);
                pesanan23.print();
                break;

                case 4: 
                DoubleLinkedlistPesanan23 sortedPesanan23 = pesanan23.copy();
                sortedPesanan23.sortingASC();
                sortedPesanan23.print();
                sortedPesanan23.sortingDES();
                sortedPesanan23.print();
                break;

                case 5:
                if(pembeli23.head23 == null){
                    pesanan23.totalPendapatan();
                } else {
                    System.out.println("error");
                }
                break;

                case 6:
                isRun = false;
                break;
            }
        }
    }
}
