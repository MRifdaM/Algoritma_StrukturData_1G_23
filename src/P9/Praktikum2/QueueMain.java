package P9.Praktikum2;
import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int max = sc23.nextInt();
        Queue antri = new Queue(max);
        int pilih;
        
        do {
            menu();
            pilih = sc23.nextInt();

            switch(pilih){
                case 1:
                sc23.nextLine();
                System.out.print("Masukkan No Rekening: ");
                String noRek = sc23.nextLine();
                System.out.print("Masukkan nama: ");
                String nama = sc23.nextLine();
                System.out.print("Masukkan alamat: ");
                String alamat = sc23.nextLine();
                System.out.print("Masukkan umur: ");
                int umur = sc23.nextInt();
                System.out.print("Masukkan saldo: ");
                double saldo = sc23.nextDouble();
                Nasabah nb = new Nasabah(noRek, nama, alamat, umur, saldo);
                sc23.nextLine();
                antri.enqueue(nb);
                break;

                case 2: 
                Nasabah data = antri.dequeue();
                if(!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0){
                    System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                }
                break;

                case 3:
                antri.peek();
                break;

                case 4:
                antri.print();
                break;
            }
            
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
        sc23.close();
    }
    
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("-------------------------------------------");
    }
}

