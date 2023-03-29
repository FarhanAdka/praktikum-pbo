 /*
Nama		: Farhan Adka Reynaldi
NIM			: 24060121130045
Lab			: PBO B2
Waktu		: 28-03-2023
Nama File	: MBujurSangkar.java
Deskripsi	: Kelas yang mengimpelemntasikan cara menghitung luas bujur sangkar
*/

import static java.lang.Math.PI;

class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }

    public double hitungLuas() {
        return PI * jejari * jejari;
    }
}