import java.util.Scanner;

public class KasirrRestoran05 {
    Scanner sc = new Scanner(System.in);

    static String mskUsername, mskPassword, menuBaru, daftarMenuBaru, inputMenu;
    static int menuManager, pilihan, jmlMenu = 0, hargaMenuBaru, stokMenuBaru, totalBayar = 0, jumlahUangTunai,
            nomorMenu, jumlahPesanan, totalHarga;
    static double diskon = 0.0, diskonKasar = 0.0, diskonAdmin = 0.0;

    static String[] kodeVoucher = new String[20];
    static double[] diskonVoucher = new double[20];
    static int jumlahVoucher = 1;
    static int noVoucher,diskonMember=0;
  

    static String username[] = { "Karina", "Kanaya", "Ulil", "Manager" };
    static String password[] = { "karina111", "kanaya111", "ulil111", "Manager123" };
    static boolean berhasilLogin = false, logout = true;
    static boolean isManager = false, pesan = true;

    static String daftarMenu[] = new String[100];
    static int hargaMenu[] = new int[100];
    static int stokMenu[] = new int[100];

    static String[] namaBarangStruk = new String[100];
    static int[] hargaBarangStruk = new int[100];
    static int[] jumlahBarangStruk = new int[100];
    static int[] totalHargaBarangStruk = new int[100];
    static int countBarangStruk = 0;

    static int pendapatanHarian = 0;
    static int pendapatanBulanan = 0;
    static int totalPendapatan = 0;
    static String[] tanggalTransaksi = new String[100]; // Array untuk tanggal transaksi
    
    static String language;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("||                                       ||");
        System.out.println("||    WELCOME TO THE RESTAURANT CASHIER  ||");
        System.out.println("||                                       ||");
        System.out.println("===========================================");
        System.out.println("\n");
        System.out.println("*******************************************");
        System.out.println("*             LANGUAGE SELECTION           *");
        System.out.println("*******************************************");
        System.out.println("1. English");
        System.out.println("2. Indonesian");
        System.out.print("Choose your language (1/2): ");
        int languageChoice = sc.nextInt();
        sc.nextLine();

        // Set language based on user's choice
        if (languageChoice == 1) {
            language = "English";
        } else if (languageChoice == 2) {
            language = "Indonesian";
        }

        kodeVoucher[0]=null;
        diskonVoucher[0]=0;

        if (logout) {
        if (language.equals("English")) {
        daftarMenu[jmlMenu] = "Fried Rice";
        stokMenu[jmlMenu] = 60;
        hargaMenu[jmlMenu] = 17000;
        jmlMenu++;
        daftarMenu[jmlMenu] = "Grilled Rice";
        stokMenu[jmlMenu] = 100;
        hargaMenu[jmlMenu] = 25000;
        jmlMenu++;
        daftarMenu[jmlMenu] = "Chicken Satay";
        stokMenu[jmlMenu] = 100;
        hargaMenu[jmlMenu] = 20000;
        jmlMenu++;
        daftarMenu[jmlMenu] = "Chicken Teriyaki";
        stokMenu[jmlMenu] = 100;
        hargaMenu[jmlMenu] = 28000;
        jmlMenu++;
        daftarMenu[jmlMenu] = "Chicken Bulgogi";
        stokMenu[jmlMenu] = 100;
        hargaMenu[jmlMenu] = 23000;
        jmlMenu++;
        daftarMenu[jmlMenu] = "Ice Tea";
        stokMenu[jmlMenu] = 50;
        hargaMenu[jmlMenu] = 5000;
        jmlMenu++;
        daftarMenu[jmlMenu] = "Ice Fruit";
        stokMenu[jmlMenu] = 50;
        hargaMenu[jmlMenu] = 8000;
        jmlMenu++;
        daftarMenu[jmlMenu] = "Ice Milo";
        stokMenu[jmlMenu] = 50;
        hargaMenu[jmlMenu] = 7000;
        jmlMenu++;
        daftarMenu[jmlMenu] = "Avocado Juice";
        stokMenu[jmlMenu] = 50;
        hargaMenu[jmlMenu] = 10000;
        jmlMenu++;
        daftarMenu[jmlMenu] = "Mango Juice";
        stokMenu[jmlMenu] = 50;
        hargaMenu[jmlMenu] = 10000;
        jmlMenu++;

        } else if (language.equals("Indonesian")) {
        daftarMenu[jmlMenu] = "Nasi Goreng";
        stokMenu[jmlMenu] = 60;
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
        }
    }

