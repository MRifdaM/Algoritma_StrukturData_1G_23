package P1;
import java.util.Scanner;

import javax.sound.midi.SysexMessage; 

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        double nilaiAkhir;
        String nilaiHuruf;

        System.out.println("Program Menghitung Nilai Akhir" + "\n======================");
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc23.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis = sc23.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        nilaiUTS = sc23.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        nilaiUAS = sc23.nextInt();

        if ( (nilaiTugas >= 0 && nilaiTugas <= 100) && (nilaiKuis >= 0 && nilaiKuis <= 100) && (nilaiUTS >= 0 && nilaiUTS <= 100) && (nilaiUAS >= 0 && nilaiUAS <= 100)) {
            nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3);
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            System.out.println("======================\n" + "======================\n" + "Nilai Akhir : " + nilaiAkhir + "\nNilai Huruf : " + nilaiHuruf + "\n======================\n" + "======================");
            if (nilaiAkhir > 50) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("TIDAK LULUS");
            }
        } else {
            System.out.println("======================\n" +  "======================\n" + "nilai tidak valid\n" + "======================\n" + "======================");
        }

    }
}