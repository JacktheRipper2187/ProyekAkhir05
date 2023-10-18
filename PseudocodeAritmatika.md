Pseudocode

Algoritma : Aritmatika_Kasir_05

Deklarasi :
Menu= String
harga, jmlBeli= int
diskon, total, bayar, jmlDis= double

Prosedur :
1. Print "Masukkan Menu yang dibeli:"
2. Read input dan simpan dalam variabel menu
3. Print "Masukkan Jumlah Beli:"
4. Read input dan simpan dalam variabel jmIBeli
5. Print "Masukkan Harga:"
6. Read input dan simpan dalam variabel harga
7. Print "Masukkan jumlah diskon:"
8. Read input dan simpan dalam variabel diskon
9. total= harga * jmIBeli
10. jmDis= total * diskon
11. bayar= total - jmDis
12. Print "Diskon yang anda dapatkan adalah " + jmDis
13. Print "Jumlah yang harus anda bayar " + bayar