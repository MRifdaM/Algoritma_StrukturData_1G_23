package UTS.UTS_Rifda;

public class DaftarSiswaRifda {
    SiswaRifda[] daftarSiswaRifda = new SiswaRifda[6];
    int idxRifda;

    public void tambah(SiswaRifda mRifda){
        if(idxRifda < daftarSiswaRifda.length){
            daftarSiswaRifda[idxRifda] = mRifda;
            idxRifda++;
        } else{
            System.out.println("Daftar sudah penuh");
        }
    }

    public void insertionSort(){
        for(int iRifda= 1; iRifda< daftarSiswaRifda.length; iRifda++){
            SiswaRifda tempRifda = daftarSiswaRifda[iRifda];
            int jRifda = iRifda;
            while(jRifda > 0 && tempRifda.tahunRifda < daftarSiswaRifda[jRifda-1].tahunRifda){
                daftarSiswaRifda[jRifda] = daftarSiswaRifda[jRifda-1];
                jRifda--;
            }
            daftarSiswaRifda[jRifda] = tempRifda;
        }

        for(int iRifda = 0; iRifda < daftarSiswaRifda.length; iRifda++){
            daftarSiswaRifda[iRifda].tampilkanDataSiswa();
            System.out.println();
        }
    }
}
