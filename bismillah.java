import java.util.Scanner;

public class bismillah {
    Scanner sc = new Scanner(System.in);

    static String mskUsername, mskPassword, menuBaru, daftarMenuBaru;
    static int menuManager, pilihan, jmlMenu = 0, hargaMenuBaru, stokMenuBaru;

    static String username[] = { "Karina", "Kanaya", "Ulil", "Manager" };
    static String password[] = { "karina111", "kanaya111", "ulil111", "Manager123" };
    static boolean berhasilLogin = false;
    static boolean isManager = false;

    static String daftarMenu[] = new String[100];
    static int hargaMenu[] = new int[100];
    static int stokMenu[] = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        daftarMenu[jmlMenu] = "Nasi Goreng";
        stokMenu[jmlMenu] = 50;
        hargaMenu[jmlMenu] = 17000;
        jmlMenu++;
        daftarMenu[jmlMenu] = "Nasi Bakar";
        stokMenu[jmlMenu] = 100;
        hargaMenu[jmlMenu] = 25000;
        jmlMenu++;
        daftarMenu[jmlMenu] = "Sate Ayam";
        stokMenu[jmlMenu] = 100;
        hargaMenu[jmlMenu] = 20000;
        jmlMenu++;
        daftarMenu[jmlMenu] = "Ayam Teriyaki";
        stokMenu[jmlMenu] = 100;
        hargaMenu[jmlMenu] = 28000;
        jmlMenu++;
        daftarMenu[jmlMenu] = "Chicken Bulgogi";
        stokMenu[jmlMenu] = 100;
        hargaMenu[jmlMenu] = 23000;
        jmlMenu++;
        daftarMenu[jmlMenu] = "Es Teh";
        stokMenu[jmlMenu] = 50;
        hargaMenu[jmlMenu] = 5000;
        jmlMenu++;
        daftarMenu[jmlMenu] = "Es Buah";
        stokMenu[jmlMenu] = 50;
        hargaMenu[jmlMenu] = 8000;
        jmlMenu++;
        daftarMenu[jmlMenu] = "Es Milo";
        stokMenu[jmlMenu] = 50;
        hargaMenu[jmlMenu] = 7000;
        jmlMenu++;
        daftarMenu[jmlMenu] = "Jus Alpukat";
        stokMenu[jmlMenu] = 50;
        hargaMenu[jmlMenu] = 10000;
        jmlMenu++;
        daftarMenu[jmlMenu] = "Jus Mangga";
        stokMenu[jmlMenu] = 50;
        hargaMenu[jmlMenu] = 10000;
        jmlMenu++;

        // Login
        while (!berhasilLogin) {
            System.out.println("===========================================");
            System.out.println("||                                       ||");
            System.out.println("||    SELAMAT DATANG DI KASIR RESTORAN   ||");
            System.out.println("||                                       ||");
            System.out.println("===========================================");
            System.out.println("\n");
            System.out.println("*******************************************");
            System.out.println("*                  LOGIN                  *");
            System.out.println("*******************************************");
            System.out.print("Masukkan username : ");
            mskUsername = sc.nextLine();
            System.out.print("Masukkan password : ");
            mskPassword = sc.nextLine();

            for (int i = 0; i < username.length; i++) {
                if (mskUsername.equalsIgnoreCase(username[i]) && mskPassword.equalsIgnoreCase(password[i])) {
                    System.out.println("============================");
                    System.out.println("| SELAMAT DATANG " + username[i] + " |");
                    System.out.println("============================");
                    berhasilLogin = true;
                    isManager = username[i].equalsIgnoreCase("Manager");
                    break;
                    
                }
            }
            if (berhasilLogin) {
                break;
            } else {
                System.out.println("==============================");
                System.out.println("|    GAGAL MASUK. COBA LAGI  |");
                System.out.println("==============================");
            }           
        }

