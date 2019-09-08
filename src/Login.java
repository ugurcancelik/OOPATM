import java.util.Scanner;

public class Login {                 //-->> buradaki kucuk harfli hesap referans Hesap classindan cagirmak icin.
public boolean login (Hesap hesap) { //-->> login methodu kurdum. normalde "int a" gibi bisey yaziyoduk ancak simdi buraya obje gonderdigimiz icin Hesap yazdik yani class in adini.
	Scanner scanner=new Scanner(System.in);
	String kullanici_adi;
	String parola;
	 System.out.print("Kullanici adi: ");
	 kullanici_adi=scanner.nextLine();
	 
	 System.out.print("Parola: ");
	 parola=scanner.nextLine();
	 
	 if(hesap.getKullanici_adi().equals(kullanici_adi)&& hesap.getParola().equals(parola)) {
		 return true;
	 }
	 else {
		 return false;
	 }
}
}
