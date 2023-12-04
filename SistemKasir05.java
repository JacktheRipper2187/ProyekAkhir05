import java.util.Scanner;

public class SistemKasir05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalTransaksi = 0;

        while (true) {
            double totalBarang = 0;
            while (true) {
                try {
                    System.out.print("Masukkan harga barang (0 untuk selesai): ");
                    double hargaBarang = input.nextDouble();
                    if (hargaBarang == 0) {
                        break;
                    }
                    totalBarang += hargaBarang;
                } catch (Exception e) {
                    System.out.println("Masukkan angka yang valid!");
                    input.next(); // Membersihkan input yang salah
                }
            }

            if (totalBarang == 0) {
                break;
            }

            System.out.println("Total harga barang: " + totalBarang);
            System.out.print("Masukkan pembayaran: ");
            double pembayaran = input.nextDouble();
            double kembalian = pembayaran - totalBarang;

            if (kembalian >= 0) {
                totalTransaksi += totalBarang;
                System.out.println("Kembalian: " + kembalian);
            } else {
                System.out.println("Maaf, uang yang Anda masukkan kurang.");
            }
        }

        System.out.println("Total transaksi hari ini: " + totalTransaksi);
        input.close();
    }
}
