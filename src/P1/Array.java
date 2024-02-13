package P1;
import java.util.Scanner;


public class Array {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        double[][] MK_BobotN = new double[2][8];
        String []nilaiHuruf = new String[8];
        int []SKS = {2, 2, 2, 3, 2,2, 3, 2};
        String []MK = {"Pancasila", "KTI", "CTPS", "MatDas", "B Inggris", "Daspro", "PrakDaspro", "K3"};
        int totSKS = 0;
        double IPS= 0.0, totBobotN = 0.0;

        System.out.println("=================\n" + "Hitung Nilai IPS\n" + "===================");

        for (int i = 0; i < MK_BobotN[0].length; i++) {
            switch (i) {
                case 0 :
                System.out.print("Masukkan nilai MK Pancasila : ");
                MK_BobotN[0][i] = sc23.nextDouble();
                break;

                case 1 :
                System.out.print("Masukkan nilai MK KTI : ");
                MK_BobotN[0][i] = sc23.nextDouble();
                break;

                case 2 :
                System.out.print("Masukkan nilai MK CTPS : ");
                MK_BobotN[0][i] = sc23.nextDouble();
                break;

                case 3 :
                System.out.print("Masukkan nilai MK MatDas : ");
                MK_BobotN[0][i] = sc23.nextDouble();
                break;

                case 4 :
                System.out.print("Masukkan nilai MK B Inggris : ");
                MK_BobotN[0][i] = sc23.nextDouble();
                break;

                case 5 :
                System.out.print("Masukkan nilai MK Daspro : ");
                MK_BobotN[0][i] = sc23.nextDouble();
                break;

                case 6 :
                System.out.print("Masukkan nilai MK PrakDaspro : ");
                MK_BobotN[0][i] = sc23.nextDouble();
                break;

                case 7 :
                System.out.print("Masukkan nilai MK K3 : ");
                MK_BobotN[0][i] = sc23.nextDouble();
                break;
            }
        }
        System.out.println("======================\n" +  "======================\n" + "Hasil Konversi\n" + "======================\n" + "======================");

        for (int i = 0; i < MK_BobotN[0].length; i++) {
        if (MK_BobotN[0][i] > 80 && MK_BobotN[0][i] <= 100) {
            nilaiHuruf[i] = "A";
            MK_BobotN[1][i] = 4.00;
        } else if (MK_BobotN[0][i] > 73 && MK_BobotN[0][i] <= 80) {
            nilaiHuruf[i] = "B+";
            MK_BobotN[1][i] = 3.50;
        } else if (MK_BobotN[0][i] > 65 && MK_BobotN[0][i] <= 73) {
            nilaiHuruf[i] = "B";
            MK_BobotN[1][i] = 3.00;
        } else if (MK_BobotN[0][i] > 60 && MK_BobotN[0][i] <= 65) {
            nilaiHuruf[i] = "C+";
            MK_BobotN[1][i] = 2.50;
        } else if (MK_BobotN[0][i] > 50 && MK_BobotN[0][i] <= 60) {
            nilaiHuruf[i] = "C";
            MK_BobotN[1][i] = 2.00;
        } else if (MK_BobotN[0][i] > 39 && MK_BobotN[0][i] <= 50) {
            nilaiHuruf[i] = "D";
            MK_BobotN[1][i] = 1.00;
        } else {
            nilaiHuruf[i] = "E";
            MK_BobotN[1][i] = 0.00;
        }
    }
    System.out.printf("%-40s %-20s %-20s %-20s\n",  "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

    for (int i = 0; i < MK_BobotN[0].length; i++){
        System.out.printf("%-40s %-20.2f %-20s %-20.2f\n", MK[i], MK_BobotN[0][i], nilaiHuruf[i], MK_BobotN[1][i]);
    }
    System.out.println("======================");

    for (int i = 0; i < SKS.length; i++){
        totSKS += SKS[i];
    }
    for (int i = 0; i < MK_BobotN[0].length; i++){
        totBobotN += MK_BobotN[1][i] * SKS[i];
    }
    IPS = totBobotN / totSKS;
    System.out.printf("%-2s %-2.2f", "IPS : ", IPS);
    }
}