        // Login
        while (!berhasilLogin) {
            if (language.equals("English")) {
            System.out.println("===========================================");
            System.out.println("||                                       ||");
            System.out.println("||    WELCOME TO THE RESTAURANT CASHIER  ||");
            System.out.println("||                                       ||");
            System.out.println("===========================================");
            System.out.println("\n");
            System.out.println("*******************************************");
            System.out.println("*                  LOGIN                  *");
            System.out.println("*******************************************");
            System.out.print("Enter username : ");
            mskUsername = sc.nextLine();
            System.out.print("Enter password : ");
            mskPassword = sc.nextLine();

            } else if (language.equals("Indonesian")) {
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
            }
           

            for (int i = 0; i < username.length; i++) {
                if (mskUsername.equalsIgnoreCase(username[i]) && mskPassword.equalsIgnoreCase(password[i])) {
                    if (language.equals("English")) {
                    System.out.println("============================");
                    System.out.println("| WELCOME " + username[i] + " |");
                    System.out.println("============================");

                    } else if (language.equals("Indonesian")) {

                    System.out.println("============================");
                    System.out.println("| SELAMAT DATANG " + username[i] + " |");
                    System.out.println("============================");
                       
                    }
                    
                    berhasilLogin = true;
                    isManager = username[i].equalsIgnoreCase("Manager");
                    break;

                }
            }
            if (berhasilLogin) {
                break;
            } else {
                if (language.equals("English")) {
                System.out.println("==============================");
                System.out.println("|    LOGIN FAILED. TRY AGAIN |");
                System.out.println("==============================");
                } else if (language.equals("Indonesian")) {
                System.out.println("==============================");
                System.out.println("|    GAGAL MASUK. COBA LAGI  |");
                System.out.println("==============================");
                }
                
            }
        }

