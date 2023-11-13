import java.util.Scanner;

public class Pemilihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan, jumlahPesanan, totalHarga, harga;
        double totalBayar, diskon;
        
        System.out.println("Menu Restoran");
        System.out.println("1. Nasi Goreng - Rp 25000");
        System.out.println("2. Mie Goreng - Rp 20000");
        System.out.println("3. Ayam Bakar - Rp 35000");

        System.out.print("Pilih menu (1-3): ");
        pilihan = input.nextInt();

        harga = 0;

        if (pilihan == 1) {
            harga = 25000;
        } else if (pilihan == 2) {
            harga = 20000;
        } else if (pilihan == 3) {
            harga = 35000;
        } else {
            System.out.println("Menu tidak ditemukan.");
            return; // untuk menghentikan program(jika pengguna memasukkan input yg salah)
                    // tidak menggunakan break karena hanya digunakan pada perulangan,loop
        } 

        System.out.print("Jumlah pesanan: ");
        jumlahPesanan = input.nextInt();

        totalHarga = harga * jumlahPesanan;

        // Pemilihan 1: Diskon berdasarkan total harga
        diskon = 0;
        if (totalHarga >= 50000) {
            diskon = 0.1 * totalHarga;
        }

        // Pemilihan 2: Diskon tambahan untuk pembelian lebih dari 3 item
        if (jumlahPesanan > 3) {
            diskon += 0.05 * totalHarga;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Detail Pesanan:");
        System.out.println("Menu: " + pilihan);
        System.out.println("Jumlah Pesanan: " + jumlahPesanan);
        System.out.println("Total Harga: Rp " + totalHarga);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total Bayar: Rp " + totalBayar);
    }
}
