/*
Nama		: Farhan Adka Reynaldi
NIM			: 24060121130045
Lab			: PBO B2
Waktu		: 17-05-2023
Nama File	: MapTest.java
Deskripsi	: Program yang menggunakan Generic untuk pasangan Kunci-Nilai
*/
import java.util.*;

public class MapTest{
	public static void main(String[] args){
		//kunci->integer, nilai-> string
		Map<Integer,String> map = new HashMap<Integer,String>();
		//menempatkan elemen kunci dan nilai
		map.put(1, "satu");
		map.put(2, "dua");
		//mengambil elemen pertama
		System.out.println(map.get(1));
		//mengambil keseluruhan kunci sebagai objek collection Set
		Set<Integer> key = map.keySet();
		//bagaimana iterasi untuk mengambil keseluruhan
		//nilai dari kunci? tulis pada laporan anda!
		//petunjuk: gunakan iterasi seperti program ArrayListTest
		
		//for digunakan untuk mendefinisikan k sebagai elemen dari key
		//kemudian mencetak ke layar dengan menggunakan k
		//operator get() digunakan untuk mendapatkan value ke
		for(Integer k:key){
			System.out.println(k+" "+map.get(k));
		}
	}
}