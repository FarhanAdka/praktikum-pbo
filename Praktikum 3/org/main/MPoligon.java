/**
* File : MPoligon.java
* Penulis : Farhan Adka Reynaldi
* NIM : 24060121130045
* Kelas : PBO B2
* Deskripsi: driver class untuk poligon, persegi panjang, dan segitiga
* Tanggal : 8 Maret 2023
*/

package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		PersegiPanjang persegi=new PersegiPanjang(10,10,4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
	
		Segitiga segitiga=new Segitiga(4,8,3);
		segitiga.printInfo();
		System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
	}
}