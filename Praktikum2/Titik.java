/*
Nama		: Farhan Adka Reynaldi
NIM			: 24060121130045
Lab			: PBO B2
Waktu		: 21-02-2023
Nama File	: Titik.java
Deskripsi	: File java dari ADT titik
*/
class Titik{

	private double absis;
	private double ordinat;
	static double counterTitik;
	
	Titik(){
		absis=0.0;
		ordinat=0.0;
		counterTitik++;
	}
	
	Titik(double a, double b){
		absis=a;
		ordinat=b;
		counterTitik++;
	}

	public void setAbsis(double a){
		absis=a;
	}

	public double getAbsis(){
		return absis;
	}
	
	
	public void setOrdinat(double b){
		ordinat=b;
	}
	
	public double getOrdinat(){
		return ordinat;
	}
	
	public double getCounterTitik(){
		return counterTitik;
	}
}