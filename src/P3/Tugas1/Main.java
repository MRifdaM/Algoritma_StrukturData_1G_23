package P3.Tugas1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        Kerucut[] kcArray = new Kerucut[2];
        Limas[] lmArray = new Limas[2];
        Bola[] bArray = new Bola[2];

        for (int i = 0; i < 2; i++) {
            System.out.print("Masukkan jari-jari kerucut: ");
            double rKerucut = sc23.nextDouble();
            System.out.print("Masukkan sisi miring kerucut: ");
            double sKerucut = sc23.nextDouble();
            kcArray[i] = new Kerucut(rKerucut, sKerucut);
        }
        

        for (int i = 0; i < 2; i++) {
            System.out.print("Masukkan panjang sisi alas limas: ");
            double aLimas = sc23.nextDouble();
            System.out.print("Masukkan tinggi limas: ");
            double tL = sc23.nextDouble();
            lmArray[i] = new Limas(aLimas, tL);
        }
        

        for (int i = 0; i < 2; i++) {
        System.out.print("Masukkan jari-jari bola: ");
        double rBola = sc23.nextDouble();
        bArray[i] = new Bola(rBola);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Kerucut ke-" + i + ": ");
            System.out.println("Luas permukaan: " + kcArray[i].luasPermukaan() + ", volume: " + kcArray[i].volume());
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Limas ke-" + i + ": ");
            System.out.println("Luas permukaan: " + lmArray[i].luasPermukaan() + ", volume: " + lmArray[i].volume());
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Bola ke-" + i + ": ");
            System.out.println("Luas permukaan: " + bArray[i].luasPermukaan() + ", volume: " + bArray[i].volume());
        }
        sc23.close();
    }
}
