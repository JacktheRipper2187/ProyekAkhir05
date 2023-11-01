import java.util.Scanner;

public class Pemilihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalHarga = 0;
        double diskon = 0;

        System.out.print("Masukkan jumlah item yang akan dibeli: ");
        int jumlahItem = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= jumlahItem; i++) {
            System.out.println("Item " + i + ":");
            System.out.print("Masukkan nama barang: ");
            String namaBarang = input.nextLine();
            System.out.print("Masukkan harga item: Rp ");
            double harga = input.nextDouble();
            input.nextLine();

            if (harga > 0) {
                totalHarga += harga;
            } else {
                System.out.println("Harga item tidak valid. Harga item harus lebih dari 0.");
                i--;
            }
        }

        if (totalHarga >= 500000) {
            diskon = 0.2 * totalHarga;
        } else if (totalHarga >= 100000) {
            diskon = 0.05 * totalHarga;
        }

        double totalBayar = totalHarga - diskon;

        System.out.println("Total Belanja: Rp " + totalHarga);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total Bayar: Rp " + totalBayar);
    }
}
