package P3.Tugas2;
import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);

        Mahasiswa[] mahasiswa = new Mahasiswa[3];

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
        sc23.close();
    }
}
