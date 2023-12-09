import java.util.Scanner;

public class KasirrRestoran05 {

    static int nilai = 0;
    static String[] daftarMakanan = {
            "Nasi Goreng", "Sate Ayam", "Gado-gado", "Telur Bawang Merah", "Ayam geprek", "Bakso Daging",
            "Ayam Teriyaki", "Ayam Lada Hitam", "Chicken Bulgogi", "Kwetiau Goreng"
    };
    static int[] hargaMakanan = {
            35000, 20000, 22000, 25000, 28000, 20000, 32000, 36000, 28000, 34000
    };
    static String[] daftarMinuman = {
            "Es Teh", "Kopi", "Es Jeruk", "Jus Mangga", "Jus Jambu", "Teh Tarik", "Milo", "Lychee Tea", "Lemon Tea",
            "Air Mineral"
    };
    static int[] hargaMinuman = {
            8000, 10000, 8000, 10000, 10000, 8000, 10000, 10000, 10000, 6000
    };
    static String[] keranjangMakan = new String[10];
    static int[] keranjangPorsi = new int[10];
    static String[] keranjangMinumanan = new String[10];
    static int[] keranjangPorsiMinuman = new int[10];
    static int[][] porsi = new int[100][10];
    static String[][] makan = new String[100][10];
    static int[][] hargaItem = new int [100][10];
    static int totalHargaMakan,totalHargaMinum;
    static int totalTransaksi = 0; // Untuk menghitung total transaksi yang sudah dilakukan
    static int nomorTransaksiAktual = 0; // Untuk menghitung nomor transaksi yang sedang berlangsung


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Selamat datang di Kasir Restoran");
        System.out.println("================================");

        boolean loginSuccces = false;

        while (!loginSuccces) {

            System.out.print("Masukkan username: ");
            String username = sc.nextLine();
            System.out.print("Masukkan Password: ");
            String password = sc.nextLine();

            if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("123")) {
                System.out.println("Login Berhasil");
                loginSuccces = true;
            } else {
                System.out.println("Username atau Password salah. Silahkan coba lagi. ");
            }

        }

        int pilihan;
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
                    menu(sc);
                    break;
                case 2:
                    transaksi(sc);
                    break;
                case 3:
                    tampilkanLaporanPenjualan();
                    break;
                case 4:
                    strukPembayaran();
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

    public static void menu(Scanner sc) {
        System.out.println("|================================|");
        System.out.println("|       MENU MAKANAN             |");
        System.out.println("|================================|");

        // Menampilkan daftar makanan dan harganya dari array
        for (int i = 0; i < daftarMakanan.length; i++) {
            System.out.printf("|%d. %-15s %-13s|\n", (i + 1), daftarMakanan[i], "Rp " + hargaMakanan[i]);
        }
        System.out.println("|================================|\n");

        System.out.println("|================================|");
        System.out.println("|       MENU MINUMAN             |");
        System.out.println("|================================|");

        // Menampilkan daftar makanan dan harganya dari array
        for (int i = 0; i < daftarMinuman.length; i++) {
            System.out.printf("|%d. %-15s %-13s|\n", (i + 1), daftarMinuman[i], "Rp " + hargaMinuman[i]);
        }
        System.out.println("|================================|\n");
    }

    public static void transaksi(Scanner sc) {
        System.out.print("Pilih Makanan: ");
        int pilihanMakanan = sc.nextInt() - 1;
        System.out.print("Berapa porsi: ");
        int jumlahPorsi = sc.nextInt();

        keranjangMakan[nilai] = daftarMakanan[pilihanMakanan];
        keranjangPorsi[nilai] = jumlahPorsi;
        totalHargaMakan += hargaMakanan[pilihanMakanan] * keranjangPorsi[nilai];
        hargaItem[nomorTransaksiAktual][nilai] = totalHargaMakan;

        System.out.println("Makanan yang di pesan: " + keranjangMakan[nilai]);
        System.out.println("Jumlah Porsi :" + keranjangPorsi[nilai] + " porsi");
        System.out.println("Total Harga: " + totalHargaMakan);
        System.out.print("Apakah Anda ingin membeli minuman? (y/t): ");
        sc.nextLine(); // Clear the newline character
        String beliMinuman = sc.nextLine();

        if (beliMinuman.equalsIgnoreCase("y")) {
            for (int i = 0; i < daftarMinuman.length; i++) {
            }
            System.out.print("Pilih Minuman: ");
            int pilihanMinuman = sc.nextInt() - 1;
            System.out.print("Berapa porsi: ");
            int jumlahPorsiMinuman = sc.nextInt();

            keranjangMinumanan[nilai] = daftarMinuman[pilihanMinuman];
            keranjangPorsiMinuman[nilai] = jumlahPorsiMinuman;
            totalHargaMinum += hargaMinuman[pilihanMinuman] * keranjangPorsiMinuman[nilai];
            System.out.println("Minuman yang dipesan: " + keranjangMinumanan[nilai]);
            System.out.println("Jumlah Porsi Minuman: " + keranjangPorsiMinuman[nilai] + " porsi");
            System.out.println("Total Harga: " + totalHargaMinum);

            int total = totalHargaMakan + totalHargaMinum;
            System.out.println("Total Bayar: " + total);
        } else {
            System.out.println("Total Bayar: " + totalHargaMakan);
        }
        makan[nomorTransaksiAktual][nilai] = keranjangMakan[nilai];
        porsi[nomorTransaksiAktual][nilai] = keranjangPorsi[nilai];
        hargaItem[nomorTransaksiAktual][nilai] = totalHargaMakan;
    
        if (keranjangMinumanan[nilai] != null) {
            makan[nomorTransaksiAktual][nilai + 1] = keranjangMinumanan[nilai];
            porsi[nomorTransaksiAktual][nilai + 1] = keranjangPorsiMinuman[nilai];
            hargaItem[nomorTransaksiAktual][nilai + 1] = totalHargaMinum;
        }
    
        nilai++;
        nomorTransaksiAktual++;
        totalTransaksi++;
    }

    public static void tampilkanLaporanPenjualan() {
        System.out.println("=== Laporan Penjualan ===");
        int totalSemuaTransaksi = 0;
    
        for (int i = 0; i < totalTransaksi; i++) {
            int totalHargaTransaksi = 0;

            System.out.println("Transaksi ke-" + (i + 1) + ":");
    
            // Tampilkan informasi pesanan
            for (int j = 0; j < makan[i].length; j++) {
                if (makan[i][j] != null) {
                    System.out.println("Menu: " + makan[i][j] + ", Porsi: " + porsi[i][j] +
                            ", Harga: Rp " + hargaItem[i][j]);
                    totalHargaTransaksi += hargaItem[i][j];

                }
            }
    
            // Tampilkan total harga transaksi
            System.out.println("Total Harga Transaksi ke-" + (i + 1) + ": Rp " + totalHargaTransaksi);
            totalSemuaTransaksi += totalHargaTransaksi;
            System.out.println(); // Pemisah antara transaksi
        }
        System.out.println("Total dari Semua Transaksi: Rp " + totalSemuaTransaksi);
        System.out.println("========================================");
    }    

    public static void strukPembayaran() {

    }
}