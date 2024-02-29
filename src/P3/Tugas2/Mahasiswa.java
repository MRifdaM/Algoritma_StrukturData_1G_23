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

    
    public static void IPKTerbesar(double[] IPK,int jumlah, Mahasiswa[] mahasiswa) {
        double[] dataIPK = new double[jumlah]; 
        Mahasiswa[] dataMahasiswa = new Mahasiswa[jumlah];
        for (int i = 0; i < jumlah; i++) {
            dataIPK[i] = IPK[i];
            dataMahasiswa[i] = mahasiswa[i];
        }

        for (int i = 0, j = i+1; i < jumlah-1; i++) {
            if (dataIPK[i] < dataIPK[j]) {
                double temp = dataIPK[i];
                Mahasiswa tempNama = dataMahasiswa[i];
                dataIPK[i] = dataIPK[j];
                dataMahasiswa[i] = dataMahasiswa[j];
                dataIPK[j] = temp;
                dataMahasiswa[j] = tempNama;
            }
        }
        System.out.println("Mahasiswa: "  + dataMahasiswa[0].nama + ", IPK: " + dataIPK[0]);
    }
}
