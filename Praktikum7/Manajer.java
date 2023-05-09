/*
Nama		: Farhan Adka Reynaldi
NIM			: 24060121130045
Lab			: PBO B2
Waktu		: 09-05-2023
Nama File	: Manajer.java
Deskripsi	: File subclass dari Pegawai
*/

public class Manajer extends Pegawai{
	// Attribute Manajer (overiding Pegawai)
	protected int tunjangan = 700000;
	
	// Method mengisi nama Manajer
	public Manajer(String name){
		nama = name;
	}
	
	// Method menampilkan nama, gaji pokok Pegawai, dan tunjangan Manajer
	public void tampilData(){
		System.out.println("Nama = "+nama+", Gaji pokok : "+gajiPokok+", Tunjangan : "+tunjangan);
	}
}