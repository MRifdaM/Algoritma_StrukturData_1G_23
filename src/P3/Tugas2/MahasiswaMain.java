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

        double rataRataIPK = rataRataIPK(n, daftarIPK);
        System.out.println();
        System.out.printf("%-10s %-2.2f", "Rata-rata IPK mahasiswa : ", rataRataIPK);
        System.out.println();
        IPKTerbesar(mahasiswa);
        sc23.close();
    }

    public static double rataRataIPK(int jumlah, double[] IPK) {
        double[] dataIPK = new double[jumlah];
        for (int i = 0; i < jumlah; i++) {
            dataIPK[i] = IPK[i];
        }
        double rataIPK = (dataIPK[0] + dataIPK[1] + dataIPK[2]) / jumlah;
        return rataIPK;
    }

    public static void IPKTerbesar(Mahasiswa[] mahasiswa) {
        if (mahasiswa[0].ipk > mahasiswa[1].ipk && mahasiswa[0].ipk > mahasiswa[2].ipk){
            System.out.println("Mahasiswa: " + mahasiswa[0].nama + ", IPK: " + mahasiswa[0].ipk);
        } else if (mahasiswa[1].ipk > mahasiswa[0].ipk && mahasiswa[1].ipk > mahasiswa[2].ipk) {
            System.out.println("Mahasiswa: " + mahasiswa[1].nama + ", IPK: " + mahasiswa[1].ipk);
        }else if (mahasiswa[2].ipk > mahasiswa[0].ipk && mahasiswa[2].ipk > mahasiswa[1].ipk) {
            System.out.println("Mahasiswa: " + mahasiswa[2].nama + ", IPK: " + mahasiswa[2].ipk);
        }
    }
}
