/**
* File : Kubus.java
* Penulis : Farhan Adka Reynaldi
* NIM : 24060121130045
* Kelas : PBO B2
* Deskripsi: representasi dari objek Kubus
* Tanggal : 21 Maret 2023
*/
package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {

    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan) {
        this.permukaan = permukaan;
    }

    public double hitungVolume() {
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi * panjangSisi;
    }

    public double hitungLuasAlas() {
        return permukaan.hitungLuas();
    }

}
