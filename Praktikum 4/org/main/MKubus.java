/**
* File : MKubus.java
* Penulis : Farhan Adka Reynaldi
* NIM : 24060121130045
* Kelas : PBO B2
* Deskripsi: file main dari kubus
* Tanggal : 21 Maret 2023
*/

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus {

    public static void main(String[] args) {
        BujurSangkar bujursangkar = new BujurSangkar(10);
        Kubus kubus = new Kubus(bujursangkar);

        BujurSangkar bujurSangkar2 = new BujurSangkar(13);
        Kubus kubus2 = new Kubus(bujurSangkar2);

        System.out.println("Luas Alas Kubus 1: " + kubus.hitungLuasAlas());
        System.out.println("Volume Kubus 1: " + kubus.hitungVolume());

        System.out.println("Luas Alas Kubus 2: " + kubus2.hitungLuasAlas());
        System.out.println("Volume Kubus 2: " + kubus2.hitungVolume());
    }

}
