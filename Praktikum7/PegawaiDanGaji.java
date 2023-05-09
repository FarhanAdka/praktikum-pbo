/*
Nama		: Farhan Adka Reynaldi
NIM			: 24060121130045
Lab			: PBO B2
Waktu		: 09-05-2023
Nama File	: PegawaiDanGaji.java
Deskripsi	: File main dari Pegawai
*/

public class PegawaiDanGaji{
	public static void main(String[] args){
		Pegawai pegawai1 = new Programmer("Mira");
		Pegawai pegawai2 = new Manajer("Joko");
		Pegawai pegawai3 = new Manajer("Argo");
		
		Payroll payroll = new Payroll();
		payroll.cetakGaji(pegawai1);
		payroll.cetakGaji(pegawai2);
		payroll.cetakGaji(pegawai3);
	}
}