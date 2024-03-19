package P5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        System.out.println("================");
        System.out.print("Masukkan Jumlah Element Yang Ingin Dihitung: ");
        int element = sc23.nextInt();

        Pangkat[] png = new Pangkat[element];
        for (int i = 0; i < png.length; i++) {
            System.out.print("Masukkan nilai yang ingin dipangkatkan: ");
            int nilai = sc23.nextInt();
            System.out.print("Masukkan nilai pemangkat: ");
            int pangkat = sc23.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }

        System.out.println("HASIL  PANGKAT- BRUTE FORCE");
        for (int i = 0; i < png.length; i++){
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }

        System.out.println("HASIL PANGKAT - DIVIDE CONQUER");
        for (int i = 0; i < png.length;i++){
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
        sc23.close();
    }
}
