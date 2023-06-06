/*
Nama		: Farhan Adka Reynaldi
NIM			: 24060121130045
Lab			: PBO B2
Waktu		: 05-06-2023
Nama File	: LambdaHashMap.java
Deskripsi	: Implementasi lambda pada Hash map, digunakan sebagai parameter pada method
*/

import java.util.HashMap;
import java.util.Map;

public class LambdaHashMap{
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121130045", "Farhan Adka Reynaldi");
        mahasiswaMap.put("24060121120001", "Muhammad Alif Mukhlish");
        mahasiswaMap.put("24060121140141", "Muhammad Afiat Yulianto");
		mahasiswaMap.put("24060121140095", "Wildan Adji Prabowo");
        mahasiswaMap.put("24060121140165", "Nanda Farrel Chevalerie");

        // Menggunakan ekspresi lambda untuk menampilkan key dan value
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}