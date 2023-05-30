/*
Nama		: Farhan Adka Reynaldi
NIM			: 24060121130045
Lab			: PBO B2
Waktu		: 17-05-2023
Nama File	: BangunDatarGenericTest.java
Deskripsi	: main class untuk generic bangun datar
*/
public class BangunDatarGenericTest{
	public static void main(String[] args){
		Lingkaran l = new Lingkaran(2);
		BangunDatarGeneric<Lingkaran> bdg= new BangunDatarGeneric<Lingkaran>();
		bdg.set(l);
		System.out.println("Keliling lingkaran : "+bdg.hitungKeliling());
		System.out.println("tipe generic: "+bdg.get().getClass().getName());
	}
}