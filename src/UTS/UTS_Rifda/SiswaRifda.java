package UTS.UTS_Rifda;

public class SiswaRifda {
    String nisnRifda;
    String namaRifda;
    String alamatRifda;
    int tahunRifda;
    double nilaiRifda;

    public SiswaRifda(String nisnRifda, String namaRifda, String alamatRifda, int tahunRifda, double nilaiRifda){
        this.nisnRifda = nisnRifda;
        this.namaRifda = namaRifda;
        this.alamatRifda = alamatRifda;
        this.tahunRifda = tahunRifda;
        this.nilaiRifda = nilaiRifda;
    }

    public void tampilkanDataSiswa(){
        System.out.println("Nisn : " + nisnRifda);
        System.out.println("Nama : " + namaRifda);
        System.out.println("Alamat : " + alamatRifda);
        System.out.println("Tahun : " + tahunRifda);
        System.out.println("Nilai : " + nilaiRifda);
    }
}