        if (isManager) {
            
            do {
                if (language.equals("English")) {
                System.out.println("--------------------------------------------------------");
                System.out.println("||                 SELECT MANAGER MENU                ||");
                System.out.println("--------------------------------------------------------");
                System.out.println("||                  1. Menu & Stock List              ||");
                System.out.println("||                  2. Revenue reports                ||");
                System.out.println("||                  3. Log Out                           ||");
                System.out.println("||                  4. Exit                           ||");
                System.out.println("--------------------------------------------------------");
                System.out.print("Enter your preferred menu (1/2/3/4) : ");
                } else if (language.equals("Indonesian")) {
                System.out.println("--------------------------------------------------------");
                System.out.println("||                 PILIH MENU MANAGER                 ||");
                System.out.println("--------------------------------------------------------");
                System.out.println("||                  1. Daftar Menu & Stok             ||");
                System.out.println("||                  2. Laporan Pendapatan             ||");
                System.out.println("||                  3. Log Out                        ||");
                System.out.println("||                  4. Exit                           ||");
                System.out.println("--------------------------------------------------------");
                System.out.print("Masukkan menu pilihan Anda (1/2/3/4) : ");
                    
                }
            
                menuManager = sc.nextInt();
                switch (menuManager) {
                    
                    case 1:
                        menu();
                        break;
                    case 2:
                        laporanPendapatan();
                        break;
                    case 3:
                        logOut(sc);
                        break;
                    case 4:
                    if (language.equals("English")) {
                        System.out.println("Thank You");
                    } else if (language.equals("Indonesian")) {
                        System.out.println("Terima kasih");
                    }
                    break;
                }              
            } while (menuManager != 4);
            sc.close();
            
        } else {
            do {
                if (language.equals("English")) {
                System.out.println("--------------------------------------------------------");
                System.out.println("||                   SELECT MENU :                    ||");
                System.out.println("--------------------------------------------------------");
                System.out.println("||                  1. Menu & Stock List              ||");
                System.out.println("||                  2. Transactions                   ||");
                System.out.println("||                  3. Payment Receipt                ||");
                System.out.println("||                  4. Add Menu Stock                 ||");
                System.out.println("||                  5. Add New Menu                   ||");
                System.out.println("||                  6. Income Report                  ||");
                System.out.println("||                  7. Discount                       ||");
                System.out.println("||                  8. Voucher                        ||");
                System.out.println("||                  9. Log Out                        ||");
                System.out.println("||                  10. Exit                          ||");
                System.out.println("--------------------------------------------------------");
                System.out.print("Enter your preferred menu (1/2/3/4/5/6/7/8/9/10) : ");

                } else if (language.equals("Indonesian")) {
                System.out.println("--------------------------------------------------------");
                System.out.println("||                   PILIH MENU :                     ||");
                System.out.println("--------------------------------------------------------");
                System.out.println("||                  1. Daftar Menu & Stok             ||");
                System.out.println("||                  2. Transaksi                      ||");
                System.out.println("||                  3. Struk Pembayaran               ||");
                System.out.println("||                  4. Tambah Stok Menu               ||");
                System.out.println("||                  5. Tambah Menu Baru               ||");
                System.out.println("||                  6. Laporan Pendapatan             ||");
                System.out.println("||                  7. Diskon                         ||");
                System.out.println("||                  8. Voucher                        ||");
                System.out.println("||                  9. LogOut                         ||");
                System.out.println("||                  10. Exit                          ||");
                System.out.println("--------------------------------------------------------");
                System.out.print("Masukkan menu pilihan Anda (1/2/3/4/5/6/7/8/9/10) : ");
                }

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
                        cetakStruk(mskUsername);
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
                        aturDiskon(sc);
                        break;
                    case 8:
                        voucher(sc);
                        break;
                    case 9:
                        logOut(sc);
                        break;
                    case 10:
                     if (language.equals("English")) {
                             System.out.println("Thank you");
                          } else if (language.equals("Indonesian")) {
                             System.out.println("Terima kasih");
                        }
                        break;
                }
            } while (pilihan != 10);
            sc.close();
        }
    }

    private static void menu() {
        if (language.equals("English")) {
        System.out.println("---- Food & Beverage Menu List ----:");
        System.out.println("-------------------------------------------------");
        System.out.println("| No |   Food            |  Price   |    Stock  |");
        System.out.println("-------------------------------------------------");
        } else if (language.equals("Indonesian")) {
        // Menampilkan daftar menu
        System.out.println("---- Daftar Menu Makanan & Minuman ----:");
        System.out.println("-------------------------------------------------");
        System.out.println("| No |   Makanan         |  Harga   |    Stok   |");
        System.out.println("-------------------------------------------------");
        }
        

        // code u/ kolom daftar
        for (int i = 0; i < jmlMenu; i++) {
            System.out.printf("| %-2d | %-17s | %-8d | %-9d |\n", i + 1, daftarMenu[i],
                    hargaMenu[i], stokMenu[i]);
        }
        System.out.println("-------------------------------------------------");

    }

    static void transaksi(Scanner sc) {
        int totalHarga = 0;
        if (pesan) {
            // Menampilkan daftar menu
            menu();
            if (language.equals("English")) {

            System.out.println("=========================================");
            System.out.println("           MENU ORDERING               ");
            System.out.println("=========================================");
            System.out.println("Are you membership? (Y/N)");
            String member=sc.nextLine();
            if (member.equalsIgnoreCase("y")) {
                System.out.println("you get a 10% discount ");
                diskonKasar=0.1;
                diskonMember=10;
            }else{
                diskonKasar=0.0;
                diskonMember=0;
            }

            System.out.print("Enter Transaction Date (dd/mm/yyyy): ");
            String tanggal = sc.nextLine();
            tanggalTransaksi[countBarangStruk] = tanggal;

            // Memilih menu untuk transaksi
            System.out.print("Enter the menu number you want to order: ");
            nomorMenu = sc.nextInt();
            sc.nextLine();

            // Memilih jumlah pesanan
            System.out.print("Enter the order quantity: ");
            jumlahPesanan = sc.nextInt();
            sc.nextLine();
            System.out.println("Do you want to insert a voucher? (Y/N)");
            String pilih=sc.nextLine();
            if (pilih.equalsIgnoreCase("y")) {
                System.out.print("Enter voucher code: ");
                String voucherCode = sc.nextLine();
                for (int i = 1; i < kodeVoucher.length; i++) {
                    if (voucherCode.equalsIgnoreCase(kodeVoucher[i])) {
                        System.out.println("Voucher code is valid!");
                        System.out.println("You get an additional discount of "+(diskonVoucher[i]*100)+"%");
                        noVoucher=i;
                        break;
                    }
                }
            }else{
                System.out.println("Not using vouchers.");
                noVoucher=0;
            }   
            } else if (language.equals("Indonesian")) {
                
            System.out.println("=========================================");
            System.out.println("           PEMESANAN MENU               ");
            System.out.println("=========================================");
            System.out.println("Apakah kamu membership? (Y/N)");
            String member=sc.nextLine();
            if (member.equalsIgnoreCase("y")) {
                System.out.println("kamu mendapatkan diskon 10% ");
                diskonKasar=0.1;
                diskonMember=10;
            }else{
                diskonKasar=0.0;
                diskonMember=0;
            }

            System.out.print("Masukkan tanggal transaksi (dd/mm/yyyy): ");
            String tanggal = sc.nextLine();
            tanggalTransaksi[countBarangStruk] = tanggal;

            // Memilih menu untuk transaksi
            System.out.print("Masukkan nomor menu yang ingin dipesan: ");
            nomorMenu = sc.nextInt();
            sc.nextLine();

            // Memilih jumlah pesanan
            System.out.print("Masukkan jumlah pesanan: ");
            jumlahPesanan = sc.nextInt();
            sc.nextLine();
            System.out.println("Apakah anda ingin memasukkan voucher? (Y/N)");
            String pilih=sc.nextLine();
            if (pilih.equalsIgnoreCase("y")) {
                System.out.print("Masukkan kode voucher: ");
                String voucherCode = sc.nextLine();
                for (int i = 1; i < kodeVoucher.length; i++) {
                    if (voucherCode.equalsIgnoreCase(kodeVoucher[i])) {
                        System.out.println("Kode voucher valid!");
                        System.out.println("Anda mendapatkan potongan tambahan sebesar "+(diskonVoucher[i]*100)+"%");
                        noVoucher=i;
                        break;
                    }
                }
            }else{
                System.out.println("Tidak menggunakan voucher.");
                noVoucher=0;
            }   
        }

            pesan = false;
        }
        if (!pesan) {
            // Menghitung total harga
            int index = nomorMenu - 1;
            if (index >= 0 && index < jmlMenu && jumlahPesanan > 0) {
                if (stokMenu[index] >= jumlahPesanan) {
                    totalHarga = hargaMenu[index] * jumlahPesanan;

                    totalBayar += totalHarga;
                    diskon = (diskonKasar+diskonVoucher[noVoucher]) * totalHarga;

                    if (totalHarga > 0) {
                        namaBarangStruk[countBarangStruk] = daftarMenu[index];
                        hargaBarangStruk[countBarangStruk] = hargaMenu[index];
                        jumlahBarangStruk[countBarangStruk] = jumlahPesanan;
                        totalHargaBarangStruk[countBarangStruk] = totalHarga;                        
                    }

                    // Update stok
                    stokMenu[index] -= jumlahPesanan;
                    pendapatanHarian += totalHarga - (int) diskon;
                    pendapatanBulanan += totalHarga - (int) diskon;

                    // Menampilkan rincian pesanan
                    if (language.equals("English")) {

                    System.out.println("\n=========================================");
                    System.out.println("           ORDER DETAILS                ");
                    System.out.println("=========================================");
                    System.out.println("Menu         : " + daftarMenu[index]);
                    System.out.println("Price        : " + hargaMenu[index]);
                    System.out.println("Quantity     : " + jumlahPesanan);
                    System.out.println("Discount     : " + (int) diskonAdmin + "% + "+(int)(diskonVoucher[noVoucher]*100)+"% + "+diskonMember+"%");
                    System.out.println("Total Price  : " + (totalHarga - (int) diskon));
                    System.out.println("=========================================");

                    // Pilihan pembayaran
                    System.out.println("\nPAYMENT OPTIONS:");
                    System.out.println("1. Cash");
                    System.out.println("2. Bank Transfer");
                    System.out.print("Select a payment method (1/2): ");
                    } else if (language.equals("Indonesian")) {

                    System.out.println("\n=========================================");
                    System.out.println("          RINCIAN PESANAN               ");
                    System.out.println("=========================================");
                    System.out.println("Menu         : " + daftarMenu[index]);
                    System.out.println("Harga        : " + hargaMenu[index]);
                    System.out.println("Jumlah       : " + jumlahPesanan);
                    System.out.println("Diskon       : " + (int) diskonAdmin + "% + "+(int)(diskonVoucher[noVoucher]*100)+"% + " +diskonMember+"%");
                    System.out.println("Total Harga  : " + (totalHarga - (int) diskon));
                    System.out.println("=========================================");

                    // Pilihan pembayaran
                    System.out.println("\nPILIHAN PEMBAYARAN:");
                    System.out.println("1. Tunai");
                    System.out.println("2. Transfer bank");
                    System.out.print("Pilih metode pembayaran (1/2): ");
                    }

                    int metodePembayaran = sc.nextInt();
                    sc.nextLine();

                         // Proses pembayaran
                    if (metodePembayaran == 1) {
                        if (language.equals("English")) {
                           System.out.print("Enter the cash amount: ");
                        } else if (language.equals("Indonesian")) {
                           System.out.print("Masukkan jumlah uang tunai: ");
                        }
     
                        jumlahUangTunai = sc.nextInt();
                        sc.nextLine();

                        // Hitung kembalian
                        int kembalian = jumlahUangTunai - (totalHarga - (int) diskon);
                        if (kembalian >= 0) {
                            if (language.equals("English")) {
                            System.out.println("\n=========================================");
                            System.out.println("     SUCCESSFUL TRANSACTION                ");
                            System.out.println("=========================================");
                            System.out.println("Total Price        : " + (totalHarga - (int) diskon));
                            System.out.println("Amount of Cash     : " + jumlahUangTunai);
                            System.out.println("Change             : " + kembalian);
                            System.out.println("=========================================");
                            } else if (language.equals("Indonesian")) {
                            System.out.println("\n=========================================");
                            System.out.println("         TRANSAKSI BERHASIL              ");
                            System.out.println("=========================================");
                            System.out.println("Total Harga        : " + (totalHarga - (int) diskon));
                            System.out.println("Jumlah Uang Tunai  : " + jumlahUangTunai);
                            System.out.println("Kembalian          : " + kembalian);
                            System.out.println("=========================================");
                            }
                     
                            pesan = true;
                        } else {
                            int kurangBayar = Math.abs(kembalian);
                            
                            // Hitung jumlah kekurangan bayar
                            if (language.equals("English")) {
                             System.out.println("The amount of cash is insufficient. Underpayment: " + kurangBayar);
                            } else if (language.equals("Indonesian")) {
                              System.out.println("Jumlah uang tunai tidak mencukupi. Kekurangan bayar: " + kurangBayar);
                            }
                      
                            pesan = false;
                            transaksi(sc);

                        }
                    } else if (metodePembayaran == 2) {
                        if (language.equals("English")) {
                        System.out.println("========================================================");
                        System.out.println("||                    Bank Transfer                   ||");
                        System.out.println("========================================================");
                        System.out.println("|| 2341760042----------Karina Ika                     ||");
                        System.out.println("|| 2341760118----------Kanaya Abdiela                 ||");
                        System.out.println("|| 2341760194----------Ulil Fahmi                     ||");
                        System.out.println("========================================================");
                        totalBayar = (totalHarga - (int) diskon);
                        System.out.println("Total payable: Rp " + totalBayar);
                        System.out.println("press y to continue...");
                        String lanjut=sc.nextLine();
                        if (lanjut.equalsIgnoreCase("y")) {
                            System.out.println("Payment success");
                            jumlahUangTunai=totalBayar;
                            pesan = true;
                        }else{
                            System.out.println("invalid transaction");
                            return;
                        }

                        } else if (language.equals("Indonesian")) {
                        System.out.println("========================================================");
                        System.out.println("||                    Transfer bank                   ||");
                        System.out.println("========================================================");
                        System.out.println("|| 2341760042----------Karina Ika                     ||");
                        System.out.println("|| 2341760118----------Kanaya Abdiela                 ||");
                        System.out.println("|| 2341760194----------Ulil Fahmi                     ||");
                        System.out.println("========================================================");
                        totalBayar = (totalHarga - (int) diskon);
                        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
                        System.out.println("Tekan y untuk melanjutkan...");
                        String lanjut=sc.nextLine();
                        if (lanjut.equalsIgnoreCase("y")) {
                            System.out.println("Pembayaran berhasil");
                            jumlahUangTunai=totalBayar;
                            pesan = true;
                        }else{
                            System.out.println("Transaksi dibatalkan");
                            return;
                        }
                        }
                  
                    } else {
                        if (language.equals("English")) {
                           System.out.println("Invalid payment option.");
                        } else if (language.equals("Indonesian")) {
                            System.out.println("Pilihan pembayaran tidak valid.");
                        }
                    
                    }
                } else {
                    if (language.equals("English")) {
                      System.out.println("Sorry, there is insufficient stock for this order.");
                    } else if (language.equals("Indonesian")) {
                      System.out.println("Maaf, stok tidak mencukupi untuk pesanan ini.");
                    }
                    
                }
            } else {
                if (language.equals("English")) {
                    System.out.println("invalid input.");
                } else if (language.equals("Indonesian")) {
                   System.out.println("Input tidak valid.");
                }
                
            }
         }

                   
        }
    

    // Fungsi Cetak Struk
    private static void cetakStruk(String masukkanUsername) {
        int totalHarga = 0;
       
            totalHarga += totalHargaBarangStruk[countBarangStruk];
            if (language.equals("English")) {
        System.out.println("||===================================================||");
        System.out.println("||                 KING RESTAURANT                   ||");
        System.out.println("||                 Payment Receipt                   ||");
        System.out.println("||   Jl. Soekarno Hatta No. 9 Kelurahan Jatimulyo,   ||");
        System.out.println("|| Kecamatan Lowokwaru, Kota Malang,Jawa Timur 65141 ||");
        System.out.println("||===================================================||");
        System.out.println("  Cashier             : " + masukkanUsername);
        System.out.println("  Transaction Date    : " + java.time.LocalDate.now());
        System.out.println("  Item Name          : ");

        System.out.print("  " + namaBarangStruk[countBarangStruk]);
        System.out.print(" " + hargaBarangStruk[countBarangStruk]);
        System.out.print(" X " + jumlahBarangStruk[countBarangStruk]);
        System.out.println(" total: " + totalHargaBarangStruk[countBarangStruk]);

        System.out.println("-------------------------------------------------------");
        System.out.println("  Total Spend                     Rp:" + totalHarga);
        System.out.println("  Discount                        Rp:" + (int) diskon);
        System.out.println("-------------------------------------------------------");
        System.out.println("  TOTAL                           Rp:" + (totalHarga - (int) diskon));
        System.out.println("-------------------------------------------------------");

        // Penambahan variabel kembalian
        int kembalian = jumlahUangTunai - (totalHarga - (int) diskon);
        System.out.println("  Cash                             Rp:" + jumlahUangTunai);
        System.out.println("  Change                           Rp:" + kembalian);
        System.out.println("=======================================================");
        System.out.println("              THANK YOU FOR VISITING                   ");
        System.out.println("                      ENJOY                            ");
        System.out.println("=======================================================");
        countBarangStruk++;

            } else if (language.equals("Indonesian")) {
        System.out.println("||===================================================||");
        System.out.println("||                 KING RESTAURANT                   ||");
        System.out.println("||                 Struk Pembayaran                  ||");
        System.out.println("||   Jl. Soekarno Hatta No. 9 Kelurahan Jatimulyo,   ||");
        System.out.println("|| Kecamatan Lowokwaru, Kota Malang,Jawa Timur 65141 ||");
        System.out.println("||===================================================||");
        System.out.println("  Kasir : " + masukkanUsername);
        System.out.println("  Tanggal transaksi : " + java.time.LocalDate.now());
        System.out.println("  Nama Barang : ");

        System.out.print("  " + namaBarangStruk[countBarangStruk]);
        System.out.print(" " + hargaBarangStruk[countBarangStruk]);
        System.out.print(" X " + jumlahBarangStruk[countBarangStruk]);
        System.out.println(" total: " + totalHargaBarangStruk[countBarangStruk]);

        System.out.println("-------------------------------------------------------");
        System.out.println("  Total Belanja                     Rp:" + totalHarga);
        System.out.println("  Diskon                            Rp:" + (int) diskon);
        System.out.println("-------------------------------------------------------");
        System.out.println("  TOTAL                             Rp:" + (totalHarga - (int) diskon));
        System.out.println("-------------------------------------------------------");

        // Penambahan variabel kembalian
        int kembalian = jumlahUangTunai - (totalHarga - (int) diskon);
        System.out.println("  Tunai                             Rp:" + jumlahUangTunai);
        System.out.println("  Kembalian                         Rp:" + kembalian);
        System.out.println("=======================================================");
        System.out.println("            TERIMAKASIH ATAS KUNJUNGANNYA              ");
        System.out.println("                  SELAMAT MENIKMATI                    ");
        System.out.println("=======================================================");
        countBarangStruk++;
            }
    
    }

    static void tambahStok(Scanner sc) {
        int index = -1;
        do {
            if (language.equals("English")) {
                System.out.print("Enter menu : ");
            } else if (language.equals("Indonesian")) {
                 System.out.print("Masukkan menu : ");
            }
           
            inputMenu = sc.nextLine();
            for (int i = 0; i < jmlMenu; i++) {
                if (daftarMenu[i].equalsIgnoreCase(inputMenu)) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                if (language.equals("English")) {
                    System.out.println("Menu not found ");
                } else if (language.equals("Indonesian")) {
                    System.out.println("Menu tidak ditemukan");
                }
   
            }
        } while (index == -1);
        if (language.equals("English")) {
       System.out.println("Price: " + hargaMenu[index]);

        System.out.print("Enter the number of menus to add to stock: ");
        int jmlTambahStok = sc.nextInt();
        stokMenu[index] += jmlTambahStok;

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Stock menu " + daftarMenu[index] + " successfully added as many times " + jmlTambahStok + " portion.");
        System.out.println("---------------------------------------------------------------------------------");

        } else if (language.equals("Indonesian")) {
        System.out.println("Harga: " + hargaMenu[index]);

        System.out.print("Masukkan jumlah menu yang akan ditambahkan ke stok: ");
        int jmlTambahStok = sc.nextInt();
        stokMenu[index] += jmlTambahStok;

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Stok menu " + daftarMenu[index] + " berhasil ditambahkan sebanyak " + jmlTambahStok + " porsi.");
        System.out.println("---------------------------------------------------------------------------------");
        }

 
    }

    private static void tambahMenu(Scanner sc) {
        boolean menuSudahAda;
        do {
            if (language.equals("English")) {
            System.out.print("Enter new menu: ");
            } else if (language.equals("Indonesian")) {
            System.out.print("Masukkan menu baru: ");
            }

            daftarMenuBaru = sc.nextLine();
            menuSudahAda = false; // Inisialisasi sebagai false di awal

            // Pengecekan apakah menu sudah ada dalam array daftarMenu
            for (int i = 0; i < jmlMenu; i++) {
                if (daftarMenuBaru.equalsIgnoreCase(daftarMenu[i])) {
                    if (language.equals("English")) {
                    System.out.println(daftarMenuBaru + " is already on the list of goods!");
                    } else if (language.equals("Indonesian")) {
                    System.out.println(daftarMenuBaru + " sudah ada dalam daftar barang!");
                    }

                    menuSudahAda = true; // Jika menu sudah ada, ubah menjadi true
                    break; // Keluar dari loop segera setelah ditemukan menu yang sama
                }
            }

            if (!menuSudahAda) {
                if (language.equals("English")) {
                System.out.print("Enter menu prices: ");
                hargaMenuBaru = sc.nextInt();
                System.out.print("Enter stock quantity: ");
                stokMenuBaru = sc.nextInt();
                } else if (language.equals("Indonesian")) {
                System.out.print("Masukkan harga menu: ");
                hargaMenuBaru = sc.nextInt();
                System.out.print("Masukkan jumlah stok: ");
                stokMenuBaru = sc.nextInt();
                }


                if (jmlMenu < daftarMenu.length && jmlMenu < stokMenu.length && jmlMenu < hargaMenu.length) {
                    daftarMenu[jmlMenu] = daftarMenuBaru;
                    stokMenu[jmlMenu] = stokMenuBaru;
                    hargaMenu[jmlMenu] = hargaMenuBaru;
                    jmlMenu++;
                    if (language.equals("English")) {
                    System.out.println("-------------------------------------------");
                    System.out.println(daftarMenuBaru + " Added successfully! ");
                    System.out.println("-------------------------------------------");
                    break;
                    } else if (language.equals("Indonesian")) {
                    System.out.println("-------------------------------------------");
                    System.out.println(daftarMenuBaru + " berhasil ditambahkan! ");
                    System.out.println("-------------------------------------------");
                    break;
                    }

                } else {
                    if (language.equals("English")) {
                    System.out.println("The number of menus has exceeded the limit!");
                    } else if (language.equals("Indonesian")) {
                    System.out.println("Jumlah menu telah melebihi batas!");
                    }

                    break; // Keluar dari loop jika jumlah menu melebihi batas
                }
            }
        } while (true); // Loop terus sampai kondisi di dalamnya dihentikan dengan break
    }

    // Fungsi Laporan Pendapatan
    private static void laporanPendapatan() {
        if (language.equals("English")) {
        System.out.println("===============================================");
        System.out.println("          RESTAURANT REVENUE REPORT            ");
        System.out.println("===============================================");
        System.out.println(" Daily income: " + pendapatanHarian);
        System.out.println(" Monthly income: " + pendapatanBulanan);
        System.out.println(" Total income: " + (pendapatanBulanan + pendapatanHarian));
        System.out.println("===============================================");

        } else if (language.equals("Indonesian")) {
        System.out.println("===============================================");
        System.out.println("           LAPORAN PENDAPATAN RESTORAN         ");
        System.out.println("===============================================");
        System.out.println(" Pendapatan Harian: " + pendapatanHarian);
        System.out.println(" Pendapatan Bulanan: " + pendapatanBulanan);
        System.out.println(" Total Pendapatan: " + (pendapatanBulanan + pendapatanHarian));
        System.out.println("===============================================");

        }


    }

    // fungsi untuk atur diskon
    private static void aturDiskon(Scanner sc) {
        if (language.equals("English")) {
        System.out.print("Enter the discount value desired by the admin: ");
        diskonAdmin = sc.nextInt();
        System.out.println("Discount by " + diskonAdmin + "% has been set by admin.");
        diskonKasar += diskonAdmin / 100;
        } else if (language.equals("Indonesian")) {
        System.out.print("Masukkan nilai diskon yang diinginkan oleh admin: ");
        diskonAdmin = sc.nextInt();
        System.out.println("Diskon sebesar " + diskonAdmin + "% telah diatur oleh admin.");
        diskonKasar += diskonAdmin / 100;
        }


    }

    private static void voucher(Scanner sc) {
        if (language.equals("English")) {
        System.out.println("Do you want to create a voucher? (Y/N)");
        } else if (language.equals("Indonesian")) {
        System.out.println("Apakah anda ingin membuat voucher? (Y/N)");
        }


        String pilihan=sc.next();
        if (pilihan.equalsIgnoreCase("Y")) {      
            if (jumlahVoucher < kodeVoucher.length) {
                if (language.equals("English")) {
                System.out.print("Enter voucher code: ");
                } else if (language.equals("Indonesian")) {
                System.out.print("Masukkan kode voucher: ");
                }

                String kodeInput = sc.next();
                sc.nextLine();
        
                // Memeriksa apakah kode voucher sudah ada sebelumnya
                boolean kodeSudahAda = false;
                for (int i = 0; i < jumlahVoucher; i++) {
                    if (kodeInput.equalsIgnoreCase(kodeVoucher[i])) {
                        kodeSudahAda = true;
                        break;
                    }
                }
        
                if (kodeSudahAda) {
                    if (language.equals("English")) {
                    System.out.println("The voucher code already exists.");
                    } else if (language.equals("Indonesian")) {
                    System.out.println("Kode voucher sudah ada.");
                    }

                } else {
                    if (language.equals("English")) {
                    System.out.print("Enter the discount amount for the voucher " + kodeInput + ": ");
                    } else if (language.equals("Indonesian")) {
                    System.out.print("Masukkan besaran diskon untuk voucher " + kodeInput + ": ");
                    }


                    double diskonInput = sc.nextDouble();
                    sc.nextLine();
        
                    if (jumlahVoucher < kodeVoucher.length) {
                        kodeVoucher[jumlahVoucher] = kodeInput;
                        diskonVoucher[jumlahVoucher] = (diskonInput/100);
                        jumlahVoucher++;
                    }
                    if (language.equals("English")) {
                    System.out.println("Voucher " + kodeInput + " with discount " + diskonInput + "% successfully added.");
                    } else if (language.equals("Indonesian")) {
                    System.out.println("Voucher " + kodeInput + " dengan diskon " + diskonInput + "% berhasil ditambahkan.");
                    }

                }
            } else {
                if (language.equals("English")) {
                System.out.println("Full voucher capacity.");
                } else if (language.equals("Indonesian")) {
                System.out.println("Kapasitas voucher penuh.");
                }

            }
        }else{

        }
    }

    public static void logOut(Scanner sc){
        System.out.println("Apakah anda ingin log Out? (y/n)");

        String pilih = sc.next();
        if (pilih.equalsIgnoreCase("y")) {
            logout = false;
            berhasilLogin = false;
            main(daftarMenu);
        } else {
            
        }
    }
    
}