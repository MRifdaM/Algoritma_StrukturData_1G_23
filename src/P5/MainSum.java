package P5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("Program menghitung keuntungan total (satuan juta, misal 5.9)");
        System.out.print("Masukkan jumlah bulan: ");
        int elm = sc23.nextInt();
        Sum sm = new Sum(elm);
        System.out.println("=======================================================");
        for (int i = 0; i < sm.element; i++) {
            System.out.print("Masukkan untung bulan ke-" + (i+1) + " = ");
            sm.keuntungan[i] = sc23.nextDouble();
        }

        System.out.println("=======================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sm.element + " bulan adalah " + sm.totalBF(sm.keuntungan));
        System.out.println("=======================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.element + " bulan adalah " + sm.totalDC(sm.keuntungan, 0, sm.element-1));
        sc23.close();
}
}
