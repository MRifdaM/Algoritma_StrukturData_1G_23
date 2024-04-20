package P8;

public class Gudang23 {
    Barang23[] tumpukan;
    int size, top;

    Gudang23(int size){
        this.size = size;
        tumpukan = new Barang23[size];
        top = -1;
    }

    public boolean cekPenuh(){
        if (top == size-1){
            return true;
        } else {
            return false;
        }
    }

    public boolean cekKosong(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang23 barang){
        if(!cekPenuh()){
            top++;
            tumpukan[top] = barang;
            System.out.println("Barang " + barang.nama + " berhasil ditambahkan ke gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
        }
    }

    public Barang23 ambilBarang(){
        if(!cekKosong()){
            Barang23 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " berhasil diambil dari gudang");
            return delete;
        } else {
            System.out.println("Gagal! Tumpukan barang kosong");
            return null;
        }
    }

    public Barang23 lihatBarangTeratas(){
        if (!cekKosong()){
            Barang23 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas " + barangTeratas.nama );
            return barangTeratas;
        } else {
            System.out.println("Tumpukan kosong");
            return null;
        }
    }

    public void tampilkaBarang(){
        if (!cekKosong()){
            System.out.println("Rincian tumpukan barang di gudang : ");
            for (int i = top; i >= 0; i--){
                System.out.printf("Kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        }
        else {
            System.out.println("Tumpukan barang kosong");
        }
    }
}
