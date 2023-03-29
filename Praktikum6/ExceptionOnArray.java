 /*
Nama		: Farhan Adka Reynaldi
NIM			: 24060121130045
Lab			: PBO B2
Waktu		: 29-03-2023
Nama File	: ExceptionOnArray.java
Deskripsi	: Program penggunaan eksepsi menggunakan class library Java
*/

public class ExceptionOnArray{
	public static void main(String[] args){
		//instansiasi object array integer
		Integer[] arrayInteger=new Integer[4];
		try{
			arrayInteger[2]=11;
			arrayInteger[4]=10;
		}
		catch(ArrayIndexOutOfBoundsException exception){
			exception.printStackTrace();
		}
		finally{
			System.out.println("Clean up code...");
		}
	}
}