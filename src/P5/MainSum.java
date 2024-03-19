package P5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("Program menghitung keuntungan total (satuan juta, misal 5.9)");
        System.out.println("=======================================================");
        System.out.print("Masukkan jumlah perusahaan: ");
        int n = sc23.nextInt();
        Sum[] sm = new Sum[n];
        System.out.println("=======================================================");
        
        for (int i = 0; i < sm.length; i++) {
            System.out.println("Perusahaan ke-" + (i+1));
            System.out.print("Masukkan jumlah bulan: ");
            int elm = sc23.nextInt();
            sm[i] = new Sum(elm);
        }

        System.out.println("=======================================================");

        for (int j = 0; j < sm.length; j++) {
            System.out.println("Perusahaan ke-" + (j+1));
            for (int i = 0; i < sm[j].element; i++) {
                System.out.print("Masukkan untung bulan ke-" + (i+1) + " = ");
                sm[j].keuntungan[i] = sc23.nextDouble();
            }
        }

        System.out.println("=======================================================");
        System.out.println("Algoritma Brute Force");
        for (int i = 0; i < sm.length; i++) {
            System.out.println("Total keuntungan perusahaan ke-" + (i+1) +  " selama " + sm[i].element + " bulan adalah " + sm[i].totalBF(sm[i].keuntungan));
        }
        System.out.println("=======================================================");
        System.out.println("Algoritma Divide Conquer");
        for (int i = 0; i < sm.length; i++) {
        System.out.println("Total keuntungan perusahaan ke=" + (i+1) + " selama " + sm[i].element + " bulan adalah " + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].element-1));
        }
        sc23.close();
}
}
