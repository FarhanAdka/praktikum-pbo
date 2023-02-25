/*
Nama		: Farhan Adka Reynaldi
NIM			: 24060121130045
Lab			: PBO B2
Waktu		: 21-02-2023
Nama File	: Titik.java
Deskripsi	: File java dari ADT titik
*/
class Titik{

	int absis;
	int ordinat;
	static int counterTitik;
	
	Titik(){
		absis=0;
		ordinat=0;
		counterTitik++;
	}
	
	Titik(int a, int b){
		absis=a;
		ordinat=b;
		counterTitik++;
	}

	void setAbsis(int a){
		absis=a;
	}

	int getAbsis(){
		return absis;
	}
	
	
	void setOrdinat(int b){
		ordinat=b;
	}
	
	int getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}
}