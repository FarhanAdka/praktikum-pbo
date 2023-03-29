 /*
Nama		: Farhan Adka Reynaldi
NIM			: 24060121130045
Lab			: PBO B2
Waktu		: 28-03-2023
Nama File	: MBujurSangkar.java
Deskripsi	: Kelas yang mengimpelemntasikan cara menghitung luas bujur sangkar
*/

import java.util.Scanner;

class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah " +bs.hitungLuas(sisi));
    }
}