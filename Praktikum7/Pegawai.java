/*
Nama		: Farhan Adka Reynaldi
NIM			: 24060121130045
Lab			: PBO B2
Waktu		: 09-05-2023
Nama File	: Pegawai.java
Deskripsi	: File superclass dari Manajer dan Programmmer
*/

public class Pegawai{
	// Atribute Pegawai
	protected String nama;
	protected int gajiPokok = 5000000;
	
	// Method memberi nama Pegawai
	public void setNama(String name){
		nama = name;
	}
	
	// Method menampilkan nama dan gaji pokok pegawai
	public void tampilData(){
		System.out.println("Nama = "+nama+", Gaji pokok : "+gajiPokok);
	}
}