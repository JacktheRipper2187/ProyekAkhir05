import java.util.Scanner;

public class KasirrRestoran05 {
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
        do {
            System.out.println("=== Menu Utama ===");
            System.out.println("1. Daftar Menu ");
            System.out.println("2. Transaksi ");
            System.out.println("3. Laporan Penjualan");
            System.out.println("4. Struk Pembayaran");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

        public static void menu{
            
        }
            switch (pilihan) {
                case 1:
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

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Terima kasih");
                default:
                    System.out.println("Menu tidak tersedia!");
                    break;
            }
        } while (pilihan != 5);

    }
}
