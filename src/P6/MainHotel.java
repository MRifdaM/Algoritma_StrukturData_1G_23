package P6;

public class MainHotel {
    public static void main(String[] args) {
        HotelService hotelService = new HotelService(5);

        hotelService.tambah(new Hotel("Hotel A", "Kota X", 100000, (byte) 4));
        hotelService.tambah(new Hotel("Hotel B", "Kota Y", 150000, (byte) 1));
        hotelService.tambah(new Hotel("Hotel C", "Kota Z", 200000, (byte) 5));
        hotelService.tambah(new Hotel("Hotel D", "Kota X", 120000, (byte) 2));
        hotelService.tambah(new Hotel("Hotel E", "Kota Y", 180000, (byte) 4));

        System.out.println("=========================================================");
        System.out.println("Daftar Hotel sebelum disorting : ");
        hotelService.tampil();
        System.out.println();

        System.out.println("=========================================================");
        System.out.println("Daftar Hotel setelah disorting asc berdasarkan harga : ");
        System.out.println("- Bublle Sort");
        hotelService.bubbleSortAscHarga();
        hotelService.tampil();
        System.out.println();
        System.out.println("- Selection Sort");
        hotelService.selectionSortAscHarga();
        hotelService.tampil();
        System.out.println();

        System.out.println("=========================================================");
        System.out.println("Daftar Hotel setelah disorting des berdasarkan bintang : ");
        System.out.println("- Bublle Sort");
        hotelService.bubbleSortDesBintang();
        hotelService.tampil();
        System.out.println();
        System.out.println("- Selection Sort");
        hotelService.selectionSortDesBintang();
        hotelService.tampil();
    }
}
