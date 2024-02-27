package P3.ArrayObjects;
import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        int n = 0;

        System.out.print("Masukkan panjang element ppArray: ");
        n = sc23.nextInt();

        persegiPanjang[] ppArray = new persegiPanjang[n];
        for (int i = 0; i < 3; i++) {
            ppArray[i] = new persegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc23.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc23.nextInt();
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
        sc23.close();
    }
}