        if (isManager) {
            int pilih;
            do {
                System.out.println("--------------------------------------------------------");
                System.out.println("||                 PILIH MENU MANAGER                 ||");
                System.out.println("--------------------------------------------------------");
                System.out.println("||                  1. Daftar Menu & Stok             ||");
                System.out.println("||                  2. Laporan Pendapatan             ||");
                System.out.println("||                  3. Exit                           ||");
                System.out.println("--------------------------------------------------------");
                System.out.print("Masukkan menu pilihan Anda (1/2/3) : ");
                menuManager = sc.nextInt();
                switch (menuManager) {
                    case 1:
                        menu();
                        break;
                    case 2:
                        laporanPendapatan();
                    default:
                        break;
                }
            } while (menuManager!=5);
            sc.close();
        } else {
            do {
                System.out.println("--------------------------------------------------------");
                System.out.println("||                   PILIH MENU :                     ||");
                System.out.println("--------------------------------------------------------");
                System.out.println("||                  1. Daftar Menu & Stok             ||");
                System.out.println("||                  2. Transaksi                      ||");
                System.out.println("||                  3. Struk Pembayaran               ||");
                System.out.println("||                  4. Tambah Stok Barang             ||");
                System.out.println("||                  5. Tambah Menu Baru               ||");
                System.out.println("||                  6. Laporan Pendapatan             ||");
                System.out.println("||                  7. Exit                           ||");
                System.out.println("--------------------------------------------------------");
                System.out.print("Masukkan menu pilihan Anda (1/2/3/4/5/6/7) : ");
                pilihan = sc.nextInt();
                sc.nextLine();
                switch (pilihan) {
                    case 1:
                        menu();
                        break;
                    case 2:
                        transaksi(sc);
                        break;
                    case 3:
                        cetakStruk();
                        break;
                    case 4:
                        tambahStok(sc);
                        break;
                    case 5:
                        tambahMenu(sc);
                        break;
                    case 6:
                        laporanPendapatan();
                        break;
                    case 7:
                        System.out.println("Terima kasih");
                        break;
                }
            } while (pilihan != 7);
                sc.close();
        }
    }

    private static void menu(){
            // Menampilkan daftar menu
            System.out.println("---- Daftar Menu Makanan & Minuman ----:");
            System.out.println("--------------------------------------------");
            System.out.println("| No |   Makanan   |   Harga   |    Stok   |");
            System.out.println("--------------------------------------------");
            // code u/ kolom daftar
            for (int i = 0; i < jmlMenu; i++) {
                System.out.printf("| %-2d | %-12s | %-8d | %-9d |\n", i + 1, daftarMenu[i],
                        hargaMenu[i], stokMenu[i]);
            }
            System.out.println("--------------------------------------------");
    
    }

    static void transaksi(Scanner sc){
        
    }

    static void cetakStruk(){
        

    }

    static void tambahStok(Scanner sc){
        int index = -1;
        do {
        System.out.print("Masukkan menu : ");
        menuBaru = sc.nextLine();
        for (int i = 0; i < jmlMenu; i++) {
            if (daftarMenu[i].equalsIgnoreCase(menuBaru)) {
                index = i;
                break;
            }
            }
        if (index == -1 ) {
            System.out.println("Menu tidak ditemukan");
        }
    } while (index == -1);
    
            System.out.println("Harga: " + hargaMenu[index]);
    
            System.out.print("Masukkan jumlah barang yang akan ditambahkan ke stok: ");
            int jmlTambahStok = sc.nextInt();
            stokMenu[index] += jmlTambahStok;
    
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("Stok menu " + daftarMenu[index] + " berhasil ditambahkan sebanyak " + jmlTambahStok + " porsi.");
            System.out.println("---------------------------------------------------------------------------------");
    }

    private static void tambahMenu(Scanner sc){
        boolean menuSudahAda;
        do {
            System.out.print("Masukkan menu baru: ");
            daftarMenuBaru = sc.nextLine();
            menuSudahAda = false; // Inisialisasi sebagai false di awal

            // Pengecekan apakah barang sudah ada dalam array daftarMenu
            for (int i = 0; i < jmlMenu; i++) {
                if (daftarMenuBaru.equalsIgnoreCase(daftarMenu[i])) {
                    System.out.println(daftarMenuBaru + " sudah ada dalam daftar barang!");
                    menuSudahAda = true; // Jika barang sudah ada, ubah menjadi true
                    break; // Keluar dari loop segera setelah ditemukan barang yang sama
                }
            }

            if (!menuSudahAda) {
                System.out.print("Masukkan harga barang: ");
                hargaMenuBaru = sc.nextInt();
                System.out.print("Masukkan stok barang: ");
                stokMenuBaru = sc.nextInt();

                if (jmlMenu < daftarMenu.length && jmlMenu < stokMenu.length && jmlMenu < hargaMenu.length) {
                    daftarMenu[jmlMenu] = daftarMenuBaru;
                    stokMenu[jmlMenu] = stokMenuBaru;
                    hargaMenu[jmlMenu] = hargaMenuBaru;
                    jmlMenu++;
                    System.out.println("-------------------------------------------");
                    System.out.println(daftarMenuBaru + " berhasil ditambahkan! ");
                    System.out.println("-------------------------------------------");
                    break;
                } else {
                    System.out.println("Jumlah menu telah melebihi batas!");
                    break; // Keluar dari loop jika jumlah menu melebihi batas
                }
            }
        } while (true); // Loop terus sampai kondisi di dalamnya dihentikan dengan break
    }

    //Fungsi Laporan Pendapatan
    private static void laporanPendapatan(){

    }
}

