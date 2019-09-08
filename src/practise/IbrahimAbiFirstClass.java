package practise;

public class IbrahimAbiFirstClass {
	public static void main(String[] args) {
		
		Araba araba1=new Araba();
		
		araba1.setRenk("Kirmizi");
		araba1.setMarka("Merco");
		araba1.setModel("C");
		araba1.setMotor("16V");
		
		/*System.out.println("Arabanin markasi: "+ araba1.getMarka());
		System.out.println("Arabanin rengi: "+araba1.getRenk());
		System.out.println("Arabanin modeli: "+ araba1.getModel());
		System.out.println("Arabanin motoru: "+ araba1.getMotor());
		*/
		
		// STRING MANIPULATION
		String school="Yusuf Kalkavan Anadolu Lisesi"; 
		System.out.println(school.length());          //-->> lenght 1 den baslar 1 den son  harfe kadar gider. 
		System.out.println(school.substring(0, 10)); //-->> karakterlerin baslama pozisyonu 0. sunstring de 0 dan baslar. 
		System.out.println(school.substring(6, 23));
		
		System.out.println(school.replace("Anadolu", "Super")); //-->> Anadolu nun yerine Superi replace ettik.
		
	}

}
