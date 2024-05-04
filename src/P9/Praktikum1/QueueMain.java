package P9.Praktikum1;
import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        int pilih;
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc23.nextInt();
        Queue q = new Queue(n);

        boolean isRun = true;

        do {
            menu();
            pilih = sc23.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc23.nextInt();
                    q.enqueue(dataMasuk);
                    break;

                case 2:
                    isRun = q.dequeue();
                    break;

                case 3:
                    q.print();
                    break;

                case 4:
                    q.peek();
                    break;

                case 5:
                    q.clear();
                    break;
                
                case 6:
                    isRun = false;
                    break;
            }
            
        } while (isRun);
        sc23.close();
    }

    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Keluar");
        System.out.println("-------------------------------------------");
    }
}
