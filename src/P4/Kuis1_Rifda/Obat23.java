package P4.Kuis1_Rifda;

public class Obat23 {
    String nama23, kategori23;
    int stok23, jumlah23;

    public Obat23(String nama23, String kategori23, int stok23, int jumlah23) {
        this.nama23 = nama23;
        this.kategori23 = kategori23;
        this.stok23 = stok23;
        this.jumlah23 = jumlah23;
    }

    public static void tampil(Obat23[] dataObat23){
        for  (int i = 0; i < 5; i++) {
            System.out.println("Obat " + dataObat23[i].nama23 + " berkategori " +  dataObat23[i].kategori23 + " memiliki stok " + dataObat23[i].stok23 +" laku sebanyak " + dataObat23[i].jumlah23);
        }
    }

    public static int[] hitungSisa(int[] obatLaku23, int[] stokObat23) {
        for (int i = 0; i < 5; i++) {
            stokObat23[i] -= obatLaku23[i];
        }
        return stokObat23;
    }

    public static void cariObatPalingLaku(int[] obatLaku23, Obat23[] dataObat23) {
        Obat23[] dObat23 = new Obat23[5];
        int[] obatL23 = new int[5];
        for (int i = 0; i < 5; i++) {
            obatL23[i] = obatLaku23[i];
            dObat23[i] = dataObat23[i];
        }
        for (int a = 0; a < 5; a++) {
        for(int i = 0, j = 1; i < 4; i++, j++) {
            if (obatL23[i] < obatL23[j]) {
                int temp23 = obatL23[i];
                Obat23 tempNama23 = dObat23[i];
                obatL23[i] = obatL23[j];
                dObat23[i] = dObat23[j];
                obatL23[j] = temp23;
                dObat23[j] = tempNama23;
            }
        }
    }
        System.out.println("Obat: "  + dObat23[0].nama23 + ", terjual: " + obatL23[0]);
    }

    public static void daftarObat(int[] stokObat23, Obat23[] dataObat23) {
        Obat23[] dObat23 = new Obat23[5];
        int[] sObat23 = new int[5];
        for (int i = 0; i < 5; i++) {
            sObat23[i] = stokObat23[i];
            dObat23[i] = dataObat23[i];
        }
        for (int a = 0; a <2; a++) {
        for(int i = 0, j = 1; i < 4; i++, j++) {
            if (sObat23[i] > sObat23[j]) {
                int temp23 = sObat23[i];
                Obat23 tempNama23 = dObat23[i];
                sObat23[i] = sObat23[j];
                dObat23[i] = dObat23[j];
                sObat23[j] = temp23;
                dObat23[j] = tempNama23;
            }
        }
    }

        for (int i = 0; i < 5; i++) {
            System.out.println("Obat " + dObat23[i].nama23 + " memiliki stok sebanyak: " + sObat23[i]);
        }
    }
}

