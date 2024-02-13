package P1;
import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        Long NIM;

        System.out.print("Masukkan NIM : ");
        NIM = sc23.nextLong();
        int n = (int) (NIM % 100);
        if (n < 10) {
            n += 10;
        }
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                if (i != 6 && i != 10) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("");
                }
            }
        }
        sc23.close();
    }
}
