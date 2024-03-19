package P5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        System.out.println("================");
        System.out.print("Masukkan Jumlah Element: ");
        int iJml = sc23.nextInt();

        Faktorial[] fk = new Faktorial[iJml];
        for (int i = 0; i < iJml; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i+1) + " :");
            int iNilai = sc23.nextInt();
            fk[i].nilai = iNilai;
        }

        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++){
            System.out.println("Hasil perhitungan faktorial menggunakan brute force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("HASIL - DIVIDE CONQUER");
        for (int i = 0; i < iJml;i++){
            System.out.println("Hasil perhitungan faktorial menggunakan brute force adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
        sc23.close();
}
}
