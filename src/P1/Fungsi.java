package P1;

public class Fungsi {
    public static void main(String[] args) {
        int [][]st0ckBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        int []hrgBunga = {75000, 50000, 60000, 10000};
        pendapatanCabang(st0ckBunga, hrgBunga);

        jmlhBunga(st0ckBunga);
    }

    static void pendapatanCabang (int [][]stckBunga, int []hrgBunga) {
        int []pendapatan = new int[4];
        for (int i = 0; i < stckBunga.length; i++) {
            for (int j = 0; j < stckBunga[i].length; j++) { 
                pendapatan[i] += stckBunga[i][j] * hrgBunga[j];
            }
        }

        for (int i = 0, j = 1; i < pendapatan.length; i++, j++){
            System.out.println("Pendapatan cabang " + j + " : " + pendapatan[i]);
        }
        System.out.println();
    }

    static void jmlhBunga (int [][]stckBunga) {
        String []namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int []bungaMati = {1, 2, 0, 5};
        int []stckTerkini = new int[4];
        for (int i = 0; i < bungaMati.length; i++) {
            stckTerkini[i] = stckBunga[3][i] - bungaMati[i]; 
        }
        System.out.println("Stock Bunga Cabang 4\n" + "==========================");
        for (int i = 0; i < stckTerkini.length; i++) {
            System.out.println("Bunga " + namaBunga[i] + " : " + stckTerkini[i]);
        }
    }
}
