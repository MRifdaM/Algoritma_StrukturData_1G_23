package P8;

import java.util.Scanner;

public class Utama23 {
    public static void main(String[] args) {
        Gudang23 gudang = new Gudang23(7);
        Scanner sc23 = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih Operasi : ");
            int menu = sc23.nextInt();

            switch(menu){
                case 1: 
                System.out.print("Masukkan kode barang : ");
                int kode = sc23.nextInt();
                sc23.nextLine();
                System.out.print("Masukkan nama barang : ");
                String nama = sc23.nextLine();
                System.out.print("Masukkan kategori barang : ");
                String kategori = sc23.nextLine();
                Barang23 barangBaru = new Barang23(kode, nama, kategori);
                gudang.tambahBarang(barangBaru);
                break;

                case 2: 
                gudang.ambilBarang();
                break;

                case 3:
                gudang.tampilkaBarang();
                break;

                case 4:
                sc23.close();
                break;

                default:
                System.out.println("Pilihan tidak valid, silahkan coba lagi");
            }
        }
        
    }
}
