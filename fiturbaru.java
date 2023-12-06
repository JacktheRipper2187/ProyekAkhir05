 import java.util.Scanner;

public class fiturbaru {
    public static void tampilkanLaporan(int[] pesanan, String[] namaMenu, double[] hargaMenu) {
        System.out.println("Laporan Penjualan");
        System.out.println("=================");
        double totalPendapatan = 0;

        for (int i = 0; i < pesanan.length; i++) {
            if (pesanan[i] > 0) {
                double totalHarga = pesanan[i] * hargaMenu[i];
                System.out.println(namaMenu[i] + ": " + pesanan[i] + " porsi - Rp" + totalHarga);
                totalPendapatan += totalHarga;
            }
        }

        System.out.println("Total Pendapatan: Rp" + totalPendapatan);
    }

    public static void cetakStruk(int[] pesanan, String[] namaMenu, double[] hargaMenu) {
        System.out.println("Struk Pembayaran");
        System.out.println("================");
        double totalPembayaran = 0;

        for (int i = 0; i < pesanan.length; i++) {
            if (pesanan[i] > 0) {
                double totalHarga = pesanan[i] * hargaMenu[i];
                System.out.println(namaMenu[i] + ": " + pesanan[i] + " porsi - Rp" + totalHarga);
                totalPembayaran += totalHarga;
            }
        }

        System.out.println("Total Pembayaran: Rp" + totalPembayaran);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ... (Bagian kode login dan deklarasi variabel yang telah Anda tulis sebelumnya)
        System.out.println("================================");
        System.out.println("Selamat datang di Kasir Restoran");
        System.out.println("================================");
        System.out.print("Masukkan username: ");
        String username = sc.nextLine();
        System.out.print("Masukkan Password: ");
        String password = sc.nextLine();

        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("123")) {
            System.out.println("Login Berhasil");
        }

        int[] pesanan = new int[5]; // Menggunakan array untuk menyimpan jumlah porsi makanan
        double[] hargaMenu = {12000, 10000, 13000, 20000, 20000}; // Harga makanan
        String[] namaMenu = {"Nasi Goreng", "Ayam Geprek", "Nasi Bakar", "Ikan Bakar", "Cumi Goreng"}; // Nama makanan

        int pilihan;
        do {
            // ... (Bagian kode yang sudah ada sebelumnya)
            System.out.println("=== Menu Utama ===");
            System.out.println("1. Daftar Menu ");
            System.out.println("2. Transaksi ");
            System.out.println("3. Laporan Penjualan");
            System.out.println("4. Struk Pembayaran");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    // ... (Bagian kode pilihan menu 1 yang sudah ada sebelumnya)
                    System.out.println("|================================|");
                    System.out.println("|       PILIH MENU MAKANAN       |");
                    System.out.println("|================================|");
                    System.out.println("|1. Nasi Goreng     Rp 12.000    |");
                    System.out.println("|2. Ayam Geprek     Rp 10.000    |");
                    System.out.println("|3. Nasi Bakar      Rp 13.000    |");
                    System.out.println("|4. Ikan Bakar      Rp 20.000    |");
                    System.out.println("|5. Cumi Goreng     Rp.20.000    |");
                    System.out.println("|================================|");
                    System.out.print("Pilih makanan: ");
                    int makanan = sc.nextInt();
                    System.out.print("Berapa porsi: ");
                    int jumPorsi = sc.nextInt();
                    break;
                case 2:
                    // ... (Bagian kode pilihan menu 2 yang sudah ada sebelumnya)
                    break;
                case 3:
                    tampilkanLaporan(pesanan, namaMenu, hargaMenu);
                    break;
                case 4:
                    cetakStruk(pesanan, namaMenu, hargaMenu);
                    break;
                // ... (Bagian kode lainnya yang sudah ada sebelumnya)
            }
        } while (pilihan != 5);
        System.out.println("Terimakasih");
        // ... (Bagian kode yang sudah ada sebelumnya)
        
    }
}
 
    

