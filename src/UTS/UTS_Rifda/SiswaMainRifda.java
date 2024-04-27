package UTS.UTS_Rifda;
import java.util.Scanner;

public class SiswaMainRifda {
    public static void main(String[] args) {
        Scanner scRifda = new Scanner(System.in);
        Scanner scRifda2 = new Scanner(System.in);
        SiswaRifda[] siswaRifda = new SiswaRifda[6];
        boolean sortingRifda = false;
        DaftarSiswaRifda daftarSiswaRifda = new DaftarSiswaRifda();

        while(true){
            System.out.println("\nMenu");
            System.out.println("1. Masukkan data siswa");
            System.out.println("2. Tampilkan data siswa");
            System.out.println("3. Nama siswa yang dicari");
            System.out.println("4. Tampilkan daftar siswa berdasrkan tahun masuk");
            System.out.println("5. Keluar");
            System.out.print("Pilih Operasi : ");
            int menuRifda = scRifda2.nextInt();

            switch(menuRifda){
                case 1:
                for (int iRifda = 0; iRifda < siswaRifda.length; iRifda++) {
                    System.out.print("Masukkan NISN siswa ke- " + (iRifda+1) + ": ");
                    String nisnRifda = scRifda.nextLine();
                    System.out.print("Masukkan Nama siswa ke- " + (iRifda+1) + ": ");
                    String namaRifda = scRifda.nextLine();
                    System.out.print("Masukkan Alamat siswa ke- " + (iRifda+1) + ": ");
                    String alamatRifda = scRifda.nextLine();
                    System.out.print("Masukkan Tahun siswa ke- " + (iRifda+1) + ": ");
                    int tahunRifda = scRifda2.nextInt();
                    System.out.print("Masukkan Nilai siswa ke- " + (iRifda+1) + ": ");
                    double nilaiRifda = scRifda2.nextInt();
                    siswaRifda[iRifda] = new SiswaRifda(nisnRifda, namaRifda, alamatRifda, tahunRifda, nilaiRifda);
                    System.out.println();
                }
                break;

                case 2: 
                for(int i = 0; i < siswaRifda.length; i++){
                    siswaRifda[i].tampilkanDataSiswa();
                    System.out.println();
                }
                break;

                case 3:
                if(sortingRifda){
                    PencarianSiswaRifda pencarianSiswaRifda = new PencarianSiswaRifda();
                    for(int iRifda = 0; iRifda < siswaRifda.length; iRifda++){
                        pencarianSiswaRifda.tambah(daftarSiswaRifda.daftarSiswaRifda[iRifda]);
                    }
                    System.out.print("Masukkan nama siswa yang ingin dicari: ");
                    String cariNamaRifda = scRifda.nextLine();
                    pencarianSiswaRifda.mencariSiswa(cariNamaRifda);
                } else {
                    System.out.println("Sorting data mahasiswa terlebih dahulu");
                }
                break;

                case 4:
                for(int iRifda = 0; iRifda < siswaRifda.length; iRifda++){
                    daftarSiswaRifda.tambah(siswaRifda[iRifda]);
                }
                daftarSiswaRifda.insertionSort();
                sortingRifda = true;
                break;

                case 5:
                scRifda.close();
                scRifda2.close();
                break;

                default: 
                System.out.println("Pilihan tidak valid, silahkan coba lagi");
            }
        }


        
    }
    
}
