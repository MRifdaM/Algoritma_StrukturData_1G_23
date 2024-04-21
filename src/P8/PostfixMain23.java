package P8;

import java.util.Scanner;

public class PostfixMain23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        String p, q;
        System.out.println("Masukkan ekpressi matematika infix: ");
        q=sc23.nextLine();
        q = q.trim();
        q = q + ')';
        int total = q.length();
        Postfix23 post = new Postfix23(total);
        p = post.konversi(q);
        System.out.println("Postfix: " + p);
        sc23.close();
    }
}
