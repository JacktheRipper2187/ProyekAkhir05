import java.util.Scanner;

public class bismillah {
    Scanner sc = new Scanner(System.in);

    static String mskUsername, mskPassword, menuBaru, daftarMenuBaru, inputMenu;
    static int menuManager, pilihan, jmlMenu = 0, hargaMenuBaru, stokMenuBaru, totalBayar=0, diskon=0;

    static String username[] = { "Karina", "Kanaya", "Ulil", "Manager" };
    static String password[] = { "karina111", "kanaya111", "ulil111", "Manager123" };
    static boolean berhasilLogin = false;
    static boolean isManager = false;

    static String daftarMenu[] = new String[100];
    static int hargaMenu[] = new int[100];
    static int stokMenu[] = new int[100];

    static String[] namaBarangStruk = new String[100];
    static int[] hargaBarangStruk = new int[100];
    static int[] jumlahBarangStruk = new int[100];
    static int[] totalHargaBarangStruk = new int[100];
    static int countBarangStruk = 0;

    static int totalPendapatan = 0;
    static String[] tanggalTransaksi = new String[100]; // Array untuk tanggal transaksi


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
                    case 3:
                        System.out.println("Terima kasih");
                        break;
                }
            } while (menuManager!=3);
            sc.close();
        } else {
            do {
                System.out.println("--------------------------------------------------------");
                System.out.println("||                   PILIH MENU :                     ||");
                System.out.println("--------------------------------------------------------");
                System.out.println("||                  1. Daftar Menu & Stok             ||");
                System.out.println("||                  2. Transaksi                      ||");
                System.out.println("||                  3. Struk Pembayaran               ||");
                System.out.println("||                  4. Tambah Stok Menu               ||");
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
                        cetakStruk(mskUsername, countBarangStruk);
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
        int totalHarga = 0;

    // Menampilkan daftar menu
    menu();

    System.out.println("=========================================");
    System.out.println("           PEMESANAN MENU               ");
    System.out.println("=========================================");

    // Memilih menu untuk transaksi
    System.out.print("Masukkan nomor menu yang ingin dipesan: ");
    int nomorMenu = sc.nextInt();
    sc.nextLine();

    // Memilih jumlah pesanan
    System.out.print("Masukkan jumlah pesanan: ");
    int jumlahPesanan = sc.nextInt();
    sc.nextLine();
    

    // Menghitung total harga
    int index = nomorMenu - 1;
    if (index >= 0 && index < jmlMenu && jumlahPesanan > 0) {
        if (stokMenu[index] >= jumlahPesanan) {
            totalHarga = hargaMenu[index] * jumlahPesanan;

            totalBayar += totalHarga;

            if (totalBayar > 100000) {
                diskon = 20000; // Ubah ini sesuai dengan jumlah diskon yang diinginkan
                totalBayar -= diskon; // Mengurangi totalBayar dengan nilai diskon
            }

            if (totalHarga > 0) {
                namaBarangStruk[countBarangStruk] = daftarMenu[index];
                hargaBarangStruk[countBarangStruk] = hargaMenu[index];
                jumlahBarangStruk[countBarangStruk] = jumlahPesanan;
                totalHargaBarangStruk[countBarangStruk] = totalHarga;
                countBarangStruk++;
            }

            // Update stok
            stokMenu[index] -= jumlahPesanan;

            // Menampilkan rincian pesanan
            System.out.println("\n=========================================");
            System.out.println("          RINCIAN PESANAN               ");
            System.out.println("=========================================");
            System.out.println("Menu         : " + daftarMenu[index]);
            System.out.println("Harga        : " + hargaMenu[index]);
            System.out.println("Jumlah       : " + jumlahPesanan);
            System.out.println("Total Harga  : " + totalHarga);
            System.out.println("=========================================");

            // Pilihan pembayaran
            System.out.println("\nPILIHAN PEMBAYARAN:");
            System.out.println("1. Tunai");
            System.out.println("2. Transfer bank");
            System.out.print("Pilih metode pembayaran (1/2): ");
            int metodePembayaran = sc.nextInt();
            sc.nextLine();

            // Proses pembayaran
            if (metodePembayaran == 1) {
                System.out.print("Masukkan jumlah uang tunai: ");
                int jumlahUangTunai = sc.nextInt();
                sc.nextLine();

                // Hitung kembalian
                int kembalian = jumlahUangTunai - totalHarga;
                if (kembalian >= 0) {
                    System.out.println("\n=========================================");
                    System.out.println("         TRANSAKSI BERHASIL              ");
                    System.out.println("=========================================");
                    System.out.println("Total Harga        : " + totalHarga);
                    System.out.println("Jumlah Uang Tunai  : " + jumlahUangTunai);
                    System.out.println("Kembalian          : " + kembalian);
                    System.out.println("=========================================");
                } else {
                    int kurangBayar = Math.abs(kembalian); // Hitung jumlah kekurangan bayar
                    System.out.println("Jumlah uang tunai tidak mencukupi. Kekurangan bayar: " + kurangBayar);
                }
            } else if (metodePembayaran == 2) {
                System.out.println("========================================================");
                System.out.println("||                    Transfer bank                   ||");
                System.out.println("========================================================");
                System.out.println("|| 2341760042----------Karina Ika                     ||");
                System.out.println("|| 2341760118----------Kanaya Abdiela                 ||");
                System.out.println("|| 2341760194----------Ulil Fahmi                     ||");
                System.out.println("========================================================");
                totalBayar = totalHarga;
                System.out.println("Total yang harus dibayar: Rp " + totalBayar);
            } else {
                System.out.println("Pilihan pembayaran tidak valid.");
            }
        } else {
            System.out.println("Maaf, stok tidak mencukupi untuk pesanan ini.");
        }
    } else {
        System.out.println("Input tidak valid.");
    }
    }

  // Fungsi Cetak Struk
  private static void cetakStruk(String masukkanUsername, int jumlahUangTunai) {
    int totalHarga = 0;
    for (int i = 0; i < countBarangStruk; i++) {
        totalHarga += totalHargaBarangStruk[i];
    }

    System.out.println("||===================================================||");
    System.out.println("||                 KING RESTAURANT                   ||");
    System.out.println("||                 Struk Pembayaran                  ||");
    System.out.println("||   Jl. Soekarno Hatta No. 9 Kelurahan Jatimulyo,   ||");
    System.out.println("|| Kecamatan Lowokwaru, Kota Malang,Jawa Timur 65141 ||");
    System.out.println("||===================================================||");
    System.out.println("  Kasir : " + masukkanUsername);
    System.out.println("  Tanggal transaksi : " + java.time.LocalDate.now());
    System.out.println("  Nama Barang : ");

    for (int i = 0; i < countBarangStruk; i++) {
        System.out.print("  " + namaBarangStruk[i]);
        System.out.print(" " + hargaBarangStruk[i]);
        System.out.print(" X " + jumlahBarangStruk[i]);
        System.out.println(" total: " + totalHargaBarangStruk[i]);
    }

    System.out.println("-------------------------------------------------------");
    System.out.println("  Total Belanja                     Rp:" + totalHarga);
    System.out.println("  Diskon                            Rp:" + diskon);
    System.out.println("-------------------------------------------------------");
    System.out.println("  TOTAL                             Rp:" + (totalHarga - diskon));
    System.out.println("-------------------------------------------------------");

     // Penambahan variabel kembalian
    int kembalian = jumlahUangTunai - totalHarga;
    System.out.println("  Tunai                             Rp:" + jumlahUangTunai);
    System.out.println("  Kembalian                         Rp:" + kembalian);
    System.out.println("=======================================================");
    System.out.println("            TERIMAKASIH ATAS KUNJUNGANNYA              ");
    System.out.println("    BARANG YANG SUDAH DIBELI TIDAK DAPAT DIKEMBALIKAN  ");
    System.out.println("=======================================================");
}

    static void tambahStok(Scanner sc){
        int index = -1;
        do {
        System.out.print("Masukkan menu : ");
        inputMenu = sc.nextLine();
        for (int i = 0; i < jmlMenu; i++) {
            if (daftarMenu[i].equalsIgnoreCase(inputMenu)) {
                index = i;
                break;
            }
            }
        if (index == -1 ) {
            System.out.println("Menu tidak ditemukan");
        }
    } while (index == -1);
    
            System.out.println("Harga: " + hargaMenu[index]);
    
            System.out.print("Masukkan jumlah menu yang akan ditambahkan ke stok: ");
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

            // Pengecekan apakah menu sudah ada dalam array daftarMenu
            for (int i = 0; i < jmlMenu; i++) {
                if (daftarMenuBaru.equalsIgnoreCase(daftarMenu[i])) {
                    System.out.println(daftarMenuBaru + " sudah ada dalam daftar barang!");
                    menuSudahAda = true; // Jika menu sudah ada, ubah menjadi true
                    break; // Keluar dari loop segera setelah ditemukan  menu yang sama
                }
            }

            if (!menuSudahAda) {
                System.out.print("Masukkan menu baru: ");
                hargaMenuBaru = sc.nextInt();
                System.out.print("Masukkan jumlah stok : ");
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

            System.out.println("===============================================");
            System.out.println("           LAPORAN PENDAPATAN RESTORAN          ");
            System.out.println("===============================================");
            System.out.println("Total Pendapatan: " + totalPendapatan);
            System.out.println("===============================================");
        
       }
}

