import java.util.Scanner;

public class projek {

    public static void tampilkanLaporan(int[] pesanan, String[] namaMenu, double[] hargaMenu) {
        System.out.println("=== Laporan Penjualan ===");
        System.out.println("=========================");
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        int pilihan;
        int[] jumlahPesanan = new int[5]; // Menyimpan jumlah pesanan setiap menu
        double[] hargaMenu = {12000, 10000, 13000, 20000, 20000}; // Harga makanan

        do {
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
                    // Tampilkan daftar menu
                    // ...
                    
                    System.out.println("|================================|");
                    System.out.println("|       PILIH MENU MAKANAN       |");
                    System.out.println("|================================|");
                    System.out.println("|1. Nasi Goreng     Rp 12.000    |");
                    System.out.println("|2. Ayam Geprek     Rp 10.000    |");
                    System.out.println("|3. Nasi Bakar      Rp 13.000    |");
                    System.out.println("|4. Ikan Bakar      Rp 20.000    |");
                    System.out.println("|5. Cumi Goreng     Rp.20.000    |");
                    System.out.println("|================================|");
                    break;
                case 2:
                    System.out.println("=== Transaksi ===");
                    // Tampilkan daftar menu
                    // ...

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

                    // Simpan pesanan ke dalam array jumlahPesanan
                    jumlahPesanan[makanan - 1] += jumPorsi; // Mengupdate jumlah porsi pesanan

                    System.out.println("Pesanan ditambahkan!");
                    break;
                case 3:
                    // Tampilkan laporan penjualan
                    // ...
                    tampilkanLaporan(jumlahPesanan, namaMenu, hargaMenu);
                    break;
                case 4:
                    // Cetak struk pembayaran
                    // ...
                    break;
                case 5:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Menu tidak tersedia!");
                    break;
            }
        } while (pilihan != 5);
    }
}
