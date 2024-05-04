package P9.Tugas;
import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        Scanner sc23_2 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int n = sc23.nextInt();
        Queue antri = new Queue(n);
        int pilih;
        boolean isRun = true;
        Pembeli[] dataPembeli = new Pembeli[n];
        int idx = -1;

        do {
            menu();
            pilih = sc23.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = sc23_2.nextLine();
                    System.out.print("Masukkan Nomor HP: ");
                    int noHP = sc23.nextInt();
                    Pembeli data = new Pembeli(nama, noHP);
                    antri.enqueue(data);

                    idx++;
                    if (idx > dataPembeli.length-1){
                        Pembeli[] dataPembeliBaru = new Pembeli[dataPembeli.length+1];
                        for(int i = 0; i < dataPembeli.length; i++){
                            dataPembeliBaru[i] = new Pembeli(dataPembeli[i].nama, dataPembeli[i].noHP);
                        }

                        dataPembeli = new Pembeli[dataPembeliBaru.length];
                        for(int i = 0; i < dataPembeli.length-1; i++){
                            dataPembeli[i] = new Pembeli(dataPembeliBaru[i].nama, dataPembeliBaru[i].noHP);
                        }
                    }
                    dataPembeli[idx] = new Pembeli(nama, noHP);
                    break;

                case 2:
                    Pembeli dataKeluar = antri.dequeue();
                    if(!"".equals(dataKeluar.nama) && dataKeluar.noHP != 0){
                        System.out.println("Antrian yang keluar: " + dataKeluar.nama + " " + dataKeluar.noHP);
                    }
                    break;
            
                case 3:
                    antri.print();
                    break;

                case 4:
                    antri.peek();
                    break;
                
                case 5: 
                    antri.clear();
                    break;

                case 6: 
                    antri.peekRear();
                    break;

                case 7: 
                    System.out.print("Masukkan nama pembeli: ");
                    String cariNama = sc23_2.nextLine();
                    antri.peekPosition(cariNama);
                    break;

                case 8:
                    Queue dataAntriPembeli = new Queue(dataPembeli.length);
                    for(int i = 0; i < dataPembeli.length; i++){
                        dataAntriPembeli.enqueue(dataPembeli[i]);
                    }
                    dataAntriPembeli.daftarPembeli();
                    break;
                    
                case 9:
                    isRun = false;
                    break;
                default:
                    break;
            }
        } while (isRun);
        sc23.close();
        sc23_2.close();
    }

    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. PeekRear");
        System.out.println("7. PeekPosition");
        System.out.println("8. Tampilkan daftar pembeli");
        System.out.println("9. Keluar");
        System.out.println("-------------------------------------------");
    }
}
