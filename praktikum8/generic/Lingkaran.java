/*
Nama		: Farhan Adka Reynaldi
NIM			: 24060121130045
Lab			: PBO B2
Waktu		: 17-05-2023
Nama File	: Lingkaran.java
Deskripsi	: implementasi Lingkaran sebagai BangunDatar
*/
public class Lingkaran extends BangunDatar{
	private double jejari;
	
	public Lingkaran(double jejari){
		this.jejari=jejari;
	}
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}