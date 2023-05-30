/*
Nama		: Farhan Adka Reynaldi
NIM			: 24060121130045
Lab			: PBO B2
Waktu		: 17-05-2023
Nama File	: BangunDatarGeneric.java
Deskripsi	: kelas konstruksi generic untuk BangunDatar
*/
public class BangunDatarGeneric<T1234 extends BangunDatar>{
	private T1234 bangunDatar;
	
	public void set(T1234 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T1234 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
	//Ketika mengubah 'T' menjadi 'T1234', program tetap berjalan tanpa ada perubahan berarti
	//Dapat disimpulkan bahwa 'T' hanyalah variabel yang digunakan untuk menyimpan sebuah value saja
}