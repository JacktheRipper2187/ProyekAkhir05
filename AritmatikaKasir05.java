import java.util.Scanner;

public class AritmatikaKasir05 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String menu;
        int harga, jmlBeli;
        double diskon, total, bayar, jmlDis;

        System.out.print("Masukkan Menu yang dibeli: ");
        menu=input.nextLine();
        System.out.print("Masukkan Jumlah Beli: ");
        jmlBeli=input.nextInt();
        System.out.print("Masukkan Harga: ");
        harga=input.nextInt();
        System.out.print("Masukkan jumlah diskon");
        diskon=input.nextDouble();
        
        total=harga*jmlBeli;
        jmlDis=total*diskon;
        bayar=total-jmlDis;
        
        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus anda bayar " + bayar);
    }
}
