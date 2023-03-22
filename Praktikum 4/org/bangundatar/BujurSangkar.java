/**
* File : BujurSangkar.java
* Penulis : Farhan Adka Reynaldi
* NIM : 24060121130045
* Kelas : PBO B2
* Deskripsi: representasi dari objek bujur sangkar
* Tanggal : 21 Maret 2023
*/
package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{ 
    private double panjangSisi; 

    public BujurSangkar(double panjangSisi){ 
        this.jumlahSisi = 4; 
        this.panjangSisi = panjangSisi; 
    } 

    public double hitungLuas(){ 
        return panjangSisi * panjangSisi; 
    } 

    public double getPanjangSisi(){ 
        return this.panjangSisi; 
    } 
}
