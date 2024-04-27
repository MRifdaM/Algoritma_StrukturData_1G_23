package UTS.UTS_Rifda;

public class PencarianSiswaRifda {
    SiswaRifda[] pencarianSiswaRifda = new SiswaRifda[6];
    int idxRifda;

    public void tambah(SiswaRifda mRifda){
        if(idxRifda < pencarianSiswaRifda.length){
            pencarianSiswaRifda[idxRifda] = mRifda;
            idxRifda++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    public void mencariSiswa(String cari){
        int resultRifda = binarySearch(cari, 0, pencarianSiswaRifda.length-1);
        if (resultRifda != -1){
            SiswaRifda siswaRifda = pencarianSiswaRifda[resultRifda];
            siswaRifda.tampilkanDataSiswa();
        }
    }

    public int binarySearch(String cariRifda, int leftRifda, int rightRifda){
        int midRifda;
        if(rightRifda >= leftRifda){
            midRifda = (leftRifda + rightRifda) / 2;
            if(cariRifda.equalsIgnoreCase(pencarianSiswaRifda[midRifda].namaRifda)){
                return midRifda;
            } else if (cariRifda.compareToIgnoreCase(pencarianSiswaRifda[midRifda].namaRifda) < 0){
                return binarySearch(cariRifda, leftRifda, midRifda-1);
            } else {
                return binarySearch(cariRifda, midRifda + 1, rightRifda);
            }
        }
        return -1;
    }
}
