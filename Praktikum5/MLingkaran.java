/*
Nama		: Farhan Adka Reynaldi
NIM			: 24060121130045
Lab			: PBO B2
Waktu		: 28-03-2023
Nama File	: MLingkaran.java
Deskripsi	: File implementasi cara menghitung luas lingkaran
*/

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari lingkaran: ");
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari "+ jejari + " satuan adalah " + l.hitungLuas());
    }
}