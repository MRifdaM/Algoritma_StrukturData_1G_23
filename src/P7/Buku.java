package P7;

public class Buku {
    int kodeBuku, tahunTerbit, stok;
    String judul, pengarang;

    Buku (int kodeBuku, String judul, int tahunTerbit, String pengarang, int stok){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stok = stok;
    }

    void tampilDataBuku() {
        System.out.println("=====================================");
        System.out.println("Kode buku " + kodeBuku);
        System.out.println("Judul buku " + judul);
        System.out.println("Tahun terbit buku " + tahunTerbit);
        System.out.println("Pengarang buku " + pengarang);
        System.out.println("Stok buku " + stok);
    }
}
