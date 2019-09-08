
public class MainAtm {
	public static void main(String[] args) {
		// OOP kullanarak ATM Programi Yapma
		// Login Class i kullanici girisini kontrol edecek
		//Hesap Class i da Hesap Islemlerini Yapacak
		//ATM ise atm miziz calistiracak
		
		
		ATM atm=new ATM();
		Hesap hesap=new Hesap("Ugurcan Celik","12345",2000);
		
		atm.calis(hesap); //-->> ana fonksiyonlardan biri yoksa alttaki prog cikiliyor basilacak.metodu boyle cagirabiliyorum. calis burda metod
		
		System.out.println("Programdan Cikiliyor...");
		
	}

}
