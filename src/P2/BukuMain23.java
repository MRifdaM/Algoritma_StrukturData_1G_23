package P2;

public class BukuMain23 {
    public static void main(String[] args) {
        Buku23 bk1 = new Buku23();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku23 bk2 = new Buku23("Self Rewards", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku23 buku = new Buku23("Tutorial Java", "Muhammad Rifda Musyaffa'", 100, 40, 89000);
        buku.tampilInformasi();
        buku.hitungHargaBayar(buku.hitungHargaTotal(10), buku.hitungDiskon(buku.hitungHargaTotal(10)));
    }
}
