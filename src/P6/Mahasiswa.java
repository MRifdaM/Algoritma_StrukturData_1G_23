package P6;

public class Mahasiswa {
    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa(String nama, int thnMasuk, int umur, double ipk){
        this.nama = nama;
        this.thnMasuk = thnMasuk;
        this.umur = umur;
        this.ipk = ipk;
    }

    void tampil(){
        System.out.println("Nama = " + nama);
        System.out.println("Tahun masuk = " + thnMasuk);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }
    
}
