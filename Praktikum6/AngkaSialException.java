 /*
Nama		: Farhan Adka Reynaldi
NIM			: 24060121130045
Lab			: PBO B2
Waktu		: 29-03-2023
Nama File	: AngkaSialException.java
Deskripsi	: Eksepsi buatan sendiri, menolak masukkan angka 13!
*/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial !!!");
	}
}