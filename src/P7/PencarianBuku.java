package P7;

public class PencarianBuku {
    Buku[] listBuku = new Buku[5];
    int idx;

    void tambah(Buku m){
        if (idx < listBuku.length) {
            listBuku[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (Buku m : listBuku) {
            m.tampilDataBuku();
        }
    }

    int findSeqSearch(int cari){
        int posisi = -1;
        for (int i = 0; i < listBuku.length; i++) {
            if (cari == listBuku[i].kodeBuku) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(int x, int pos){
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos){
        if (pos != -1) {
            System.out.println("Kode buku\t : " + x);
            System.out.println("Judul buku\t : " + listBuku[pos].judul);
            System.out.println("Tahun terbi\t : " + listBuku[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBuku[pos].pengarang);
            System.out.println("Stok\t : " + listBuku[pos].stok);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
}
