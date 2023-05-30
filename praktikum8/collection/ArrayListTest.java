/*
Nama		: Farhan Adka Reynaldi
NIM			: 24060121130045
Lab			: PBO B2
Waktu		: 17-05-2023
Nama File	: ArrayListTest.java
Deskripsi	: program penggunaan objek ArrayList sebagai Collection
*/
import java.util.ArrayList;

public class ArrayListTest{
	public static void main(String[] args){
		//inisialisasi ArrayList yang hanya dapat berisi objek String
		ArrayList<String> strings=new ArrayList<String>();
		//menambah elemen
		strings.add("praktikum");
		strings.add("collection");
		strings.add("dan generics");
		//menghapus elemen
		//strings.remove("praktikum");
		for(String s: strings){
			System.out.print(s+" ");
		}
	}
}