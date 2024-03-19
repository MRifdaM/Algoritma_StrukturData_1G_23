package P4.Kuis1_Rifda;
import java.util.Scanner;
public class ObatMain23 {

    public static void main(String[] args) {
        Obat23[] obat23 = new Obat23[5];
        int[] obatL23 = new int[5];
        int[] sObat23 = new int[5];
        Scanner sc23 = new Scanner(System.in);

        for (int i = 0; i < obat23.length; i++) {
            System.out.println("Masukkan nama obat: ");
            String namaObat23 = sc23.next();
            System.out.println("Masukkan kategori obat: ");
            String kObat23 = sc23.next();
            System.out.println("Masukkan stok obat: ");
            int stokObat23 = sc23.nextInt();
            System.out.println("Masukkan jumlah obat yang terjual: ");
            int nObat23 = sc23.nextInt();
            obatL23[i] = nObat23;
            sObat23[i] = stokObat23;
            obat23[i] = new Obat23(namaObat23, kObat23,stokObat23,nObat23);
        }

        Obat23.tampil(obat23);
        int[] sisaStok23 = Obat23.hitungSisa(obatL23, sObat23);
        for (int i = 0; i < 5; i++) {
            System.out.println("Sisa stok obat " + obat23[i].nama23 + " tersisa " + sisaStok23[i]);
        }
        Obat23.cariObatPalingLaku(obatL23, obat23);
        Obat23.tampil(obat23);
        Obat23.daftarObat(sObat23, obat23);
        Obat23.tampil(obat23);
        sc23.close();
    }
}
