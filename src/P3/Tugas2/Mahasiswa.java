package P3.Tugas2;

public class Mahasiswa {
    public String nama, kelamin;
    public long nim;
    public double ipk;

    public Mahasiswa(String nama, long nim,String kelamin,double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelamin = kelamin;
        this.ipk = ipk;
    }

    public static double rataIPK(int jumlah, double[] IPK) {
        double[] dataIPK = new double[jumlah];
        for (int i = 0; i < jumlah; i++) {
            dataIPK[i] = IPK[i];
        }
        double rataIPK = (dataIPK[0] + dataIPK[1] + dataIPK[2]) / jumlah;
        return rataIPK;
    }

    
    public static void IPKTerbesar(Mahasiswa[] mahasiswa) {
        if (mahasiswa[0].ipk > mahasiswa[1].ipk && mahasiswa[0].ipk > mahasiswa[2].ipk){
            System.out.println("Mahasiswa: " + mahasiswa[0].nama + ", IPK: " + mahasiswa[0].ipk);
        } else if (mahasiswa[1].ipk > mahasiswa[0].ipk && mahasiswa[1].ipk > mahasiswa[2].ipk) {
            System.out.println("Mahasiswa: " + mahasiswa[1].nama + ", IPK: " + mahasiswa[1].ipk);
        }else if (mahasiswa[2].ipk > mahasiswa[0].ipk && mahasiswa[2].ipk > mahasiswa[1].ipk) {
            System.out.println("Mahasiswa: " + mahasiswa[2].nama + ", IPK: " + mahasiswa[2].ipk);
        }
    }
}
