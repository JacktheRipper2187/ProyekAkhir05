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

            switch (pilihan) {
                case 1:
                    menu(sc);
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

    public static void menu(Scanner sc) {
        System.out.println("|========================================|");
        System.out.println("|               MENU MAKANAN             |");
        System.out.println("|========================================|");
        System.out.println("|1. Nasi Goreng             Rp 15.000    |");
        System.out.println("|2. Nasi Bakar              Rp 13.000    |");
        System.out.println("|3. Ayam Geprek             Rp 12.000    |");
        System.out.println("|4. Ayam Crispy             Rp 20.000    |");
        System.out.println("|5. Ayam Bakar              Rp 35.000    |");
        System.out.println("|6. Spaghetti               Rp 27.500    |");
        System.out.println("|7. Rendang Daging          Rp 40.000    |");
        System.out.println("|8. Ricebowl                Rp 17.000    |");
        System.out.println("|9. Udang Asam Manis        Rp 23.000    |");
        System.out.println("|10. Cumi Goreng            Rp 20.000    |");
        System.out.println("|========================================|");

        System.out.println("|========================================|");
        System.out.println("|               MENU MINUMAN             |");
        System.out.println("|========================================|");
        System.out.println("|1. Es Teh                  Rp 5.000     |");
        System.out.println("|2. Es Jeruk                Rp 6.000     |");
        System.out.println("|3. Es Buah                 Rp 8.000     |");
        System.out.println("|4. Jus Alpukat             Rp 10.000    |");
        System.out.println("|5. Jus Melon               Rp 10.000    |");
        System.out.println("|6. Jus Jambu               Rp 10.000    |");
        System.out.println("|7. Kopi Susu               Rp 12.000    |");
        System.out.println("|8. Soda Gembira            Rp 17.000    |");
        System.out.println("|9. Teh Hangat              Rp 5.000     |");
        System.out.println("|10. GoodDay                Rp 10.000    |");
        System.out.println("|========================================|");
    }
}