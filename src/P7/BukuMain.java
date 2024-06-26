package P7;
import java.util.Scanner;

public class BukuMain {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        Scanner sc23_2 = new Scanner(System.in);

        PencarianBuku data = new PencarianBuku();
        int jmlBuku = 5;

        System.out.println("=================================================");
        System.out.println("Masukkan data buku secara urut dari kode buku terkecil : ");
        for (int i = 0; i < jmlBuku; i++) {
            System.out.println("=====================================");
            System.out.print("Kode buku \t: ");
            int kodeBuku = sc23.nextInt();
            System.out.print("Judul buku \t: ");
            String judul = sc23_2.nextLine();
            System.out.print("Tahun terbit \t: ");
            int tahunTerbit = sc23.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = sc23_2.nextLine();
            System.out.print("Stok \t\t: ");
            int stok = sc23.nextInt();

            Buku m = new Buku(kodeBuku, judul, tahunTerbit, pengarang, stok);
            data.tambah(m);
        }

        System.out.println("=================================================");
        System.out.println("Data kesuluruhan buku : ");
        data.tampil();

        System.out.println("=================================================");
        System.out.println("=================================================");
        System.out.println("Pencarian data : ");
        System.out.println("Masukan kode buku yang dicari : ");
        System.out.print("Kode buku : ");
        int cari = sc23.nextInt();
        System.out.println("Menggunakan sequential search ");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        System.out.println("=================================================");
        Buku dataBuku = data.findBuku(cari);
        dataBuku.tampilDataBuku();

        System.out.println("=================================================");
        System.out.println("Menggunakan binary search ascending");
        posisi = data.findBinarySearchAsc(cari, 0, jmlBuku-1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        System.out.println("=================================================");
        System.out.println("Menggunakan binary search descending");
        posisi = data.findBinarySearchDes(cari, 0, jmlBuku-1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
        sc23.close();
        sc23_2.close();
    }
}
