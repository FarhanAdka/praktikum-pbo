/*
Nama		: Farhan Adka Reynaldi
NIM			: 24060121130045
Lab			: PBO B2
Waktu		: 15-03-2023
Nama File	: MTimSepakbola.java
Deskripsi	: File main dari TimSepakbola.java
*/

class MTimSepakbola {
  public static void main(String[] args) {
    // TODO: Make an instance called 'liverpool' -> use constructor which you have made before
	TimSepakbola t1;
	t1= new TimSepakbola('liverpool',7,true);
	
    
    // TODO: Make an instance called 'manchesterUnited' -> use constructor which you have made before
    TimSepakbola t2;
	t2= new TimSepakbola('manchesterUnited',0,true);

    // TODO: call startTandingBola()
	startTandingBola(t1);
		

		// Assume that liverpool wins against manchesterUnited 7 - 0
    for (int i = 0; i < 7; i++) {
  		liverpool.goal();

			// TODO: Replace [SKOR LIVERPOOL] and [SKOR MANCHESTERUNITED] with the correct METHOD
			// Code below should produce the output "Skor sementara: Liverpool 7 - 0 Manchester United"
			System.out.println("Skor sementara: " + liverpool.nama + " " + liverpool.skor + " - " + manchesterUnited.skor + " " + manchesterUnited.nama);
    }

		// TODO: call endTandingBola()
		endTandingBola(t1);
  }
}

/* 
Expected output:

Pertandingan antara Liverpool dan Manchester United dimulai!

Skor sementara: Liverpool 1 - 0 Manchester United
Skor sementara: Liverpool 2 - 0 Manchester United
Skor sementara: Liverpool 3 - 0 Manchester United
Skor sementara: Liverpool 4 - 0 Manchester United
Skor sementara: Liverpool 5 - 0 Manchester United
Skor sementara: Liverpool 6 - 0 Manchester United
Skor sementara: Liverpool 7 - 0 Manchester United

Pertandingan antara Manchester United dan Liverpool selesai!
*/