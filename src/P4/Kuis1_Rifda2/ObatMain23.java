package P4.Kuis1_Rifda2;
import java.util.Scanner;
public class ObatMain23 {

    public static void main(String[] args) {
        Obat23[] obat23 = new Obat23[5];
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
            obat23[i] = new Obat23(namaObat23, kObat23,stokObat23,nObat23);
        }
        
            obat23[0].tampil(obat23);
        int[] sisaStok23 = obat23[0].hitungSisa(obat23);
        for (int j = 0; j < 5; j++) {
            System.out.println("Sisa stok obat " + obat23[j].nama23 + " tersisa " + sisaStok23[j]);
        }
        obat23[0].cariObatPalingLaku( obat23);
        obat23[0].tampil(obat23);
        obat23[0].daftarObat(obat23);
        sc23.close();
    }
}
