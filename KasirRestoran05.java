import java.util.Scanner;

public class KasirRestoran05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String menu;
        int harga, jmlBeli, total, bayar;
        double diskon=0;

        System.out.print("Masukkan Menu yang dibeli: ");
        menu=input.nextLine();
        System.out.print("Masukkan Jumlah Beli: ");
        jmlBeli=input.nextInt();
        System.out.print("Masukkan Harga: ");
        harga=input.nextInt();
        
        total=harga*jmlBeli;

        if (total >= 500000){
            diskon = 0.2 * total;
        } else if (total >=100000){
            diskon = 0.05 * total;
        }else {
            diskon = 0;
        }

        bayar=total-(int)diskon;
    
        System.out.println("Total Belanja: " + total);
        System.out.println("DIskon: " + (int)diskon);
        System.out.println("Total Bayar: " + bayar);
    }    
}
