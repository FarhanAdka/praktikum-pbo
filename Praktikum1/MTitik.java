/*
Nama		: Farhan Adka Reynaldi
NIM			: 24060121130045
Lab			: PBO B2
Waktu		: 21-02-2023
Nama File	: MTitik.java
Deskripsi	: File main dari ADT titik
*/

class MTitik{
	public static void main(String[] args){
		Titik t1=new Titik();
		t1.setAbsis(1);
		t1.setOrdinat(2);
		
		Titik t2=new Titik();
		t2.setAbsis(3);
		t2.setOrdinat(4);
		
		Titik t3;
		t3=new Titik(5,6);
		
		int counterTitik=t1.getCounterTitik();
		
		System.out.println("Jumlah objek titik="+counterTitik);
		System.out.println("t1("+t1.getAbsis()+","+t1.getOrdinat()+")");
		System.out.println("t2("+t2.getAbsis()+","+t2.getOrdinat()+")");
		System.out.println("t3("+t3.getAbsis()+","+t3.getOrdinat()+")");
	}
}