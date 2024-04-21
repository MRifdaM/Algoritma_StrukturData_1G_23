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
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
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

    public String konversiDesimalKeBiner(int kode){
        StackKonversi stack = new StackKonversi();
        while(kode != 0){
            int sisa = kode % 2;
            stack.push(sisa);
            kode /= 2;
        }
        String biner = new String();
        while(!stack.isEmpty()){
            biner += stack.pop();
        }
        return biner;
    }

    public Barang23 lihatBarangTerbawah(){
        if (!cekKosong()){
            Barang23 barangTerbawah = tumpukan[0];
            return barangTerbawah;
        } else {
            return null;
        }
    }

    public void cariBarang(int cari){
        Barang23[] tumpukanBaru = new Barang23[tumpukan.length];
        for (int i = 0; i < tumpukanBaru.length; i++){
            if(tumpukan[i] != null){
                tumpukanBaru[i] = new Barang23(tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        }

        for(int i = 1; i < tumpukanBaru.length; i++){
            Barang23 temp = tumpukanBaru[i];
            if(temp != null) {
                int j = i;
                    while(j > 0 && tumpukanBaru[j-1] != null && temp.kode < tumpukanBaru[j-1].kode) {
                        tumpukanBaru[j] = tumpukanBaru[j-1];
                        j--;
                    }
                tumpukanBaru[j] = temp;
            }
        }

        int result = binarySearch(tumpukanBaru, cari, 0, tumpukanBaru.length-1);
        if(result != -1){
            System.out.println("Barang dengan kode " + cari + " ada di Gudang");
        } else {
            System.out.println("Barang dengan kode " + cari + " tidak ada di Gudang");
        }
    }

    public int binarySearch(Barang23[] tumpukanBaru, int cari,int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right) / 2;
            if (tumpukanBaru[mid] != null) {
                if (cari == tumpukanBaru[mid].kode) {
                    return mid;
                } else if (cari < tumpukanBaru[mid].kode) {
                    return binarySearch(tumpukanBaru, cari, left, mid - 1);
                } else {
                    return binarySearch(tumpukanBaru, cari, mid + 1, right);
                }
            } else {
                return binarySearch(tumpukanBaru, cari, left, mid -1);
            }
        }
        return -1;
    }
}
