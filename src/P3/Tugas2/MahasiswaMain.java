package P3.Tugas2;
import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        int n = 3;
        double[] daftarIPK = new double[n];

        Mahasiswa[] mahasiswa = new Mahasiswa[n];

        for (int i = 0, j = i; i < 3; i++) {
            System.out.println("Masukkan data mahasiwa ke-" + ++j + " : ");
            System.out.print("Masukkan nama: ");
            String nama = sc23.next();
            System.out.print("Masukkan NIM: ");
            long nim = sc23.nextLong();
            System.out.print("Masukkan jenis kelamin: ");
            String kelamin = sc23.next();
            System.out.print("Masukkan IPK: ");
            double ipk = sc23.nextDouble();
            daftarIPK[i] = ipk;
            mahasiswa[i] = new Mahasiswa(nama, nim, kelamin, ipk);
        }

        System.out.println();
        for (int i = 0, j = i; i < 3; i++) {
            System.out.println("Data mahasiswa ke-" + ++j + " : ");
            System.out.println("Nama: " + mahasiswa[i].nama);
            System.out.println("NIM: " + mahasiswa[i].nim);
            System.out.println("Jenis Kelamin: " + mahasiswa[i].kelamin);
            System.out.println("IPK: " + mahasiswa[i].ipk);
        }

        double rataRataIPK = Mahasiswa.rataIPK(n, daftarIPK);
        System.out.println();
        System.out.printf("%-10s %.2f", "Rata-rata IPK mahasiswa : ", rataRataIPK);
        System.out.println();
        Mahasiswa.IPKTerbesar(daftarIPK, n, mahasiswa);
        sc23.close();
    }
}
