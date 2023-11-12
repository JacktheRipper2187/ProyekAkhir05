import java.util.Scanner;

public class Array105{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] menu = new String[5];
        int[] harga = new int[5];

        // menambah data menu
        menu[0] = "Mie Ayam";
        menu[1] = "Nasi Goreng";
        menu[2] = "Mie Goreng";
        menu[3] = "Sate Ayam";
        menu[4] = "Es Teh";

        // menambah data harga
        harga[0] = 10000;
        harga[1] = 15000;
        harga[2] = 10000;
        harga[3] = 12000;
        harga[4] = 5000;

        System.out.println("Daftar Menu");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i] + " - Rp." + harga[i]);            
        }
        
        System.out.print("Masukkan menu yang dibeli: ");
        String inputMenu = sc.nextLine();

        int indexMenu = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(inputMenu)) {
                indexMenu = i;
                break;
            }
        }
        
        System.out.print("Jumlah yang dibeli: ");
        int jmlMenu = sc.nextInt();

        if (indexMenu != -1) {
            System.out.println("Harga " + inputMenu + " adalah Rp. " + harga[indexMenu]);
        } else {
            System.out.println("Daftar menu tidak ditemukan");
        }
    }
}