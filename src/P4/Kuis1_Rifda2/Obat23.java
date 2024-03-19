package P4.Kuis1_Rifda2;

public class Obat23 {
    String nama23, kategori23;
    int stok23, jumlah23;

    public Obat23(String nama23, String kategori23, int stok23, int jumlah23) {
        this.nama23 = nama23;
        this.kategori23 = kategori23;
        this.stok23 = stok23;
        this.jumlah23 = jumlah23;
    }

    public void tampil(Obat23[] dataObat23){
        for  (int i = 0; i < 5; i++) {
            System.out.println("Obat " + dataObat23[i].nama23 + " berkategori " +  dataObat23[i].kategori23 + " memiliki stok " + dataObat23[i].stok23 +" laku sebanyak " + dataObat23[i].jumlah23);
        }
    }

    public int[] hitungSisa(Obat23[] dataObat23) {
        int[] stokB = new int[5];
        for (int i = 0; i < 5; i++) {
            dataObat23[i].stok23 -=dataObat23[i].jumlah23;
            stokB[i] = dataObat23[i].stok23;
        }
        return stokB;
    }

    public void cariObatPalingLaku(Obat23[] dataObat23) {
        Obat23[] dObat23 = new Obat23[5];
        for (int i = 0; i < 5; i++) {
            dObat23[i] = new Obat23(dataObat23[i].nama23, dataObat23[i].kategori23, dataObat23[i].stok23, dataObat23[i].jumlah23);
        }
        for (int a = 0; a < 5; a++) {
        for(int i = 0, j = 1; i < 4; i++, j++) {
            if (dObat23[i].jumlah23 < dObat23[j].jumlah23) {
                int temp23 = dObat23[i].jumlah23;
                String tempNama23 = dObat23[i].nama23;
                dObat23[i].jumlah23 = dObat23[j].jumlah23;
                dObat23[i].nama23 = dObat23[j].nama23;
                dObat23[j].jumlah23 = temp23;
                dObat23[j].nama23 = tempNama23;
            }
        }
    }
        System.out.println("Obat: "  + dObat23[0].nama23 + ", terjual: " + dObat23[0].jumlah23);
    }

    public void daftarObat( Obat23[] dataObat23) {
        Obat23[] dObat23 = new Obat23[5];
        for (int i = 0; i < 5; i++) {
            dObat23[i] = dObat23[i] = new Obat23(dataObat23[i].nama23, dataObat23[i].kategori23, dataObat23[i].stok23, dataObat23[i].jumlah23);
        }
        for (int a = 0; a < 5; a++) {
        for(int i = 0, j = 1; i < 4; i++, j++) {
            if (dObat23[i].stok23 > dObat23[j].stok23) {
                int temp23 = dObat23[i].stok23;
                String tempNama23 = dObat23[i].nama23;
                dObat23[i].stok23 = dObat23[j].stok23;
                dObat23[i].nama23 = dObat23[j].nama23;
                dObat23[j].stok23 = temp23;
                dObat23[j].nama23 = tempNama23;
            }
        }
    }

        for (int i = 0; i < 5; i++) {
            System.out.println("Obat " + dObat23[i].nama23 + " memiliki stok sebanyak: " + dObat23[i].stok23);
        }
    }
    
}

