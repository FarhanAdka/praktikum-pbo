/*
Nama		: Farhan Adka Reynaldi
NIM			: 24060121130045
Lab			: PBO B2
Waktu		: 09-05-2023
Nama File	: Programmer.java
Deskripsi	: File subclass Pegawai
*/

public class Programmer extends Pegawai{
	// Attribute Programmer (overiding Pegawai)
	protected int bonus = 450000;
	
	// Method mengisi nama Programmer
	public Programmer(String name){
		nama = name;
	}
	
	// Method menampilkan nama, gaji pokok Pegawai, dan bonus Programmer
	public void tampilData(){
		System.out.println("Nama = "+nama+", Gaji pokok : "+gajiPokok+", Bonus : "+bonus);
	}
}