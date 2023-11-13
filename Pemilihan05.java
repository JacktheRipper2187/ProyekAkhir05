import java.util.Scanner;

public class Pemilihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu Restoran");
        System.out.println("1. Nasi Goreng - Rp 25000");
        System.out.println("2. Mie Goreng - Rp 20000");
        System.out.println("3. Ayam Bakar - Rp 35000");

        System.out.print("Pilih menu (1-3): ");
        int pilihan = input.nextInt();

        int harga = 0;

        if (pilihan == 1) {
            harga = 25000;
        } else if (pilihan == 2) {
            harga = 20000;
        } else if (pilihan == 3) {
            harga = 35000;
        } else {
            System.out.println("Menu tidak ditemukan.");
        }

        System.out.print("Jumlah pesanan: ");
        int jumlahPesanan = input.nextInt();

        int totalHarga = harga * jumlahPesanan;

        // Pemilihan 1: Diskon berdasarkan total harga
        double diskon = 0;
        if (totalHarga >= 50000) {
            diskon = 0.1 * totalHarga;
        }

        // Pemilihan 2: Diskon tambahan untuk pembelian lebih dari 3 item
        if (jumlahPesanan > 3) {
            diskon += 0.05 * totalHarga;
        }

        double totalBayar = totalHarga - diskon;

        System.out.println("Detail Pesanan:");
        System.out.println("Menu: " + pilihan);
        System.out.println("Jumlah Pesanan: " + jumlahPesanan);
        System.out.println("Total Harga: Rp " + totalHarga);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total Bayar: Rp " + totalBayar);
    }
}
