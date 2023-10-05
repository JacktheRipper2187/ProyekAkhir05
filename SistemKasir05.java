import java.util.Scanner;
public class SistemKasir05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Barang : ");
        String item = input.nextLine();
        System.out.println("Harga Barang : ");
        int harga = input.nextInt();
        System.out.println("Jumlah Barang : ");
        int kuantitas = input.nextInt();
        int total = harga * kuantitas;
        System.out.println("Total Belanja : \n" + kuantitas +" " + item + "Seharga Rp" + total);
    }
}
