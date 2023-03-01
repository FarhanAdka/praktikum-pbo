/*
Nama		: Farhan Adka Reynaldi
NIM			: 24060121130045
Lab			: PBO B2
Waktu		: 01-03-2023
Nama File	: OperasiTitik.java
Deskripsi	: File realisasi dari operasi titik
*/

class OperasiTitik{
	private void refleksiSumbuX(Titik titik){
		double ordinat = titik.getOrdinat();
		ordinat = ordinat * -1;
		titik.setOrdinat(ordinat);
	}
	private void refleksiSumbuY(Titik titik){
		double  absis = titik.getAbsis();
		absis = absis * -1;
		titik.setAbsis(absis);
	}
	public Titik refleksiX(Titik titik){
		refleksiSumbuX(titik);
		return titik;
	}
	public Titik refleksiY(Titik titik){
		refleksiSumbuX(titik);
		return titik;
	}
}