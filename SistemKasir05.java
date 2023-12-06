import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemKasir05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalTransaksi = 0;

        // Menentukan menu makanan beserta harganya
        Map<String, Double> menuMakanan = new HashMap<>();
        menuMakanan.put("Nasi Goreng", 15000.0);
        menuMakanan.put("Mie Goreng", 12000.0);
        menuMakanan.put("Ayam Goreng", 18000.0);
        menuMakanan.put("Sate Ayam", 20000.0);

        while (true) {
            System.out.println("Menu Makanan:");
            for (String makanan : menuMakanan.keySet()) {
                System.out.println(makanan + " - Rp" + menuMakanan.get(makanan));
            }
            System.out.println("5. Selesai dan hitung transaksi");

            int pilihan = input.nextInt();
            input.nextLine(); // Membersihkan newline

            if (pilihan >= 1 && pilihan <= 4) {
                String namaMakanan = "";
                double hargaMakanan = 0.0;

                // Mendapatkan nama dan harga makanan sesuai pilihan
                int index = 1;
                for (Map.Entry<String, Double> entry : menuMakanan.entrySet()) {
                    if (index == pilihan) {
                        namaMakanan = entry.getKey();
                        hargaMakanan = entry.getValue();
                        break;
                    }
                    index++;
                }

                System.out.println("Anda memilih: " + namaMakanan + " - Rp" + hargaMakanan);
                totalTransaksi += hargaMakanan;
            } else if (pilihan == 5) {
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih 1-5.");
            }
        }

        System.out.println("Total transaksi hari ini: Rp" + totalTransaksi);
        input.close();
    }
}
