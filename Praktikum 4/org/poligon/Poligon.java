/**
* File : Poligon.java
* Penulis : Farhan Adka Reynaldi
* NIM : 24060121130045
* Kelas : PBO B2
* Deskripsi: representasi dasar dari objek poligon(segi banyak)
* Tanggal : 21 Maret 2023
*/
package org.poligon;

public class Poligon {

    protected int jumlahSisi;

    public Poligon() {
        this.jumlahSisi = 0;
    }

    public void setJumlahSisi(int jumlahSisi) {
        this.jumlahSisi = jumlahSisi;
    }

    public int getJumlahSisi() {
        return this.jumlahSisi;
    }
}
