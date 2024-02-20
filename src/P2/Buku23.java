package P2;

public class Buku23 {
    String judul, pengarang;
    int halaman, stok, harga;


    public Buku23(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
    
    public void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Sisa Stock : " + stok);
        System.out.println("Harga : Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0 && stok >= jml) {
            stok -= jml;
        } else {
            System.out.println("Stock kosong");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
}
