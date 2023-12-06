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
    static String[] keranjangMakan = new String[5];
    static int[] keranjangPorsi = new int[5];
    static String[] keranjangMinumanan = new String[5];
    static int[] keranjangPorsiMinuman = new int[5];
    static int[][] porsi = new int[100][10];
    static String[][] makan = new String[100][10];
    static int totalHarga;

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

                    break;
                case 4:

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
        totalHarga = hargaMakanan[pilihanMakanan] * keranjangPorsi[nilai];
        System.out.println("Makanan yang di pesan: " + keranjangMakan[nilai]);
        System.out.println("Jumlah Porsi :" + keranjangPorsi[nilai] + " porsi");
        System.out.println("Total Harga: " + totalHarga);
        System.out.print("Apakah Anda ingin membeli minuman? (Y/N): ");
        sc.nextLine(); // Clear the newline character
        String beliMinuman = sc.nextLine();

        if (beliMinuman.equalsIgnoreCase("Y")) {
            // System.out.println("Pilih Minuman:");
            for (int i = 0; i < daftarMinuman.length; i++) {
                // System.out.printf("%d. %-15s %-13s\n", (i + 1), daftarMinuman[i], "Rp " +
                // hargaMinuman[i]);
            }
            System.out.print("Pilih Minuman: ");
            int pilihanMinuman = sc.nextInt() - 1;
            System.out.print("Berapa porsi minuman: ");
            int jumlahPorsiMinuman = sc.nextInt();

            keranjangMinumanan[nilai] = daftarMinuman[pilihanMinuman];
            keranjangPorsiMinuman[nilai] = jumlahPorsiMinuman;
            totalHarga += hargaMinuman[pilihanMinuman] * keranjangPorsiMinuman[nilai];

            System.out.println("Minuman yang dipesan: " + keranjangMinumanan[nilai]);
            System.out.println("Jumlah Porsi Minuman: " + keranjangPorsiMinuman[nilai] + " porsi");
            System.out.println("Total Harga: " + totalHarga);
        }

        nilai++;

    }
}